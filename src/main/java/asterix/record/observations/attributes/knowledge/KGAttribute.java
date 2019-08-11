package asterix.record.observations.attributes.knowledge;

import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class KGAttribute {
    private UUID attributeId; //attributeId: UUID, -- primary key string for attribute of a knowledge
    private String name; //name: string,      -- foreign key of knowledge
    private long timestamp; //timestamp: bigint,
    private String category; //category: string

    public UUID getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(UUID attributeId) {
        this.attributeId = attributeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
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
