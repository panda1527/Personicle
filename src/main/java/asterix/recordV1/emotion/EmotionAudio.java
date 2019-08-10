package asterix.recordV1.emotion;

import asterix.recordV1.ObservationBasis;
import com.alibaba.fastjson.JSONObject;

public class EmotionAudio extends ObservationBasis {
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
