package com.xwork.streamapi.runner;

import com.xwork.streamapi.dto.CityDto;

import java.util.ArrayList;
import java.util.List;

public class CityRunner {
    public static void main(String[] args) {


    List<CityDto>cities=new ArrayList<>();


        cities.add(new CityDto("Bangalore", "Karnataka", 560001));
        cities.add(new CityDto("Mysore", "Karnataka", 570001));
        cities.add(new CityDto("Hubli", "Karnataka", 580020));
        cities.add(new CityDto("Mangalore", "Karnataka", 575001));
        cities.add(new CityDto("Belgaum", "Karnataka", 590001));
        cities.add(new CityDto("Mumbai", "Maharashtra", 400001));
        cities.add(new CityDto("Pune", "Maharashtra", 411001));
        cities.add(new CityDto("Delhi", "Delhi", 110001));
        cities.add(new CityDto("Chennai", "Tamil Nadu", 600001));
        cities.add(new CityDto("Hyderabad", "Telangana", 500001));
        cities.add(new CityDto("Kolkata", "West Bengal", 700001));
        cities.add(new CityDto("Jaipur", "Rajasthan", 302001));
        cities.add(new CityDto("Lucknow", "Uttar Pradesh", 226001));
        cities.add(new CityDto("Bhopal", "Madhya Pradesh", 462001));
        cities.add(new CityDto("Ahmedabad", "Gujarat", 380001));
        cities.add(new CityDto("Surat", "Gujarat", 395003));
        cities.add(new CityDto("Patna", "Bihar", 800001));
        cities.add(new CityDto("Bhubaneswar", "Odisha", 751001));
        cities.add(new CityDto("Kochi", "Kerala", 682001));
        cities.add(new CityDto("Panaji", "Goa", 403001));


        System.out.println("Cities with pincode between 500000 and 599999:");

        cities.stream()
                .filter(city -> city.getPincode() >= 500000 && city.getPincode() <= 599999)
                .forEach(System.out::println);
        System.out.println("============================================================");

        cities.stream().filter(city->city.getCityName().length()>6).forEach(System.out::println);
        System.out.println("============================================================");

        cities.stream().filter(city->Integer.toString(city.getPincode()).contains("1")).forEach(System.out::println);

        System.out.println("============================================================");
        cities.stream().filter(city->city.getPincode()%2==0).forEach(System.out::println);
        System.out.println("============================================================");
cities.stream().filter(city->city.getCityName().startsWith("W")||city.getCityName().startsWith("D")).forEach(System.out::println);

        System.out.println("============================================================");

        cities.stream().filter(city->city.getPincode()%3==0).forEach(System.out::println);
        System.out.println("============================================================");

        cities.stream()
                .filter(city ->String.valueOf(city.getPincode()).chars().map(ch -> ch - '0').sum()>20)
                .forEach(System.out::println);
        System.out.println("============================================================");

        cities.stream().filter(city ->city.getCityName().contains("a")).forEach(System.out::println);
        System.out.println("============================================================");
        cities.stream().filter(cityDto ->Integer.toString(cityDto.getPincode()).endsWith("001")).forEach(System.out::println);
        System.out.println("============================================================");

    }

}
