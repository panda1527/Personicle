package asterix.record.observations.measurements.emotion;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class EmotionECG extends Measurement {
    private List<Double> payload; //payload: [double],
    private String comments; //comments: string

    public List<Double> getPayload() {
        return payload;
    }

    public void setPayload(List<Double> payload) {
        this.payload = payload;
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
