package asterix.recordV1.sensor;

import asterix.recordV1.ObservationBasis;
import com.alibaba.fastjson.JSONObject;

public class SensoringSoftInfo extends ObservationBasis {
    private String softinfo;//softinfo: string,

    public String getSoftinfo() {
        return softinfo;
    }

    public void setSoftinfo(String softinfo) {
        this.softinfo = softinfo;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
