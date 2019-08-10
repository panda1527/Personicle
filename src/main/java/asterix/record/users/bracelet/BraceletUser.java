package asterix.record.users.bracelet;

import asterix.record.users.PersonicleUser;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.UUID;

public class BraceletUser extends PersonicleUser {
    private int netId; //netId: int?,
    private String password; //password: string?,
    private String token; //token: string?,
    private String nickName; //nickName: string,
    private String avadar; //avadar: string,
    private int sex; //sex: int,
    private int weight; //weight: int,
    private int height; //height: int,
    private int target; //target: int,
    private String status; //status: string?,
    private String updateTime; //updateTime: string?
    private List<UUID> deviceIds; //deviceIds: [UUID]?,
    private List<String> macs; //macs: [string]?

    public int getNetId() {
        return netId;
    }

    public void setNetId(int netId) {
        this.netId = netId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvadar() {
        return avadar;
    }

    public void setAvadar(String avadar) {
        this.avadar = avadar;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public List<UUID> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<UUID> deviceIds) {
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
