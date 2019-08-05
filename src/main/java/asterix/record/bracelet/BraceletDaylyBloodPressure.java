package asterix.record.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class BraceletDaylyBloodPressure extends BraceletDaylyBasis {
    private int maxbp; //maxbp: int,
    private int avgbp; //avgbp: int,
    private int minbp; //minbp: int,
    private List<String> datas; //datas: [string] --alternatively, this can be changed to pairs of <time, maxbp/minbp>

    public int getMaxbp() {
        return maxbp;
    }

    public void setMaxbp(int maxbp) {
        this.maxbp = maxbp;
    }

    public int getAvgbp() {
        return avgbp;
    }

    public void setAvgbp(int avgbp) {
        this.avgbp = avgbp;
    }

    public int getMinbp() {
        return minbp;
    }

    public void setMinbp(int minbp) {
        this.minbp = minbp;
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
