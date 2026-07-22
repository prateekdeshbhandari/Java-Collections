package com.xworkz.map.runner;

import com.xworkz.map.dto.CaptainDTO;
import com.xworkz.map.dto.TeamDTO;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CricketRunner {
    public static void main(String[] args) {
        Map<CaptainDTO, TeamDTO>map=new TreeMap<>((s1,s2)->s1.getCaptainName().compareTo(s2.getCaptainName()));


        map.put(new CaptainDTO(1, "Sourav Ganguly", "India", 100), new TeamDTO(1, "India", "Test", 1));
        map.put(new CaptainDTO(2, "MS Dhoni", "India", 80), new TeamDTO(2, "India", "ODI", 2));
        map.put(new CaptainDTO(3, "Ricky Ponting", "Australia", 120), new TeamDTO(3, "Australia", "Test", 3));
        map.put(new CaptainDTO(4, "Brian Lara", "West Indies", 90), new TeamDTO(4, "West Indies", "Test", 4));
        map.put(new CaptainDTO(5, "Garfield Sobers", "West Indies", 110), new TeamDTO(5, "West Indies", "Test", 5));

        map.forEach((key, value) -> System.out.println(key + " -> " + value));
        map.
    }
}
