package asterix.recordV2.events;

import asterix.record.causalities.Causality;
import asterix.record.events.RealWorldEvent;
import asterix.record.observations.attributes.users.UserAttribute;
import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class PersonicleEvent {
    private class Point {
        private float latitude;
        private float longitude;

        public float getLatitude() {
            return this.latitude;
        }

        public float getLongitude() {
            return this.longitude;
        }

        public Point(float latitude, float longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public void reset(float latitude, float longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public Point() {
        }

        public String toJSONString() {
            return "point(\"" + latitude + "," + longitude + "\")";
        }
    }

    private UUID eventId;
    private UUID userId;
    private String userName;
    private LocalDateTime beginAt;  //startAt: datetime,    --start of event
    private LocalDateTime endAt;    //endAt: datetime,      --end of event using `` because of a potential AsterixDB bug
    private List<UUID> subEvents;   //subEvents: [uuid],    --sub events of event
    private Point location;         //location: point?,     --location of event
    private String geocode;
    private List<UUID> information;
    private String name;            //name: string,
    private long level;             //level: bigint?,       --Jordan's paper referred to different levels of daily activities.
    private List<UUID> causalities; //--foreign keys to ids of causalities which were used to translate from observations to this event

    public UUID getEventId() {
        return eventId;
    }

    public void setEventId(UUID eventId) {
        this.eventId = eventId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(LocalDateTime beginAt) {
        this.beginAt = beginAt;
    }

    public LocalDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    public List<UUID> getSubEvents() {
        return subEvents;
    }

    public void setSubEvents(List<UUID> subEvents) {
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

    public List<UUID> getInformation() {
        return information;
    }

    public void setInformation(List<UUID> information) {
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

    public List<UUID> getCausalities() {
        return causalities;
    }

    public void setCausalities(List<UUID> causalities) {
        this.causalities = causalities;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
