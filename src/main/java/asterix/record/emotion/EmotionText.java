package asterix.record.emotion;

import asterix.record.ObservationBasis;
import com.alibaba.fastjson.JSONObject;

public class EmotionText extends ObservationBasis {
    private String message; //message: string,

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
