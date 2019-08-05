package asterix.record;

import com.alibaba.fastjson.JSONObject;

import java.sql.Timestamp;

public class EventBasis {
    private String userId; //userId: string, --primary key string for user, will be changed to uuid later
    private long timestamp; //timestamp: bigint, --primary key timestamp for observation
    private String userName; //userName: string?,
    private Timestamp beginAt; //beginAt: datetime,
    private Timestamp endAt; //endAt: datetime,

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

    public Timestamp getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(Timestamp beginAt) {
        this.beginAt = beginAt;
    }

    public Timestamp getEndAt() {
        return endAt;
    }

    public void setEndAt(Timestamp endAt) {
        this.endAt = endAt;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
