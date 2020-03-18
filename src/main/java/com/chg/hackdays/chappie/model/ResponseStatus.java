package com.chg.hackdays.chappie.model;

public class ResponseStatus {
    public static final ResponseStatus SUCCESS = new ResponseStatus(true, null);

    public static ResponseStatus error(String error) {
        return new ResponseStatus(false, error);
    }

    public static ResponseStatus error(Exception ex) {
        return error(ex.getMessage());
    }

    final boolean success;
    final String error;

    public ResponseStatus(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getError() {
        return error;
    }
}
