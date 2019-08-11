package asterix.record.observations.measurements.bracelet;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class BraceletStep extends Measurement {
    private int netId; // netId: int?,
    private String userName; // userName: string?,
    private String mac; // mac: string?,
    private String date; // date: string,
    private int sec; // sec: int,             -- default (0)
    private int runtime; // runtime: int,         -- default (0)
    private int step; // step: int,            -- default (0)
    private String stempsInHour; // stepsInHour: string,  -- default ("[]")
    private String dateString; // dateString: string?,
    private String status; // status: string?,
    private long createTime; // createTime: bigint?,
    private long updateTime; // updateTime: bigint

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

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getStempsInHour() {
        return stempsInHour;
    }

    public void setStempsInHour(String stempsInHour) {
        this.stempsInHour = stempsInHour;
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
