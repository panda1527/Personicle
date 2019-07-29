package asterix.record;

import java.util.UUID;

import com.alibaba.fastjson.JSONObject;

public class Users {
    private final UUID id;
    private String name;

    public Users(UUID uuid, String name) {
        this.id = uuid;
        this.name = name;
    }

    public Users(String name) {
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
