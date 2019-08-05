package personicle.datagen.observation.sensor;

import asterix.record.sensor.SensoringGPS;

import java.io.IOException;
import java.util.ArrayList;

public class SensoringGPSTest {
    public static void main(String[] args) throws IOException {
        SensoringGPS gps = new SensoringGPS();
        gps.setUserId("12345678");
        gps.setUserId("Mike Jordan");
        gps.setTimestamp(12345678);
        gps.setComments("This is the super star of NBA all over.");
        gps.setWeatherInfo(4);
        gps.setLatitue(new ArrayList<>());
        gps.getLatitue().add(30.12);
        gps.getLatitue().add(30.11);
        gps.setLongitude(new ArrayList<>());
        gps.getLongitude().add(117.01);
        gps.getLongitude().add(117.02);
        System.out.println(gps.toJSONString());
    }
}
