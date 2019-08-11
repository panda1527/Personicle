package asterix.record.observations.attributes.users;

import com.alibaba.fastjson.JSONObject;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserAttribute {
    private UUID attributeId; //attributeId: UUID, --primary key string for attribute of a user
    private String userId; //userId: string,
    private long timestamp; //timestamp: bigint,
    private String userName; //userName: string?,
    private LocalDateTime beginAt; //beginAt: datetime,
    private LocalDateTime endAt; //endAt: datetime,
    private String category; //category: string

    public UUID getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(UUID attributeId) {
        this.attributeId = attributeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
