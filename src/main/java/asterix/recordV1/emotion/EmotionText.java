package asterix.recordV1.emotion;

import asterix.recordV1.ObservationBasis;
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
