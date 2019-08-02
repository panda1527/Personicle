package asterix.record.emotion;

import com.alibaba.fastjson.JSONObject;

public class EmotionText extends EmotionBasis {
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
