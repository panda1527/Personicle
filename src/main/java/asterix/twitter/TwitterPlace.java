package asterix.twitter;

import com.alibaba.fastjson.JSONObject;
import org.apache.hyracks.storage.am.rtree.impls.Rectangle;

public class TwitterPlace {
    private String country; //country : string,
    private String country_code; //country_code : string,
    private String full_name; //full_name : string,
    private String id; //id : string,
    private String name; //name : string,
    private String place_type; //place_type : string,
    private Rectangle bounding_box; //bounding_box : rectangle

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace_type() {
        return place_type;
    }

    public void setPlace_type(String place_type) {
        this.place_type = place_type;
    }

    public Rectangle getBounding_box() {
        return bounding_box;
    }

    public void setBounding_box(Rectangle bounding_box) {
        this.bounding_box = bounding_box;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
