package asterix.record.events.emotion;

import asterix.record.events.PersonicleEvent;
import com.alibaba.fastjson.JSONObject;

public class EmotionEvent extends PersonicleEvent {
    private String category; //category: string,
    private double strengthen; //strengthen: double,
    private double valence; //valence: double,
    private double arousal; //arousal: double

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

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
