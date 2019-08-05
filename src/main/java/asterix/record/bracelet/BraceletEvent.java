package asterix.record.bracelet;

import com.alibaba.fastjson.JSONObject;

public class BraceletEvent {
    private String mac; //mac: string, --unique string for device, which can also be changed to deviceId
    private long timestamp; //timestamp: bigint, --primary key timestamp for observation, extraction date
    private String userName; //userName: string?,

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
