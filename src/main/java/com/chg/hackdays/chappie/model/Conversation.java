package com.chg.hackdays.chappie.model;

import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.List;

public class Conversation {
    long id;
    ZonedDateTime startTime;
    List<String> participants = new LinkedList<>();

    public Conversation() {
    }

    public Conversation(long id) {
        this.id = id;
    }

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
