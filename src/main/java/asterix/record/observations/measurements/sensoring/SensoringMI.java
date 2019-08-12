package asterix.record.observations.measurements.sensoring;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class SensoringMI extends Measurement {
    private int heartrate; //heartrate: int,
    private int stepcount; //stepcount: int,
    private int comments; //comments: string

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public int getStepcount() {
        return stepcount;
    }

    public void setStepcount(int stepcount) {
        this.stepcount = stepcount;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
