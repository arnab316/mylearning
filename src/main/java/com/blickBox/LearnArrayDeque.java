package com.blickBox;
import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);
    }
}
