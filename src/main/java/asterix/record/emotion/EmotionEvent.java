package asterix.record.emotion;

import asterix.record.EventBasis;
import com.alibaba.fastjson.JSONObject;

public class EmotionEvent extends EventBasis {
    private String category; // category: string,
    private String activity; // activity: string,
    private double strengthen; //strengthen: double,
    private double valence; // valence: double,
    private double getValence; //arousal: double

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
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

    public double getGetValence() {
        return getValence;
    }

    public void setGetValence(double getValence) {
        this.getValence = getValence;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
