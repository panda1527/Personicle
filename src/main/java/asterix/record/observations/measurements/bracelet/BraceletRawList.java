package asterix.record.observations.measurements.bracelet;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class BraceletRawList extends Measurement {
    private int netId; //netId: int?,
    private String userName; //userName: string?,
    private String mac; //mac: string?,
    private String tag; //tag: string?,
    private long startTime; //startTime: bigint?,
    private long endTime; //endTime: bigint?,
    private int count; //count: int,        -- default (0)
    private String rawDetailUrl; //rawDetailUrl: string?,
    private String dateString; //dateString: string?,
    private String status; //status: string?,
    private long createTime; //createTime: bigint?,
    private long updateTime; //updateTime:bigint

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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getRawDetailUrl() {
        return rawDetailUrl;
    }

    public void setRawDetailUrl(String rawDetailUrl) {
        this.rawDetailUrl = rawDetailUrl;
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
