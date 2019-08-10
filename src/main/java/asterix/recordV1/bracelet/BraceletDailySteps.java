package asterix.recordV1.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class BraceletDailySteps extends BraceletDailyBasis {
    private int step; //step: int,
    private int meter; //meter: int,
    private int cal; //cal: int,
    private int lot; //lot: int,
    private List<Integer> datas; //datas: [int]

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public List<Integer> getDatas() {
        return datas;
    }

    public void setDatas(List<Integer> datas) {
        this.datas = datas;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
