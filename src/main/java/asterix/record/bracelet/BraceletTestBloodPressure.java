package asterix.record.bracelet;

import com.alibaba.fastjson.JSONObject;

public class BraceletTestBloodPressure extends BraceletTestBasis {
    private int hr; //hr: int,
    private int sbp; //sbp: int,
    private int dbp; //dbp: int

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getSbp() {
        return sbp;
    }

    public void setSbp(int sbp) {
        this.sbp = sbp;
    }

    public int getDbp() {
        return dbp;
    }

    public void setDbp(int dbp) {
        this.dbp = dbp;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
