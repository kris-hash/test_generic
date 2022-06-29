package com.company;
import java.util.ArrayList;
public class ArrList<T> implements List<T> {
    //костыль, но иначе объявить массив не получиться, тк java просит сразу определенный тип
    private ArrayList<T> mas;
    private int len;

    public int size() {
        return len;
    }

    public ArrList() {
        len = 0;
        mas = new ArrayList<>(len);
    }

    public ArrList(int n) {
        len = n;
        mas = new ArrayList<>(len);
    }

    public void put(T x, int idx) {
        if (idx >= len) {
            System.out.println("Error: array index out of bounds");
            return;
        }
        if (idx < mas.size()) mas.set(idx, x);
        else {
            for (int i = mas.size() - 1; i < idx - 1; i++) {
                mas.add(null);
            }
            mas.add(x);
            len = mas.size();
        }
    }

    public int find(T x) {
        for (int i = 0; i < len; i++) {
            if (mas.get(i).equals(x)) {
                return i;
            }
        }

        System.out.println("not found");
        return -1;
    }

    public void add(T x) {
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) == null) {
                mas.set(i, x);
                return;
            }
        }

        len = (len == 0) ? 2 : len * 2;
        ArrayList<T> temp = new ArrayList<>(len);
        for (int i = 0; i < mas.size(); i++) {
            temp.add(mas.get(i));
        }

        temp.add(x);
        mas = temp;
    }

    public void remove(int idx) {
        len -= 1;
        ArrayList<T> temp = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            if (i == idx) continue;
            temp.add(mas.get(i));
        }
        mas = temp;
    }

    public T get(int index) {

        if (index < 0 || index >= len) {
            System.out.println("Error: array index out of bounds");
            return null;
        }

        return mas.get(index);
    }
}
