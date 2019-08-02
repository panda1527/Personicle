package personicle.utils;

import org.apache.logging.log4j.core.util.Assert;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DatetimeUtil {

    private static final DateTimeFormatter ftf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSSS");

    public static String convertTimeToString(Long timestamp) {
        Assert.isNonEmpty(timestamp);
        return ftf.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()));
    }
}
