package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class AccountDetails {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"John");
        map.put(2,"Jane");
        map.put(3,"Bob");
        map.put(4,"Alice");
        map.put(5,"Charlie");
        map.forEach((s1, s2) -> System.out.println(s1 + " " + s2));
    }
}
