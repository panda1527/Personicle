package asterix.recordV1.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.sql.Timestamp;

public class BraceletReminder extends BraceletAction {
    private Timestamp beginAt; //beginAt: datetime?,
    private Timestamp endAt; //endAt: datetime?,
    private int dnd; //dnd: int,
    private int tel; //tel: int,
    private int msg; //msg: int,
    private int ws; //ws: int,
    private int qq; //qq: int,
    private String timesec; //timesec: string

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

    public int getDnd() {
        return dnd;
    }

    public void setDnd(int dnd) {
        this.dnd = dnd;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getMsg() {
        return msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getTimesec() {
        return timesec;
    }

    public void setTimesec(String timesec) {
        this.timesec = timesec;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
