package personicle.utils;

import akka.actor.ProviderSelection;
import org.apache.logging.log4j.core.util.Assert;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DatetimeUtil {

    private static final DateTimeFormatter ftfm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
    private static final DateTimeFormatter ftfs = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter ftfd = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");

    public static String convertTimeMilliSecondToString(Long timestamp) {
        Assert.isNonEmpty(timestamp);
        return ftfm.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()));
    }

    public static Long convertTimeMilliSecondToLong(String time) {
        Assert.isNonEmpty(time);
        LocalDateTime parse = LocalDateTime.parse(time, ftfm);
        return LocalDateTime.from(parse).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static String convertTimeDozenSecondToString(Long timestamp) {
        Assert.isNonEmpty(timestamp);
        return ftfd.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()));
    }

    public static Timestamp convertTimeMilliSecondToTimeStamp(Long timestamp) {
        return Timestamp.valueOf(convertTimeDozenSecondToString(timestamp));
    }

    public static LocalDateTime convertTimeMilliSecondToLocalDateTime(Long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
    }

    public static String convertTimeSecondToString(Long timestamp) {
        Assert.isNonEmpty(timestamp);
        return ftfs.format(LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp), ZoneId.systemDefault()));
    }

    public static Long convertTimeSecondToLong(String time) {
        Assert.isNonEmpty(time);
        LocalDateTime parse = LocalDateTime.parse(time, ftfs);
        return LocalDateTime.from(parse).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static Timestamp convertTimeSecondToTimeStamp(Long timestamp) {
        return Timestamp.valueOf(convertTimeSecondToString(timestamp));
    }
}
