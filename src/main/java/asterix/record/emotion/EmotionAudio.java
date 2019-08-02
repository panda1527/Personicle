package asterix.record.emotion;

import com.alibaba.fastjson.JSONObject;

public class EmotionAudio extends EmotionBasis {
    private String path; //path: string,

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
