package asterix.record.sensor;

import asterix.record.ObservationBasis;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class SensoringCP extends ObservationBasis {

    private List<Spatial3DPoint> acclerometer;//accelerometer: [Spatial3DPoint],

    private List<Spatial3DPoint> gyroscope;//gyroscope: [Spatial3DPoint],

    public List<Spatial3DPoint> getAcclerometer() {
        return acclerometer;
    }

    public void setAcclerometer(List<Spatial3DPoint> acclerometer) {
        this.acclerometer = acclerometer;
    }

    public List<Spatial3DPoint> getGyroscope() {
        return gyroscope;
    }

    public void setGyroscope(List<Spatial3DPoint> gyroscope) {
        this.gyroscope = gyroscope;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
