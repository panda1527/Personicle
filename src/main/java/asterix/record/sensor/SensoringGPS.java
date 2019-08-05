package asterix.record.sensor;

import asterix.record.ObservationBasis;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class SensoringGPS extends ObservationBasis {
    private int weatherInfo; //weatherInfo: int,
    private List<Double> latitue; //latitude: [double],
    private List<Double> longitude; //longitude: [double],

    public int getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(int weatherInfo) {
        this.weatherInfo = weatherInfo;
    }

    public List<Double> getLatitue() {
        return latitue;
    }

    public void setLatitue(List<Double> latitue) {
        this.latitue = latitue;
    }

    public List<Double> getLongitude() {
        return longitude;
    }

    public void setLongitude(List<Double> longitude) {
        this.longitude = longitude;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
