package asterix.record.food;

import asterix.record.ObservationBasis;
import com.alibaba.fastjson.JSONObject;

public class FoodLog extends ObservationBasis {
    private String foodname; //foodname: string,
    private long weight; //weight: bigint,
    private double total_calories; //total_calories: double,
    private double latitude; // will be changed to position: point
    private double longitude;
    private int preference_star; //preference_star: int

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
