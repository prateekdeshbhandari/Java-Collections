package com.xworkz.map.runner;


import java.util.HashMap;
import java.util.Map;

public class RoomDetails {
    public static void main(String[] args) {
        Map<Integer,String> keyValues=new HashMap<>();
        keyValues.put(1,"Room1");
        keyValues.put(2,"Room2");
        keyValues.put(3,"Room3");
        keyValues.put(4,"Room4");
        keyValues.put(5,"Room5");
        keyValues.forEach((s1, s2) -> System.out.println(s1 + " " + s2));

//       Boolean bb= keyValues.containsKey("Room1");
//        System.out.println(bb);
        keyValues.entrySet().stream()
                .filter(integerStringEntry -> integerStringEntry.getKey().equals(1)).map(s -> s.getValue()).forEach(System.out::println);



    }
}
