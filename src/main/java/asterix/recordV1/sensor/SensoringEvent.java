package asterix.recordV1.sensor;

import asterix.recordV1.EventBasis;
import com.alibaba.fastjson.JSONObject;

public class SensoringEvent extends EventBasis {
    private String category; //category: string,
    private String description; //description: string

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
