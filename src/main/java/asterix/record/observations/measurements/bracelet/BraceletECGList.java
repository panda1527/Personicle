package asterix.record.observations.measurements.bracelet;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class BraceletECGList extends Measurement {
    private UUID id; //id: UUID,
    private int netId; //netId: int?,
    private String userName; //userName: string?,
    private String mac; //mac: string?,
    private int ecg; //ecg: int,          -- default (0)
    private int isTouched; //isTouched: int,    -- default (0)
    private int hr; //hr: int,           -- default (0)
    private int mood; //mood: int,         -- default (0)
    private int resp; //resp: int,         -- default (0)
    private int stress; //stress: int,       -- default (0)
    private int hrv; //hrv: int,          -- default (0)
    private int heartage; //heartage: int,     -- default (0)
    private int lfhf; //lfhf: int,         -- default (0)
    private int count; //count: int,        -- default (0)
    private String ecgDetailUrl; //ecgDetailUrl: string?,
    private String dateString; //dateString: string?,
    private String status; //status: string?,
    private long createTime; //createTime: bigint?,
    private long updateTime; //updateTime: bigint?

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public int getEcg() {
        return ecg;
    }

    public void setEcg(int ecg) {
        this.ecg = ecg;
    }

    public int getIsTouched() {
        return isTouched;
    }

    public void setIsTouched(int isTouched) {
        this.isTouched = isTouched;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getResp() {
        return resp;
    }

    public void setResp(int resp) {
        this.resp = resp;
    }

    public int getStress() {
        return stress;
    }

    public void setStress(int stress) {
        this.stress = stress;
    }

    public int getHrv() {
        return hrv;
    }

    public void setHrv(int hrv) {
        this.hrv = hrv;
    }

    public int getHeartage() {
        return heartage;
    }

    public void setHeartage(int heartage) {
        this.heartage = heartage;
    }

    public int getLfhf() {
        return lfhf;
    }

    public void setLfhf(int lfhf) {
        this.lfhf = lfhf;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getEcgDetailUrl() {
        return ecgDetailUrl;
    }

    public void setEcgDetailUrl(String ecgDetailUrl) {
        this.ecgDetailUrl = ecgDetailUrl;
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
