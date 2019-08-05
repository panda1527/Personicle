package asterix.record.food;

import com.alibaba.fastjson.JSONObject;

public class Food {
    private String foodname; //foodname: string, --primary key
    private double calories; //calories: double,
    private double carbohydrate; //carbohydrate: bigint,
    private double fat; //fat: bigint,
    private double protein;//protein: bigint

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getProtein() {
        return protein;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
