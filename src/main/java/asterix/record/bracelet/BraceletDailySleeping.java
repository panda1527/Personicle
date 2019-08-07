package asterix.record.bracelet;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class BraceletDailySleeping extends BraceletDailyBasis {
    private int slpdur; //slpdur: int,
    private int deepdur; //deepdur: int,
    private int lightdur; //lightdur: int,
    private int wakedur; //wakedur: int,
    private List<Integer> datas; //datas: [int]

    public int getSlpdur() {
        return slpdur;
    }

    public void setSlpdur(int slpdur) {
        this.slpdur = slpdur;
    }

    public int getDeepdur() {
        return deepdur;
    }

    public void setDeepdur(int deepdur) {
        this.deepdur = deepdur;
    }

    public int getLightdur() {
        return lightdur;
    }

    public void setLightdur(int lightdur) {
        this.lightdur = lightdur;
    }

    public int getWakedur() {
        return wakedur;
    }

    public void setWakedur(int wakedur) {
        this.wakedur = wakedur;
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
