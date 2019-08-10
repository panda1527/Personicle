package asterix.record.causalities;

import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class Causality {
    private UUID causalityId; //causalityId: UUID,   --primary key string for measurement, UUID
    private UUID fromEVent; //fromEvent: UUID,     --foreign key referencing Event,
    private UUID toEvent; //toEvent:   UUID,     --foreign key referencing Event,
    private String condition; //condition: string?,
    private String description; //description: string?

    public UUID getCausalityId() {
        return causalityId;
    }

    public void setCausalityId(UUID causalityId) {
        this.causalityId = causalityId;
    }

    public UUID getFromEVent() {
        return fromEVent;
    }

    public void setFromEVent(UUID fromEVent) {
        this.fromEVent = fromEVent;
    }

    public UUID getToEvent() {
        return toEvent;
    }

    public void setToEvent(UUID toEvent) {
        this.toEvent = toEvent;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
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
