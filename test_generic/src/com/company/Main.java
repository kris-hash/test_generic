package com.company;

public class Main {

    public static void main(String[] args) {

        ArrList<Integer> arrayList = new ArrList<>();
        System.out.println(arrayList.size());

        arrayList.add(9);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.find(9));

        arrayList.put(13, 13);
        System.out.println(arrayList.get(0));

        arrayList.remove(4);
        System.out.println(arrayList.get(3));

        //
        LinkedList<Integer> l = new LinkedList<>();

        l.add(13);
        System.out.println(l.find(13));

        l.add(12); l.add(11); l.add(10);
        System.out.println(l.get(0) +" "+ l.get(1) +" "+ l.get(2));
        l.remove(1);
        System.out.println(l.get(1));
    }
}
