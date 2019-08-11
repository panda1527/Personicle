package asterix.record.observations.attributes.knowledge.food;

import asterix.record.observations.attributes.knowledge.KGAttribute;
import com.alibaba.fastjson.JSONObject;

public class FoodKGAttribute extends KGAttribute {
    private double calories; // calories: double,
    private double carbohydrate; //carbohydrate: double,
    private double fat; //fat: double,
    private double protein; //protein: double

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
