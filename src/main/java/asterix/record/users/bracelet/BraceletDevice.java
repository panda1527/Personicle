package asterix.record.users.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class BraceletDevice {
    private UUID deviceId; //deviceId: UUID, --guarantee identification in application, e.g., UUID
    private int netId; //netId: int?,
    private String userId; //userId: string?,
    private String userName; //userName: string?,
    private String uuid; //uuid: string?,
    private String name; //name: string?,
    private int rssi; //rssi: int,                    -- default (0)
    private String mac; //mac: string,
    private String manufacturerData; //manufacturerData: string?,
    private int isConnected; //isConnected: int,             -- default (0)
    private int selected; //selected: int,                -- default (0)
    private String status; //status: string?,
    private long updateTime; //updateTime: bigint?

    public UUID getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(UUID deviceId) {
        this.deviceId = deviceId;
    }

    public int getNetId() {
        return netId;
    }

    public void setNetId(int netId) {
        this.netId = netId;
    }

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getManufacturerData() {
        return manufacturerData;
    }

    public void setManufacturerData(String manufacturerData) {
        this.manufacturerData = manufacturerData;
    }

    public int getIsConnected() {
        return isConnected;
    }

    public void setIsConnected(int isConnected) {
        this.isConnected = isConnected;
    }

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
