package asterix.record.bracelet;

import com.alibaba.fastjson.JSONObject;

public class BraceletTestBasis extends BraceletObservation {
    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
