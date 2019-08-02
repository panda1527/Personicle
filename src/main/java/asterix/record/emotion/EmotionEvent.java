package asterix.record.emotion;

import com.alibaba.fastjson.JSONObject;

import java.sql.Timestamp;

public class EmotionEvent {
    private String userId; //userId: string, --primary key string for user, will be changed to uuid later
    private long timestamp; //timestamp: bigint, --primary key timestamp for observation
    private Timestamp beginAt; //beginAt: datetime,
    private Timestamp endAt; //endAt: datetime,
    private String category; // category: string,
    private double strengthen; //strengthen: double,
    private double valence; // valence: double,
    private double getValence; //arousal: double

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

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
