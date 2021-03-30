package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        SortedSet<Employee> set = new TreeSet<Employee>();
        set.add(new Employee("Name1", 50));
        set.add(new Employee("Name2", 500));
        set.add(new Employee("Name3", 100));
        set.add(new Employee("Name4", 500));
        for (Employee s : set) {
            System.out.println(s);
        }
        System.out.println("");
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Name5", 50));
        list.add(new Employee("Name6", 190));
        list.add(new Employee("Name6", 80));
        Collections.sort(list);
        for (Employee s : list) {
            System.out.println(s);
        }
    }
}
