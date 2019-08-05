package asterix.record.bracelet.innertype;

import com.alibaba.fastjson.JSONObject;

public class BraceletReportIMU {
    private int devation; //devation: int,
    private int balance; //balance: int,
    private int diff; //diff: int,
    private String comment; //comment: string

    public int getDevation() {
        return devation;
    }

    public void setDevation(int devation) {
        this.devation = devation;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
