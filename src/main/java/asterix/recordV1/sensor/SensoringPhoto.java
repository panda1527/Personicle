package asterix.recordV1.sensor;

import asterix.recordV1.ObservationBasis;
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
