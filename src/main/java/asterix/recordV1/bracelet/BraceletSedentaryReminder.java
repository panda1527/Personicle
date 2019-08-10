package asterix.recordV1.bracelet;

import com.alibaba.fastjson.JSONObject;

public class BraceletSedentaryReminder extends BraceletAction {
    private String weekly; //weekly: string,
    private String amsec; //amsec: string,
    private String pmsec; //pmsec: string

    public String getWeekly() {
        return weekly;
    }

    public void setWeekly(String weekly) {
        this.weekly = weekly;
    }

    public String getAmsec() {
        return amsec;
    }

    public void setAmsec(String amsec) {
        this.amsec = amsec;
    }

    public String getPmsec() {
        return pmsec;
    }

    public void setPmsec(String pmsec) {
        this.pmsec = pmsec;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
