package com.company.lecture20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(12);
        queue.enqueue(34);
        queue.dequeue();
        queue.enqueue(76);
        queue.enqueue(18);
        queue.enqueue(94);
        queue.dequeue();
        System.out.println(queue);

        Queue<Integer> q = (Queue<Integer>) new ArrayList<Integer>();


    }
}
