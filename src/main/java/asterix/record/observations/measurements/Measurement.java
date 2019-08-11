package asterix.record.observations.measurements;

import com.alibaba.fastjson.JSONObject;

import java.time.LocalDateTime;
import java.util.UUID;

public class Measurement {
    private UUID measureId; //measureId: UUID,  --primary key string for measurement, UUID
    private String deviceId; //deviceId: string, derived from a device id (from UUID to string)
    private long timestamp; //timestamp: bigint,
    private String userName; //userName: string?,
    private LocalDateTime beginAt; //beginAt: datetime?,
    private LocalDateTime endAt; //endAt: datetime?,
    private String category; //category: string,
    private String activity; //activity: string?,
    private String description; //description: string?

    public UUID getMeasureId() {
        return measureId;
    }

    public void setMeasureId(UUID measureId) {
        this.measureId = measureId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(LocalDateTime beginAt) {
        this.beginAt = beginAt;
    }

    public LocalDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
