package asterix.record.observations.measurements.sensoring;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class SensoringPhoto extends Measurement {
    private String filepath; //filepath: string,
    private String comments; //comments: string

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
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
