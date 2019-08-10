package asterix.recordV1;

import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class DataSources {
    private final UUID id;
    private String name;

    public DataSources(UUID uuid, String name) {
        this.id = uuid;
        this.name = name;
    }

    public DataSources(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
