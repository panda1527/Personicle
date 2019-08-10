package asterix.recordV1;

import java.util.ArrayList;
import java.util.List;

public class RecordEfficiencyTest {

    private static final int DEFAULT_ROUND = (1 << 30);

    public static void main(String[] args) {
        List<Record> records = new ArrayList<>();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < DEFAULT_ROUND; i++) {
            Record record = new Record();
            records.add(record);
        }
        long end = System.currentTimeMillis();
        System.out.println("Init: " + (end - begin));
        begin = System.currentTimeMillis();

        for (Record r : records) {
            for (int i = 0; i < Record.DEFAULT_RECORD_WIDE; i++) {
                r.get()[i] = (byte) i;
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Reset: " + (end - begin));
        begin = System.currentTimeMillis();

        for (int i = 0; i < Record.DEFAULT_RECORD_WIDE; i++) {
            System.out.print(records.get(100).get()[i] + " ");
            if (i % 32 == 0) {
                System.out.println();
            }
        }
    }
}
