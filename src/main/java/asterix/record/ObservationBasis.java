package asterix.record;

import com.alibaba.fastjson.JSONObject;

public class ObservationBasis {
    private String userId; //userId: string, --primary key string for user, will be changed to uuid later
    private long timestamp; //timestamp: bigint, --primary key timestamp for observation
    private String userName; //name: string?,
    private String comments; //comments: string

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

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
