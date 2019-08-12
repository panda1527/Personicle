package asterix.record.observations.measurements.sensoring;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class SensoringCP extends Measurement {
    private List<Spatial3DPoint> accelerometer; //accelerometer: [Spatial3DPoint],
    private List<Spatial3DPoint> gyroscope;//gyroscope: [Spatial3DPoint],
    private String comments; //comments: string

    public List<Spatial3DPoint> getAccelerometer() {
        return accelerometer;
    }

    public void setAccelerometer(List<Spatial3DPoint> accelerometer) {
        this.accelerometer = accelerometer;
    }

    public List<Spatial3DPoint> getGyroscope() {
        return gyroscope;
    }

    public void setGyroscope(List<Spatial3DPoint> gyroscope) {
        this.gyroscope = gyroscope;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
