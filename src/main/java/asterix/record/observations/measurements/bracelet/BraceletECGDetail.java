package asterix.record.observations.measurements.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class BraceletECGDetail {
    private UUID id; //id: UUID,
    private BraceletECGList ecg; //ecgId: UUID,
    private String content; //content: string?

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BraceletECGList getEcg() {
        return ecg;
    }

    public void setEcg(BraceletECGList ecg) {
        this.ecg = ecg;
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
