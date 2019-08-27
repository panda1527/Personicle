package asterix.record.events.behavoir;

import asterix.record.events.PersonicleEvent;
import com.alibaba.fastjson.JSONObject;

public class BehaviorEvent extends PersonicleEvent {
    private String category; //category: string,
    private String activity; //activity: string,
    private String description; //description: string

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
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
