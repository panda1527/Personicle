package personicle.datagen.observation.sensor;

import asterix.record.sensor.SensoringCP;
import asterix.record.sensor.Spatial3DPoint;

import java.io.IOException;
import java.util.ArrayList;

public class SensoringCPTest {
    public static void main(String[] args) throws IOException {
        SensoringCP cp = new SensoringCP();
        cp.setUserId("12345678");
        cp.setTimestamp(12345678);
        cp.setComments("Testing ...");
        cp.setUserName("Magic Johnson");
        cp.setAcclerometer(new ArrayList<>());
        cp.setGyroscope(new ArrayList<>());
        cp.getAcclerometer().add(new Spatial3DPoint(117.21, 30.01, 9.89));
        cp.getAcclerometer().add(new Spatial3DPoint(117.01, 30.11, 10.0));
        cp.getGyroscope().add(new Spatial3DPoint(8.0, 18.11, 3.2));
        cp.getGyroscope().add(new Spatial3DPoint(10.0, 20.11, 4.2));
        System.out.println(cp.toJSONString());
    }
}
