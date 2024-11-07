package com.blickBox;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Fish");
        System.out.println(animal);
        System.out.println(animal.peek());
    }
}
