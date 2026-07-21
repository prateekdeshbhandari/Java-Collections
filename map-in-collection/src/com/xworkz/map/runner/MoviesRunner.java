package com.xworkz.map.runner;

import com.xworkz.map.dto.HeroDTO;
import com.xworkz.map.dto.MoviesDto;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MoviesRunner {
    public static void main(String[] args) {
        Map<HeroDTO, MoviesDto>dtoMap=new Hashtable<>();dtoMap=new TreeMap<>();
        dtoMap.put(new HeroDTO(0, null, 35, "Telugu"),null);
        dtoMap.put(new HeroDTO(2, "Prabhas", 40, "Telugu"), new MoviesDto(2, "Baahubali", "Telugu", 300.0));
        dtoMap.put(new HeroDTO(3, "Rajinikanth", 55, "Tamil"), new MoviesDto(3, "Baasha", "Tamil", 200.0));
        dtoMap.put(new HeroDTO(4, "Kamal Haasan", 58, "Tamil"), new MoviesDto(4, "Mahanadi", "Tamil", 150.0));
        dtoMap.put(new HeroDTO(5, "Amitabh Bachchan", 75, "Hindi"), new MoviesDto(5, "Sholay", "Hindi", 100.0));
        dtoMap.forEach((key, value) -> System.out.println(key + " -> " + value));


    }
}
