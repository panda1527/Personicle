package asterix.record.observations.measurements.sensoring;

import com.alibaba.fastjson.JSONObject;

public class SensoringSoftInfo {
    private String softinfo; //softinfo: string,
    private String comments; //comments: string

    public String getSoftinfo() {
        return softinfo;
    }

    public void setSoftinfo(String softinfo) {
        this.softinfo = softinfo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
