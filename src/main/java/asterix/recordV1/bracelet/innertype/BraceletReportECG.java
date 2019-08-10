package asterix.recordV1.bracelet.innertype;

import com.alibaba.fastjson.JSONObject;

public class BraceletReportECG {
    private int ihb; //ihb: int,
    private int xdgs; //xdgs: int,
    private int xdgh; //xdgh: int,
    private int tbqk; //tbqk: int,
    private int lbqk; //lbqk: int,
    private int fxzb; //fxzb: int,
    private int xxzb; //kxzb: int,
    private int crxszb; //crxszb: int,
    private int zfxxdgs; //zfxxdgs: int,
    private int elv; //elv: int,
    private int slv; //slv: int

    public int getIhb() {
        return ihb;
    }

    public void setIhb(int ihb) {
        this.ihb = ihb;
    }

    public int getXdgs() {
        return xdgs;
    }

    public void setXdgs(int xdgs) {
        this.xdgs = xdgs;
    }

    public int getXdgh() {
        return xdgh;
    }

    public void setXdgh(int xdgh) {
        this.xdgh = xdgh;
    }

    public int getTbqk() {
        return tbqk;
    }

    public void setTbqk(int tbqk) {
        this.tbqk = tbqk;
    }

    public int getLbqk() {
        return lbqk;
    }

    public void setLbqk(int lbqk) {
        this.lbqk = lbqk;
    }

    public int getFxzb() {
        return fxzb;
    }

    public void setFxzb(int fxzb) {
        this.fxzb = fxzb;
    }

    public int getXxzb() {
        return xxzb;
    }

    public void setXxzb(int xxzb) {
        this.xxzb = xxzb;
    }

    public int getCrxszb() {
        return crxszb;
    }

    public void setCrxszb(int crxszb) {
        this.crxszb = crxszb;
    }

    public int getZfxxdgs() {
        return zfxxdgs;
    }

    public void setZfxxdgs(int zfxxdgs) {
        this.zfxxdgs = zfxxdgs;
    }

    public int getElv() {
        return elv;
    }

    public void setElv(int elv) {
        this.elv = elv;
    }

    public int getSlv() {
        return slv;
    }

    public void setSlv(int slv) {
        this.slv = slv;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
