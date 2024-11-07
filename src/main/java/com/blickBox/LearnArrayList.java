package com.blickBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
//        String[] studentName = new String[10];
//        studentName[0] = "John";
//        studentName[1] = "Jane";
//        studentName[2] = "Doe";
//        studentName[3] = "Bob";
//        studentName[4] = "Alice";
//         for(String name : studentName){
//             if(name != null){
//                 System.out.println(name);
//             }

//         }

//        ArrayList<String> studentName = new ArrayList<>();
//        studentName.add("John");
//        studentName.add("Jane");
//        studentName.add("Arnab");
//        studentName.add("Bob");
//
//        System.out.println(studentName);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
