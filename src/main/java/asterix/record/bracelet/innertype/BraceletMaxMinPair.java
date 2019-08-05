package asterix.record.bracelet.innertype;

import com.alibaba.fastjson.JSONObject;

public class BraceletMaxMinPair {
    private int max; //max: int,
    private int min; //min: int

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
