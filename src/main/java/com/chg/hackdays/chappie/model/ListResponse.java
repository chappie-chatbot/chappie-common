package com.chg.hackdays.chappie.model;

import java.util.LinkedList;
import java.util.List;

public class ListResponse<T> extends Response {
    final List<T> items = new LinkedList<>();

    public List<T> getItems() {
        return items;
    }
}
