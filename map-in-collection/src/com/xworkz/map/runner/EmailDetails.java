package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class EmailDetails {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("John","john@gmail.com");
        map.put("Jane","jane@gmail.com");
        map.put("Bob","bob@gmail.com");
        map.put("Alice","alice@gmail.com");
        map.put("Charlie","charlie@gmail.com");
        map.forEach((s1, s2) -> System.out.println(s1 + " " + s2));



Map<String,String>map2=new HashMap<>();
        map2.put("Bob","bob@gmail.com");
        map2.put("Alice","alice@gmail.com");
        map2.put("Charlie","charlie@gmail.com");

        map.putAll(map2);
        map.forEach((s, s2) -> System.out.println(s + " " + s2));


    }
}
