package com.company;

public class LinkedList<T> implements List<T> {
    private class node<Y> {
        public node<Y> previous = null;
        public node<Y> next = null;
        public Y payload;
    }

    private node<T> head;
    public LinkedList() {
        head = null;
    }

    public void put(T x, int idx) {
        node<T> now = head;

        for (int i = 0; i < idx; i++) {
            if(now.next == null){
                node<T> newNode = new node<>();
                now.next = newNode;
                newNode.previous = now;
            }
            now = now.next;
        }

        now.payload = x;
    }

    public int find(T x) {
        node<T> now = head;
        int idx = 0;
        while (now != null && now.equals(x)) {
            now = now.next;
            idx++;
        }

        if (now == null) {
            return -1;
        }
        return idx;
    }

    public void add(T x) {

        node<T> newNode = new node<>();
        newNode.payload = x;

        if (head == null) {
            head = newNode;
            return;
        }

        node<T> now = head;
        while (now.next != null) {
            now = now.next;
        }

        now.next = newNode;
        newNode.previous = now;

    }

    public void remove(int idx) {

        node<T> now = head;
        for (int i = 0; i < idx; i++) {
            if (now.next == null) {
                System.out.println("Error: index out of bounds");
                return;
            }
            now = now.next;
        }
        if (now.next != null) {
            now.previous.next = now.next;
        } else {
            now.previous.next = null;
        }
    }

    public T get(int index) {
        node<T> now = head;
        for (int i = 0; i < index; i++) {
            if (now.next == null) {
                System.out.println("Error: index out of bounds");
                return null;
            }
            now = now.next;
        }
        return now.payload;
    }
}
