package com.company.lecture22;

public class Main {
    public static void main(String[] args) {
        Customlinkedlist list = new Customlinkedlist();
        list.insertFirst(12);
        list.insertLast(13);
        list.insertLast(15);

        list.insert(22,1);

        System.out.println(list);
        list.reverse();
        System.out.println(list);
    }
}
