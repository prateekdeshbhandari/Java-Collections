package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class AreaDetails {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("BTM",100);
        map.put("Koramangala",200);
        map.put("Indiranagar",300);
        map.put("HSR",400);
        map.put("Marathahalli",500);
        map.forEach((s1, s2) -> System.out.println(s1 + " " + s2));

        map.values().stream().forEach(System.out::println);
    }
}
