package asterix.recordV1.bracelet.innertype;

import com.alibaba.fastjson.JSONObject;

public class BraceletReportHRV {
    private int avghr; //avghr: int,
    private int cnthr; //cnthr: int,
    private String comment; //comment: string,
    private BraceletHRVAnalyze analyze;


    public int getAvghr() {
        return avghr;
    }

    public void setAvghr(int avghr) {
        this.avghr = avghr;
    }

    public int getCnthr() {
        return cnthr;
    }

    public void setCnthr(int cnthr) {
        this.cnthr = cnthr;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BraceletHRVAnalyze getAnalyze() {
        return analyze;
    }

    public void setAnalyze(BraceletHRVAnalyze analyze) {
        this.analyze = analyze;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
