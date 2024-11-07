package com.blickBox.learning2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class learnCollectionclass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("min ele " + Collections.min(list));
    }
}
