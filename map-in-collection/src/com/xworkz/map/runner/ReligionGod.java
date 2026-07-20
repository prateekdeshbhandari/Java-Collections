package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class ReligionGod {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("Hindu","Vishnu");
        map.put("Christian","Jesus");
        map.put("Muslim","Mohammed");
        map.put("Sikh","Guru Nanak");
        map.put("Buddhist","Buddha");
        map.forEach((s1, s2) -> System.out.println(s1 + " " + s2));
    }
}
