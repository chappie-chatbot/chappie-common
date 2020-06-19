package com.chg.hackdays.chappie.model;

public class SessionResponse extends Response {
    String sessionId;
    Long userId;
    String username;
    Long currentConversationId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCurrentConversationId(Long currentConversationId) {
        this.currentConversationId = currentConversationId;
    }

    public Long getCurrentConversationId() {
        return currentConversationId;
    }
}
