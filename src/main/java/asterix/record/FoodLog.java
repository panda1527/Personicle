package asterix.record;

import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class FoodLog {
    private UUID userId; //userId: string, --primary key string for user, will be changed to uuid later
    private long timestamp; //timestamp: bigint, --primary key timestamp for observation
    private String name; //name: string?,
    private String foodname; //foodname: string,
    private long weight; //weight: bigint,
    private double total_calories; //total_calories: double,
    private double latitude; // will be changed to position: point
    private double longitude;
    private int preference_star; //preference_star: int

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setTotal_calories(double total_calories) {
        this.total_calories = total_calories;
    }

    public double getTotal_calories() {
        return total_calories;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getWeight() {
        return weight;
    }

    public void setPreference_star(int reference_star) {
        this.preference_star = reference_star;
    }

    public int getPreference_star() {
        return preference_star;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
