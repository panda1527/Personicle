package asterix.record.observations.measurements.sensoring;

import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

public class SensoringGPS extends Measurement {
    private int weatherInfo; //weatherInfo: int,
    private int latitude; //latitude: [double],
    private int longitude; //longitude: [double],
    private String comments; //comments: string

    public int getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(int weatherInfo) {
        this.weatherInfo = weatherInfo;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
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
