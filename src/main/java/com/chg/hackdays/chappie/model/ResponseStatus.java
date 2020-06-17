package com.chg.hackdays.chappie.model;

public class ResponseStatus {
    public static final ResponseStatus SUCCESS = new ResponseStatus(true, null);

    public static ResponseStatus error(String error) {
        return new ResponseStatus(false, error);
    }

    public static ResponseStatus error(Exception ex) {
        return error(ex.getMessage());
    }

    boolean success;
    String error;

    /** @deprecated  This only exists to make Jackson happy. For general purposes, both properties are final and the other constructor should be used
     */
    @Deprecated
    public ResponseStatus() {
    }

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
