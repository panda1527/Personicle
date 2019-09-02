package asterix.record.events.food;

import asterix.record.events.PersonicleEvent;
import asterix.record.observations.measurements.food.FoodLog;

public class FoodEvent extends PersonicleEvent  {
    private String foodname; //foodname: string,
    private double weight; //weight: double,
    private double latitude; //latitude: double,
    private double longitude; //longitude: double,
    private String comments; //comments: string

}
