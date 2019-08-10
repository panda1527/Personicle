package asterix.record.events;

import asterix.record.causalities.Causality;
import com.alibaba.fastjson.JSONObject;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Event {
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

        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("point(\"" + this.latitude + "," + this.longitude + "\")");
            return builder.toString();
        }
    }

    private UUID eventID; //eventId: uuid,        --primary key uuid for event
    private UUID participant; //participant: uuid,    --foreign key to user that participated in this event
    private LocalDateTime startAt; //startAt: datetime,    --start of event
    private LocalDateTime endAt; //endAt: datetime,      --end of event using `` because of a potential AsterixDB bug
    private List<Event> subEvents; //subEvents: [uuid],    --sub events of event
    private Point location; //location: point?,     --location of event
    private List<UUID> information;
    //information: [uuid],  --attributes of event, which so far includes user attributes only and can be extended to KG/Alg.
    private String name; //name: string,
    private long level; //level: bigint?,       --Jordan's paper referred to different levels of daily activities.
    private List<UUID> measurements;
    //measurements: [uuid], --foreign keys to ids of observations which were used to make up this event
    private List<Causality> causalities;
    //causalities: [uuid]   --foreign keys to ids of causalities which were used to translate from observations to this event

    public UUID getEventID() {
        return eventID;
    }

    public void setEventID(UUID eventID) {
        this.eventID = eventID;
    }

    public UUID getParticipant() {
        return participant;
    }

    public void setParticipant(UUID participant) {
        this.participant = participant;
    }

    public LocalDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    public List<Event> getSubEvents() {
        return subEvents;
    }

    public void setSubEvents(List<Event> subEvents) {
        this.subEvents = subEvents;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
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

    public List<UUID> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<UUID> measurements) {
        this.measurements = measurements;
    }

    public List<Causality> getCausalities() {
        return causalities;
    }

    public void setCausalities(List<Causality> causalities) {
        this.causalities = causalities;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
