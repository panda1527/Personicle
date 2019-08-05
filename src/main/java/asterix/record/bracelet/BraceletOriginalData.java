package asterix.record.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.sql.Timestamp;
import java.util.List;

public class BraceletOriginalData extends BraceletObservation {
    private Timestamp beginAt; //beginAt: datetime,
    private Timestamp endAt; //endAt: datetime,
    private String dataType; //dataType: string,
    private int freq; //freq: int,
    private List<String> datas; //datas: [string] --with the form of [ppg:x:y:z,ppg1:x1:y1:z1...], can be changed to point array

    public Timestamp getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(Timestamp beginAt) {
        this.beginAt = beginAt;
    }

    public Timestamp getEndAt() {
        return endAt;
    }

    public void setEndAt(Timestamp endAt) {
        this.endAt = endAt;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
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
