package asterix.record.observations.measurements.bracelet;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class BraceletHeartRateBloodPressure extends Measurement {
    private int netId; //netId: int?,
    private String userName; //userName: string?,
    private String mac; //mac: string?,
    private int mainSec; //mainSec: int,      -- default (0)
    private int mainDate; //mainDate: int,     -- default (0)
    private int hour; //hour: int,         -- default (0)
    private int min; //min: int,          -- default (0)
    private int sec; //sec: int,          -- default (0)
    private int hrm; //hrm: int,          -- default (0)
    private int sbp; //sbp: int,          -- default (0)
    private int dbp; //dbp: int,          -- default (0)
    private int spo2; //spo2: int,         -- default (0)
    private int fatigue; //fatigue: int,      -- default (0)
    private int rsv3; //rsv3: int,         -- default (0)
    private String dateString; //dateString: string?,
    private String status; //status: string?,
    private long createTime;//createTime: bigint?,
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

    public int getMainSec() {
        return mainSec;
    }

    public void setMainSec(int mainSec) {
        this.mainSec = mainSec;
    }

    public int getMainDate() {
        return mainDate;
    }

    public void setMainDate(int mainDate) {
        this.mainDate = mainDate;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getHrm() {
        return hrm;
    }

    public void setHrm(int hrm) {
        this.hrm = hrm;
    }

    public int getSbp() {
        return sbp;
    }

    public void setSbp(int sbp) {
        this.sbp = sbp;
    }

    public int getDbp() {
        return dbp;
    }

    public void setDbp(int dbp) {
        this.dbp = dbp;
    }

    public int getSpo2() {
        return spo2;
    }

    public void setSpo2(int spo2) {
        this.spo2 = spo2;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int getRsv3() {
        return rsv3;
    }

    public void setRsv3(int rsv3) {
        this.rsv3 = rsv3;
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
