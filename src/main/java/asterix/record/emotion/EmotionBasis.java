package asterix.record.emotion;

import com.alibaba.fastjson.JSONObject;

public class EmotionBasis {
    private String userId; //userId: string, --primary key string for user, will be changed to uuid later
    private long timestamp; //timestamp: bigint, --primary key timestamp for observation
    private String name; //name: string?,
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
