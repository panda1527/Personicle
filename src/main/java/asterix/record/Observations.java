package asterix.record;

import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class Observations {
    private final UUID id;
    private String name;
    private UUID did;

    public Observations(UUID uuid, String name, UUID duuid) {
        this.id = uuid;
        this.name = name;
        this.did = duuid;
    }

    public Observations(String name, UUID duuid) {
        this(UUID.randomUUID(), name, duuid);
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

    public void setDid(UUID did) {
        this.did = did;
    }

    public UUID getDid() {
        return did;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
