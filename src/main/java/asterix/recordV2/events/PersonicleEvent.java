package asterix.recordV2.events;

import asterix.recordV2.wrapper.DateTime;
import asterix.recordV2.wrapper.Point;
import asterix.recordV2.wrapper.Uuid;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.UUID;

public class PersonicleEvent {
    private Uuid eventId;
    private Uuid userId;
    private String userName;
    private DateTime beginAt;  //startAt: datetime,    --start of event
    private DateTime endAt;    //endAt: datetime,      --end of event using `` because of a potential AsterixDB bug
    private List<Uuid> subEvents;   //subEvents: [uuid],    --sub events of event
    private Point location;         //location: point?,     --location of event
    private String geocode;
    private List<Uuid> information;
    private String name;            //name: string,
    private long level;
    //level: bigint?,       --Jordan's paper referred to different levels of daily activities.
    private List<Uuid> causalities;
    //--foreign keys to ids of causalities which were used to translate from observations to this event

    /*public Uuid getEventId() {
        return eventId;
    }*/

    public void setEventId(Uuid eventId) {
        this.eventId = eventId;
    }

    public Uuid getUserId() {
        return userId;
    }

    public void setUserId(Uuid userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DateTime getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(DateTime beginAt) {
        this.beginAt = beginAt;
    }

    public DateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(DateTime endAt) {
        this.endAt = endAt;
    }

    public List<Uuid> getSubEvents() {
        return subEvents;
    }

    public void setSubEvents(List<Uuid> subEvents) {
        this.subEvents = subEvents;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getGeocode() {
        return geocode;
    }

    public void setGeocode(String geocode) {
        this.geocode = geocode;
    }

    public List<Uuid> getInformation() {
        return information;
    }

    public void setInformation(List<Uuid> information) {
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public List<Uuid> getCausalities() {
        return causalities;
    }

    public void setCausalities(List<Uuid> causalities) {
        this.causalities = causalities;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
