package asterix.recordV1.bracelet;

import com.alibaba.fastjson.JSONObject;

public class BraceletTestBasis extends BraceletObservation {
    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
