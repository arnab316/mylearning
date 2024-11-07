package com.blickBox.learning2;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        if(numbers.containsKey("two")) {
            numbers.put("two", 9);
        }
        System.out.println(numbers);

    }
}
