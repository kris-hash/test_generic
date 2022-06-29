package com.company;

public interface List<T>{
    void put(T element, int position);

    int find(T element);

    void add(T element);

    void remove(int position);

    T get(int index);
}
