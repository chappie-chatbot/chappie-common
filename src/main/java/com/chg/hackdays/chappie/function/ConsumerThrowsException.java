package com.chg.hackdays.chappie.function;

@FunctionalInterface
public interface ConsumerThrowsException<T> {
    void accept(T t) throws Exception;
}
