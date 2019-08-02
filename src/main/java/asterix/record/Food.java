package asterix.record;

import com.alibaba.fastjson.JSONObject;

public class Food {
    private String foodname; //foodname: string, --primary key
    private double calories; //calories: double,
    private long carbohydrate; //carbohydrate: bigint,
    private long fat; //fat: bigint,
    private long protein;//protein: bigint

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

    public void setCarbohydrate(long carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public long getCarbohydrate() {
        return carbohydrate;
    }

    public void setFat(long fat) {
        this.fat = fat;
    }

    public long getFat() {
        return fat;
    }

    public void setProtein(long protein) {
        this.protein = protein;
    }

    public long getProtein() {
        return protein;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
