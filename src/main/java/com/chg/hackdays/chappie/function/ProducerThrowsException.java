package com.chg.hackdays.chappie.function;

@FunctionalInterface
public interface ProducerThrowsException<T> {
    T get() throws Exception;
}
