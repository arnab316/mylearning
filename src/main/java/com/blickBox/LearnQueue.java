package com.blickBox;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(7);
        queue.offer(9) ;
        queue.offer(0);
        queue.offer(8);
        queue.offer(1);
//        for (Integer i : queue) {
//            System.out.println(i);
//        }

        System.out.println( queue.poll());

    }
}
