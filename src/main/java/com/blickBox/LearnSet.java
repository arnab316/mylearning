package com.blickBox;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {

        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Arnab Golder", 1));
        students.add(new Student("John Smith", 19));
        students.add(new Student("John Smith", 19));
        System.out.println(students);
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(30);
//        set.add(40);
//        set.add(50);
//        set.add(60);
//        set.add(60);
//        System.out.println(set);
//        set.remove(60);
//        System.out.println(set);
//        System.out.println(set.isEmpty());
    }
}
