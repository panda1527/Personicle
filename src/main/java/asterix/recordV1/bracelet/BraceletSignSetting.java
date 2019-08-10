package asterix.recordV1.bracelet;

import asterix.recordV1.bracelet.innertype.BraceletMaxMinPair;
import com.alibaba.fastjson.JSONObject;

public class BraceletSignSetting extends BraceletObservation {
    private int hri; //hri: int,
    private int hhrat; //hhrat: int,
    private int lhrat; //lhrat: int,
    private int hras; //hras: int,
    private BraceletMaxMinPair bhpat; //hbpat: BraceletMaxMinPair,
    private BraceletMaxMinPair lbpat; //lbpat: BraceletMaxMinPair,
    private int bpas; //bpas: int

    public int getHri() {
        return hri;
    }

    public void setHri(int hri) {
        this.hri = hri;
    }

    public int getHhrat() {
        return hhrat;
    }

    public void setHhrat(int hhrat) {
        this.hhrat = hhrat;
    }

    public int getLhrat() {
        return lhrat;
    }

    public void setLhrat(int lhrat) {
        this.lhrat = lhrat;
    }

    public int getHras() {
        return hras;
    }

    public void setHras(int hras) {
        this.hras = hras;
    }

    public BraceletMaxMinPair getBhpat() {
        return bhpat;
    }

    public void setBhpat(BraceletMaxMinPair bhpat) {
        this.bhpat = bhpat;
    }

    public BraceletMaxMinPair getLbpat() {
        return lbpat;
    }

    public void setLbpat(BraceletMaxMinPair lbpat) {
        this.lbpat = lbpat;
    }

    public int getBpas() {
        return bpas;
    }

    public void setBpas(int bpas) {
        this.bpas = bpas;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
