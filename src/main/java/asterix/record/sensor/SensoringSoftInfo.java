package asterix.record.sensor;

import asterix.record.ObservationBasis;
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
