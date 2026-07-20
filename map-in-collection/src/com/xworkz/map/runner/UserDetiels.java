package com.xworkz.map.runner;

import java.util.*;
import java.util.Collection.*;

public class UserDetiels {

    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Prateek", "prateek@1");
        stringMap.put("Rahul", "rahul@2");
        stringMap.put("Suresh", "suresh@3");
        stringMap.put("Naresh", "naresh@4");
        stringMap.put("Ramesh", "ramesh@5");
        stringMap.forEach((s1, s2) -> System.out.println(s1 + " " + s2));

        Set<String> key = stringMap.keySet();
        key.forEach(s -> System.out.println(s));

        Collection<String>values=stringMap.values();
        values.forEach(System.out::println);


    }
}
