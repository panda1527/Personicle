package asterix.record.observations.measurements.bracelet;

import asterix.record.users.bracelet.BraceletDevice;
import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class BraceletSettings {
    private BraceletDevice device;
    private UUID id; //id: UUID,
    private int netId; //netId: int?,
    private String userName; //userName: string?,
    private String mac; //mac: string?,
    private int unitAndPage0; //unitAndPage0: int,                 -- default (0)
    private int height; //height: int,                       -- default (180)
    private int weight; //weight: int,                       -- default (700)
    private int stride; //stride: int,                       -- default (0)
    private int targetType; //targetType: int,                   -- default (0)
    private int targetValue; //targetValue: int,                  -- default (10000)
    private int age; //age: int,                          -- default (20)
    private int sex; //sex: int,                          -- default (0)
    private int timezone; //timezone: int,                     -- default (0)
    private int interval; //interval: int,                     -- default (0)
    private int runType; //runType: int,                      -- default (0)
    private int runTarget; //runTarget: int,                    -- default (0)
    private int unitAndPage2; //unitAndPage2: int,                 -- default (2)
    private int perimeter; //perimeter: int,                    -- default (0)
    private int crank; //crank: int,                        -- default (0)
    private int startHour; //startHour: int,                    -- default (0)
    private int startMinutes; //startMiniute: int,                 -- default (0)
    private int mind0; //mind0: int,                        -- default (0)
    private int mind1; //mind1: int,                        -- default (0)
    private int mind2; //mind2: int,                        -- default (0)
    private int reserved2; //reserved2: int,                    -- default (0)
    private int unitAndPage4; //unitAndPage4: int,                 -- default (0)
    private int clock0OpenAndRepeat; //clock0OpenAndRepeat: int,          -- default (0)
    private int clock0Hour; // clock0Hour: int,                   -- default (0)
    private int clock0Minute; // clock0Minute: int,                 -- default (0)
    private int clock0Reserved; // clock0Reserved: int,               -- default (0)
    private int clock1OpenAndRepeat; // clock1OpenAndRepeat: int,          -- default (0)
    private int clock1Hour; // clock1Hour: int,                   -- default (0)
    private int clock1Minute; // clock1Minute: int,                 -- default (0)
    private int clock1Reserved; // clock1Reserved: int,               -- default (0)
    private int clock2OpenAndRepeat; // clock2OpenAndRepeat: int,          -- default (0)
    private int clock2Hour; // clock2Hour: int,                   -- default (0)
    private int clock2Minute; // clock2Minute: int,                 -- default (0)
    private int clock2Reserved; // clock2Reserved: int,               -- default (0)
    private int langCode; // langCode: int,                     -- default (0)
    private int reserved4; // reserved4: int,                    -- default (0)
    private int unitAndPage6; // unitAndPage6: int,                 -- default (0)
    private int openAndRepeat; // openAndRepeat: int,                -- default (0)
    private int morningHourStart; // morningHourStart: int,             -- default (0)
    private int morningHourEnd; // morningHourEnd: int,               -- default (0)
    private int afternoonHourStart; // afternoonHourStart: int,           -- default (0)
    private int afternoonHourEnd; // afternoonHourEnd: int,             -- default (0)
    private int reserved6_0; // reserved6_0: int,                  -- default (0)
    private int heartBPSwitch; // heartBPSwitch: int,                -- default (0)
    private int alterHRValue; // alterHRValue: int,                 -- default (120)
    private int alterSBPValue; // alterSBPValue: int,                -- default (140)
    private int alterDBPValue; // alterDBPValue: int,                -- default (90)
    private int fatigue; // fatigue: int,                      -- default (0)
    private int reserved6_1; // reserved6_1: int,                  -- default (0)
    private String dateString; // dateString: string?,
    private String status; // status: string?,
    private long createTime; // createTime: bigint?,
    private long updateTime; // updateTime: bigint

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getNetId() {
        return netId;
    }

    public void setNetId(int netId) {
        this.netId = netId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getUnitAndPage0() {
        return unitAndPage0;
    }

    public void setUnitAndPage0(int unitAndPage0) {
        this.unitAndPage0 = unitAndPage0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStride() {
        return stride;
    }

    public void setStride(int stride) {
        this.stride = stride;
    }

    public int getTargetType() {
        return targetType;
    }

    public void setTargetType(int targetType) {
        this.targetType = targetType;
    }

    public int getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(int targetValue) {
        this.targetValue = targetValue;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getRunType() {
        return runType;
    }

    public void setRunType(int runType) {
        this.runType = runType;
    }

    public int getRunTarget() {
        return runTarget;
    }

    public void setRunTarget(int runTarget) {
        this.runTarget = runTarget;
    }

    public int getUnitAndPage2() {
        return unitAndPage2;
    }

    public void setUnitAndPage2(int unitAndPage2) {
        this.unitAndPage2 = unitAndPage2;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getCrank() {
        return crank;
    }

    public void setCrank(int crank) {
        this.crank = crank;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinutes() {
        return startMinutes;
    }

    public void setStartMinutes(int startMinutes) {
        this.startMinutes = startMinutes;
    }

    public int getMind0() {
        return mind0;
    }

    public void setMind0(int mind0) {
        this.mind0 = mind0;
    }

    public int getMind1() {
        return mind1;
    }

    public void setMind1(int mind1) {
        this.mind1 = mind1;
    }

    public int getMind2() {
        return mind2;
    }

    public void setMind2(int mind2) {
        this.mind2 = mind2;
    }

    public int getReserved2() {
        return reserved2;
    }

    public void setReserved2(int reserved2) {
        this.reserved2 = reserved2;
    }

    public int getUnitAndPage4() {
        return unitAndPage4;
    }

    public void setUnitAndPage4(int unitAndPage4) {
        this.unitAndPage4 = unitAndPage4;
    }

    public int getClock0OpenAndRepeat() {
        return clock0OpenAndRepeat;
    }

    public void setClock0OpenAndRepeat(int clock0OpenAndRepeat) {
        this.clock0OpenAndRepeat = clock0OpenAndRepeat;
    }

    public int getClock0Hour() {
        return clock0Hour;
    }

    public void setClock0Hour(int clock0Hour) {
        this.clock0Hour = clock0Hour;
    }

    public int getClock0Minute() {
        return clock0Minute;
    }

    public void setClock0Minute(int clock0Minute) {
        this.clock0Minute = clock0Minute;
    }

    public int getClock0Reserved() {
        return clock0Reserved;
    }

    public void setClock0Reserved(int clock0Reserved) {
        this.clock0Reserved = clock0Reserved;
    }

    public int getClock1OpenAndRepeat() {
        return clock1OpenAndRepeat;
    }

    public void setClock1OpenAndRepeat(int clock1OpenAndRepeat) {
        this.clock1OpenAndRepeat = clock1OpenAndRepeat;
    }

    public int getClock1Hour() {
        return clock1Hour;
    }

    public void setClock1Hour(int clock1Hour) {
        this.clock1Hour = clock1Hour;
    }

    public int getClock1Minute() {
        return clock1Minute;
    }

    public void setClock1Minute(int clock1Minute) {
        this.clock1Minute = clock1Minute;
    }

    public int getClock1Reserved() {
        return clock1Reserved;
    }

    public void setClock1Reserved(int clock1Reserved) {
        this.clock1Reserved = clock1Reserved;
    }

    public int getClock2OpenAndRepeat() {
        return clock2OpenAndRepeat;
    }

    public void setClock2OpenAndRepeat(int clock2OpenAndRepeat) {
        this.clock2OpenAndRepeat = clock2OpenAndRepeat;
    }

    public int getClock2Hour() {
        return clock2Hour;
    }

    public void setClock2Hour(int clock2Hour) {
        this.clock2Hour = clock2Hour;
    }

    public int getClock2Minute() {
        return clock2Minute;
    }

    public void setClock2Minute(int clock2Minute) {
        this.clock2Minute = clock2Minute;
    }

    public int getClock2Reserved() {
        return clock2Reserved;
    }

    public void setClock2Reserved(int clock2Reserved) {
        this.clock2Reserved = clock2Reserved;
    }

    public int getLangCode() {
        return langCode;
    }

    public void setLangCode(int langCode) {
        this.langCode = langCode;
    }

    public int getReserved4() {
        return reserved4;
    }

    public void setReserved4(int reserved4) {
        this.reserved4 = reserved4;
    }

    public int getUnitAndPage6() {
        return unitAndPage6;
    }

    public void setUnitAndPage6(int unitAndPage6) {
        this.unitAndPage6 = unitAndPage6;
    }

    public int getOpenAndRepeat() {
        return openAndRepeat;
    }

    public void setOpenAndRepeat(int openAndRepeat) {
        this.openAndRepeat = openAndRepeat;
    }

    public int getMorningHourStart() {
        return morningHourStart;
    }

    public void setMorningHourStart(int morningHourStart) {
        this.morningHourStart = morningHourStart;
    }

    public int getMorningHourEnd() {
        return morningHourEnd;
    }

    public void setMorningHourEnd(int morningHourEnd) {
        this.morningHourEnd = morningHourEnd;
    }

    public int getAfternoonHourStart() {
        return afternoonHourStart;
    }

    public void setAfternoonHourStart(int afternoonHourStart) {
        this.afternoonHourStart = afternoonHourStart;
    }

    public int getAfternoonHourEnd() {
        return afternoonHourEnd;
    }

    public void setAfternoonHourEnd(int afternoonHourEnd) {
        this.afternoonHourEnd = afternoonHourEnd;
    }

    public int getReserved6_0() {
        return reserved6_0;
    }

    public void setReserved6_0(int reserved6_0) {
        this.reserved6_0 = reserved6_0;
    }

    public int getHeartBPSwitch() {
        return heartBPSwitch;
    }

    public void setHeartBPSwitch(int heartBPSwitch) {
        this.heartBPSwitch = heartBPSwitch;
    }

    public int getAlterHRValue() {
        return alterHRValue;
    }

    public void setAlterHRValue(int alterHRValue) {
        this.alterHRValue = alterHRValue;
    }

    public int getAlterSBPValue() {
        return alterSBPValue;
    }

    public void setAlterSBPValue(int alterSBPValue) {
        this.alterSBPValue = alterSBPValue;
    }

    public int getAlterDBPValue() {
        return alterDBPValue;
    }

    public void setAlterDBPValue(int alterDBPValue) {
        this.alterDBPValue = alterDBPValue;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int getReserved6_1() {
        return reserved6_1;
    }

    public void setReserved6_1(int reserved6_1) {
        this.reserved6_1 = reserved6_1;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public BraceletDevice getDevice() {
        return device;
    }

    public void setDevice(BraceletDevice device) {
        this.device = device;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
