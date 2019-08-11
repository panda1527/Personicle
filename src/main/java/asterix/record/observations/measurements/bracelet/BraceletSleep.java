package asterix.record.observations.measurements.bracelet;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class BraceletSleep extends Measurement {
    private int netId; //netId: int?,
    private String userName; //userName: string?,
    private String mac; //mac: string?,
    private String date; //date: string,
    private long startTime; //startTime: bigint,    -- default (0)
    private long endTime; //endTime: bigint,      -- default (0)
    private int runMin; //runMin: int,          -- default (0)
    private int restlessMin; //restlessMin: int,     -- default (0)
    private int deepMin; //deepMin: int,         -- default (0)
    private String stepsInHour; //stepsInHour: string,  -- default ("[]")
    private String dateString; //dateString: string?,
    private String status; //status: string?,
    private long createTime; //createTime: bigint?,
    private long updateTime; //updateTime: bigint

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getRunMin() {
        return runMin;
    }

    public void setRunMin(int runMin) {
        this.runMin = runMin;
    }

    public int getRestlessMin() {
        return restlessMin;
    }

    public void setRestlessMin(int restlessMin) {
        this.restlessMin = restlessMin;
    }

    public int getDeepMin() {
        return deepMin;
    }

    public void setDeepMin(int deepMin) {
        this.deepMin = deepMin;
    }

    public String getStepsInHour() {
        return stepsInHour;
    }

    public void setStepsInHour(String stepsInHour) {
        this.stepsInHour = stepsInHour;
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
