package asterix.recordV1.sensor;

import asterix.recordV1.ObservationBasis;
import com.alibaba.fastjson.JSONObject;

public class SensoringMI extends ObservationBasis {
    private int heartrate; //heartrate: int,
    private int stepcount; //stepcount: int,

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

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
