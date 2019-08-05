package asterix.record.bracelet;

import com.alibaba.fastjson.JSONObject;

public class BraceletObservation {
    private String mac; //mac: string, --primary key string for device, can also be defined with deviceId.
    private long timestamp; //timestamp: bigint, --primary key timestamp for observation
    private String userName; //name: string?,

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
