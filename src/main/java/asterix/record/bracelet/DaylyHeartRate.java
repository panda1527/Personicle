package asterix.record.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class DaylyHeartRate extends BraceletDaylyInfo {
    private int maxhr; //maxhr: int,
    private int avghr; //avghr: int,
    private int minhr; //minhr: int,
    private List<String> datas; //datas: [string] --alternatively, this can be changed to pairs of <time, counter>

    public int getMaxhr() {
        return maxhr;
    }

    public void setMaxhr(int maxhr) {
        this.maxhr = maxhr;
    }

    public int getAvghr() {
        return avghr;
    }

    public void setAvghr(int avghr) {
        this.avghr = avghr;
    }

    public int getMinhr() {
        return minhr;
    }

    public void setMinhr(int minhr) {
        this.minhr = minhr;
    }

    public List<String> getDatas() {
        return datas;
    }

    public void setDatas(List<String> datas) {
        this.datas = datas;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
