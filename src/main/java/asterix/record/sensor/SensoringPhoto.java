package asterix.record.sensor;

import asterix.record.ObservationBasis;
import com.alibaba.fastjson.JSONObject;

public class SensoringPhoto extends ObservationBasis {
    private String filepath;//filepath: string,

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
