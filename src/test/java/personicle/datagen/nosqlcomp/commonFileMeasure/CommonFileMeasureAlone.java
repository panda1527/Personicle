package personicle.datagen.nosqlcomp.commonFileMeasure;

import asterix.recordV2.wrapper.Uuid;
import com.alibaba.fastjson.JSONObject;
import personicle.datagen.nosqlcomp.sensoring.Spatial3DPoint;
import personicle.datagen.nosqlcomp.sensoring.sensoringCP.SensoringCP;

public class CommonFileMeasureAlone {
    private Uuid deviceId;
    private Long timestamp;
    private String userName;
    private String file_category;
    private String filepath;
    private String comments;

    public CommonFileMeasureAlone(CommonFileMeasure p) {
        this.deviceId = p.getDeviceId();
        this.timestamp = p.getTimestamp();
        this.userName = p.getUserName();
        this.file_category = p.getFile_category();
        this.filepath = p.getFilepath();
        this.comments = p.getComments();
    }

    public CommonFileMeasureAlone() {
    }

    public Uuid getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Uuid deviceId) {
        this.deviceId = deviceId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComments() {
        return comments;
    }

    public String getFile_category() {
        return file_category;
    }

    public void setFile_category(String file_category) {
        this.file_category = file_category;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
