package asterix.record.observations.measurements.emotion;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class EmotionText extends Measurement {
    private String message; //message: string,
    private String comments; //comments: string

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
