package asterix.record.observations.measurements.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class BraceletRawDetail {
    private UUID id; //id: UUID,
    private BraceletRawList raw; //ecgId: UUID,
    private String content; //content: string?

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BraceletRawList getRaw() {
        return raw;
    }

    public void setRaw(BraceletRawList raw) {
        this.raw = raw;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
