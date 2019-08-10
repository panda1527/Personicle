package asterix.recordV1.bracelet.innertype;

import com.alibaba.fastjson.JSONObject;

public class BraceletHRVAnalyze {
    private int emotion; //emotion: int,
    private int rr; //rr: int,
    private int fatigue; //fatigue: int,
    private int antigat; //antigat: int,
    private int nerve; //nerve: int,
    private String comment; //comment: string

    public int getEmotion() {
        return emotion;
    }

    public void setEmotion(int emotion) {
        this.emotion = emotion;
    }

    public int getRr() {
        return rr;
    }

    public void setRr(int rr) {
        this.rr = rr;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int getAntigat() {
        return antigat;
    }

    public void setAntigat(int antigat) {
        this.antigat = antigat;
    }

    public int getNerve() {
        return nerve;
    }

    public void setNerve(int nerve) {
        this.nerve = nerve;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
