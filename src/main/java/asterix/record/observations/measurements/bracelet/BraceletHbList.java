package asterix.record.observations.measurements.bracelet;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class BraceletHbList extends Measurement {
    private int netId; //netId: int?,
    private String userName; //userName: string?,
    private String mac; //mac: string?,
    private int dbp; //dbp: int,          -- default (0)
    private int sbp; //sbp: int,          -- default (0)
    private int heartRate; //heartRate: int,    -- default (0)
    private String dateString; //dateString: string?,
    private String status; //status: string?,
    private long createTime; //createTime: bigint?,
    private long updateTime; //updateTime: bigint?

    public int getNetId() {
        return netId;
    }

    public void setNetId(int netId) {
        this.netId = netId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getDbp() {
        return dbp;
    }

    public void setDbp(int dbp) {
        this.dbp = dbp;
    }

    public int getSbp() {
        return sbp;
    }

    public void setSbp(int sbp) {
        this.sbp = sbp;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
