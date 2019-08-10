package asterix.recordV1.sensor;

import com.alibaba.fastjson.JSONObject;

public class Spatial3DPoint {
    private double x;
    private double y;
    private double z;

    public Spatial3DPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
