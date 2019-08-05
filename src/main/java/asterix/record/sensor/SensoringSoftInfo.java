package asterix.record.sensor;

import com.alibaba.fastjson.JSONObject;

public class SensoringSoftInfo {
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
