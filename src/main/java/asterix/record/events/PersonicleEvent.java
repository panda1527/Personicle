package asterix.record.events;

import asterix.record.users.PersonicleUser;
import com.alibaba.fastjson.JSONObject;

import java.time.LocalDateTime;
import java.util.UUID;

public class PersonicleEvent {

    private class Interval {
        private LocalDateTime startAt;
        private LocalDateTime endAt;

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

        public String toJSONString() {
            return JSONObject.toJSONString(this);
        }
    }

    private UUID eventId; //eventId: uuid,        --primary key uuid for event
    private PersonicleUser participant; //participant: uuid,    --foreign key to user that participated in this event
    private Interval inverval;

    public UUID getEventID() {
        return eventId;
    }

    public void setEventID(UUID eventId) {
        this.eventId = eventId;
    }

    public PersonicleUser getParticipant() {
        return participant;
    }

    public void setParticipant(PersonicleUser participant) {
        this.participant = participant;
    }

    public Interval getInverval() {
        return inverval;
    }

    public void setInverval(Interval inverval) {
        this.inverval = inverval;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
