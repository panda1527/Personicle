package personicle.utils;

import java.time.Instant;

public class DatetimeTest {
    public static void main(String[] args) {
        System.out.println("msTOstring: " + DatetimeUtil.convertTimeMilliSecondToString(Instant.now().toEpochMilli()));
        System.out.println("msTOlong: " + DatetimeUtil
                .convertTimeMilliSecondToLong(DatetimeUtil.convertTimeMilliSecondToString(Instant.now().toEpochMilli()))
                + " " + System.currentTimeMillis());
        System.out.println("sTOstamp: " + DatetimeUtil.convertTimeSecondToTimeStamp(Instant.now().getEpochSecond()));
        System.out.println(DatetimeUtil
                .convertTimeSecondToLong(DatetimeUtil.convertTimeSecondToString(Instant.now().getEpochSecond())) + " "
                + System.currentTimeMillis());
        System.out.println(DatetimeUtil.convertTimeMilliSecondToTimeStamp(Instant.now().toEpochMilli()));
        System.out.println(
                "sTOlocal: " + DatetimeUtil.convertTimeMilliSecondToLocalDateTime(Instant.now().toEpochMilli()));
    }
}
