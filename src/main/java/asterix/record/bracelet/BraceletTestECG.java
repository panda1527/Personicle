package asterix.record.bracelet;

import asterix.record.bracelet.innertype.BraceletReportECG;
import asterix.record.bracelet.innertype.BraceletReportHRV;
import asterix.record.bracelet.innertype.BraceletReportIMU;
import com.alibaba.fastjson.JSONObject;

import java.sql.Timestamp;

public class BraceletTestECG extends BraceletTestBasis {
    private Timestamp beginAt; //beginAt: datetime,
    private Timestamp endAt; //endAt: datetime,
    private BraceletReportECG reportECG; //reportECG: BraceletReportECG,
    private BraceletReportHRV reportHRV; //reportHRV: BraceletReportHRV,
    private BraceletReportIMU reportIMU; //reportIMU: BraceletReportIMU

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

    public BraceletReportECG getReportECG() {
        return reportECG;
    }

    public void setReportECG(BraceletReportECG reportECG) {
        this.reportECG = reportECG;
    }

    public BraceletReportHRV getReportHRV() {
        return reportHRV;
    }

    public void setReportHRV(BraceletReportHRV reportHRV) {
        this.reportHRV = reportHRV;
    }

    public BraceletReportIMU getReportIMU() {
        return reportIMU;
    }

    public void setReportIMU(BraceletReportIMU reportIMU) {
        this.reportIMU = reportIMU;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
