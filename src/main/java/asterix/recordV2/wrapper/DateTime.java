package asterix.recordV2.wrapper;

import com.alibaba.fastjson.JSON;

import java.time.LocalDateTime;

public class DateTime extends JSON {
    private LocalDateTime datetime;

    public DateTime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toJSONString() {
        return "datetime(\"" + datetime + "\")";
    }
}
