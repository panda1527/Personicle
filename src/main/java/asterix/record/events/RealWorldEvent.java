package asterix.record.events;

import asterix.record.causalities.Causality;
import asterix.record.observations.attributes.users.UserAttribute;
import asterix.record.observations.measurements.Measurement;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class RealWorldEvent extends PersonicleEvent {
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
            return JSONObject.toJSONString(this);
        }
    }

    //private LocalDateTime startAt; //startAt: datetime,    --start of event
    //private LocalDateTime endAt; //endAt: datetime,      --end of event using `` because of a potential AsterixDB bug
    private List<RealWorldEvent> subEvents; //subEvents: [uuid],    --sub events of event
    private Point location; //location: point?,     --location of event
    private List<UserAttribute> information;
    //information: [uuid],  --attributes of event, which so far includes user attributes only and can be extended to KG/Alg.
    private String name; //name: string,
    private long level; //level: bigint?,       --Jordan's paper referred to different levels of daily activities.
    private List<Measurement> measurements;
    //measurements: [uuid], --foreign keys to ids of observations which were used to make up this event
    private List<Causality> causalities;
    //causalities: [uuid]   --foreign keys to ids of causalities which were used to translate from observations to this event

    public List<RealWorldEvent> getSubEvents() {
        return subEvents;
    }

    public void setSubEvents(List<RealWorldEvent> subEvents) {
        this.subEvents = subEvents;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public List<UserAttribute> getInformation() {
        return information;
    }

    public void setInformation(List<UserAttribute> information) {
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

    public List<Measurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<Measurement> measurements) {
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
