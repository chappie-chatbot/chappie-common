package com.chg.hackdays.chappie.model;

import java.time.ZonedDateTime;
import java.util.List;

public class Conversation {
    long id;
    ZonedDateTime startTime;
    List<String> participants;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }
}
