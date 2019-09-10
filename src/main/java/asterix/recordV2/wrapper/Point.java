package asterix.recordV2.wrapper;

import com.alibaba.fastjson.JSON;

public class Point extends JSON {
    private double latitude;
    private double longitude;

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public Point(double latitude, double longitude) {
        this();
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void reset(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Point() {
    }

    @Override
    public String toJSONString() {
        return "point(\"" + latitude + "," + longitude + "\")";
    }
}