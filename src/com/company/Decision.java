package com.company;

public interface Decision<T> {
    boolean make(T s);
}
