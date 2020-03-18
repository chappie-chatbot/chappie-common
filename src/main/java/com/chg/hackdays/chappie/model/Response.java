package com.chg.hackdays.chappie.model;

public class Response {
    ResponseStatus status = ResponseStatus.SUCCESS;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
