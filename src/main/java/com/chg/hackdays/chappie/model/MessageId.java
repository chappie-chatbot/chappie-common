package com.chg.hackdays.chappie.model;

public class MessageId implements Comparable<MessageId>{
    final String topic;
    final long offset;

    public MessageId(String str){
        String[] parts = str.split(":");
        topic = parts[0];
        offset = Long.parseLong(parts[1]);
    }

    public MessageId(String topic, long offset) {
        this.topic = topic;
        this.offset = offset;
    }

    public String getTopic() {
        return topic;
    }

    public long getOffset() {
        return offset;
    }

    @Override
    public int compareTo(MessageId o) {
        int cmp;
        if((cmp = topic.compareTo(o.topic)) != 0) return cmp;
        if((cmp = Long.compare(offset,o.offset)) != 0) return cmp;
        return cmp;
    }

    @Override
    public String toString() {
        return topic+":"+offset;
    }
}
