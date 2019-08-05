package asterix.record.bracelet;

import com.alibaba.fastjson.JSONObject;

public class BraceletDaylyInfo extends BraceletObservation {
    private int freq; // freq: int,

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
