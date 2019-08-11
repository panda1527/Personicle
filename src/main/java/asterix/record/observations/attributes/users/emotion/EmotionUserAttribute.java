package asterix.record.observations.attributes.users.emotion;

import asterix.record.observations.attributes.users.UserAttribute;
import com.alibaba.fastjson.JSONObject;

public class EmotionUserAttribute extends UserAttribute {
    private double strengthen; //strengthen: double,
    private double valence; //valence: double,
    private double arousal; //arousal: double

    public double getStrengthen() {
        return strengthen;
    }

    public void setStrengthen(double strengthen) {
        this.strengthen = strengthen;
    }

    public double getValence() {
        return valence;
    }

    public void setValence(double valence) {
        this.valence = valence;
    }

    public double getArousal() {
        return arousal;
    }

    public void setArousal(double arousal) {
        this.arousal = arousal;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
