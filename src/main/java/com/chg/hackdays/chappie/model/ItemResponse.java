package com.chg.hackdays.chappie.model;

public class ItemResponse<T> extends Response {
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
