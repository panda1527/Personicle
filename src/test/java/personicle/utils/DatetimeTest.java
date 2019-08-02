package personicle.utils;

import java.io.IOException;
import java.time.Instant;

public class DatetimeTest {
    public static void main(String[] args) throws IOException {
        System.out.println(DatetimeUtil.convertTimeToString(Instant.now().toEpochMilli()));
    }
}
