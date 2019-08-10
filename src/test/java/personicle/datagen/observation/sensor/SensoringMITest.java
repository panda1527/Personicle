package personicle.datagen.observation.sensor;

import asterix.recordV1.sensor.SensoringMI;

import java.io.IOException;

public class SensoringMITest {
    public static void main(String[] args) throws IOException {
        SensoringMI mi = new SensoringMI();
        mi.setUserId("12345678");
        mi.setUserName("Mike Jordan");
        mi.setTimestamp(1231232121);
        mi.setHeartrate(100);
        mi.setStepcount(1123);
        System.out.println(mi.toJSONString());
    }
}
