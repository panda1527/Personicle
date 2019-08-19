package asterix.twitter;

import com.alibaba.fastjson.JSONObject;

public class GeoTag {
    private int stateID; //stateID: int32,
    private String stateName; //stateName: string,
    private int countyID; //countyID: int32,
    private String countyName; //countyName: string,
    private int cityID; //cityID: int32?,
    private String cityName; //cityName: string?

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getCountyID() {
        return countyID;
    }

    public void setCountyID(int countyID) {
        this.countyID = countyID;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
