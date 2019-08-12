package asterix.record.observations.measurements.food;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class FoodLog extends Measurement {
    private String foodname; //foodname: string,
    private double weight; //weight: double,
    private double total_calories; //total_calories: double,
    private double latitude; //latitude: double,
    private double longitude; //longitude: double,
    private int preference_star; //preference_star: int,
    private String comments; //comments: string

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotal_calories() {
        return total_calories;
    }

    public void setTotal_calories(double total_calories) {
        this.total_calories = total_calories;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getPreference_star() {
        return preference_star;
    }

    public void setPreference_star(int preference_star) {
        this.preference_star = preference_star;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
