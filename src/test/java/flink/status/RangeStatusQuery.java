package flink.status;

import flink.filter.SlidingWindows;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.core.fs.FileSystem;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.timestamps.BoundedOutOfOrdernessTimestampExtractor;
import org.apache.flink.streaming.api.windowing.assigners.SlidingEventTimeWindows;
import org.apache.flink.streaming.api.windowing.time.Time;

public class RangeStatusQuery {
    static int streamN = 0;

    public static void main(String[] args) throws Exception {
        // Checking input parameters
        final ParameterTool params = ParameterTool.fromArgs(args);

        // set up the execution environment
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // make parameters available in the web interface
        System.out.println(
                "-input <path（necessary；-init <num> (record num)；-output <path> (optional)；-para <num> (optional)");
        env.getConfig().setGlobalJobParameters(params);
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
        // get input data
        DataStreamSource<String> Source;
        String input = params.get("input");
        String init = params.get("init");
        //        int num=Integer.parseInt(params.get("num"));
        if (input != null) {
            if (init != null) {
                System.out.println("Generating data set.");
                dataSource.Write.createStream(input, Integer.parseInt(init));
            }
            Source = env.readTextFile(input);
        } else {
            System.out.println("Please offer input path");
            return;
        }
        if (params.get("para") != null) {
            int parallelism = Integer.parseInt(params.get("para"));
            env.setParallelism(parallelism);
        }

        SingleOutputStreamOperator<Tuple4<Long, Integer, Double, Double>> reducedStream =
                Source.assignTimestampsAndWatermarks(
                        new BoundedOutOfOrdernessTimestampExtractor<String>(Time.milliseconds(0)) {
                            @Override public long extractTimestamp(String s) {
                                String[] tokens = s.split(" ");
                                long time = Long.parseLong(tokens[0]) * 1000;
                                return time;
                            }
                        }).flatMap(new SlidingWindows.Tokenizer()).keyBy(1)
                        //.window(TumblingEventTimeWindows.of(Time.seconds(1000)))
                        //.window(TumblingEventTimeWindows.of(Time.seconds(100)))
                        .window(SlidingEventTimeWindows.of(Time.seconds(1000), Time.seconds(100)))
                        .reduce(new ReduceFunction<Tuple4<Long, Integer, Double, Double>>() {
                            @Override public Tuple4<Long, Integer, Double, Double> reduce(
                                    Tuple4<Long, Integer, Double, Double> t1, Tuple4<Long, Integer, Double, Double> t2)
                                    throws Exception {
                                if (t1.f0 > t2.f0) {
                                    return t1;
                                } else {
                                    return t2;
                                }
                            }
                        });

        String output = params.get("output");
        if (output != null) {
            reducedStream.writeAsText(output, FileSystem.WriteMode.OVERWRITE);
        } else {
            System.out.println("Need output to sink.");
        }
        long startTime = System.currentTimeMillis();
        env.execute("Streaming WordCount");
        long endTime = System.currentTimeMillis();
        System.out.println(
                streamN + "records, 1000s window wide，100s sliding，" + env.getParallelism() + " threads; " + "Time" + (
                        endTime - startTime));
        System.out.println("RangeQuery Completed");
    }
}
