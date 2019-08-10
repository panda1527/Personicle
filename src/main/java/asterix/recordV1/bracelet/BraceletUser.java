package asterix.recordV1.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class BraceletUser {
    private String userId; //userId: string,
    private String userName; //userName: string?,
    private List<String> deviceIds; //deviceIds: [string],
    private List<String> macs; //macs: [string]

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    public List<String> getMacs() {
        return macs;
    }

    public void setMacs(List<String> macs) {
        this.macs = macs;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
