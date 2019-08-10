package asterix.recordV1.bracelet;

import com.alibaba.fastjson.JSONObject;

public class BraceletDevice {
    private String deviceId; //deviceId: string, --guarantee identification in application, e.g., UUID
    private String name; //name: string,
    private String userId; //userId: string,
    private String userName; //userName: string?,
    private String netId; //netId: string,
    private String rssi; //rssi: string,
    private String mac; //mac: string,
    private String menufacturerData; //manufacturerData: string,
    private boolean isConnected; //isConnected: boolean,
    private boolean selected; //selected: boolean

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public String getRssi() {
        return rssi;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMenufacturerData() {
        return menufacturerData;
    }

    public void setMenufacturerData(String menufacturerData) {
        this.menufacturerData = menufacturerData;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
