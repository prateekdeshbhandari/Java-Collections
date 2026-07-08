package com.xwork.streamapi.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class CounteryNameRunner {
    public static void main(String[] args) {



        List<String> countryNames=new ArrayList<>();

        countryNames.add("India");
        countryNames.add("Astreleya");
        countryNames.add("fransh");
        countryNames.add("USA");
        countryNames.add("Rasya");
        countryNames.add("China");
        countryNames.add("UK");
        countryNames.add("Japan");
        countryNames.add("Shrilanka");
        countryNames.add("Southaprika");


     countryNames.forEach(( countryName)-> System.out.println("country name is: "+countryName));
        System.out.println("============================================================");
     countryNames.stream().filter(c->c.startsWith("s")).forEach(System.out::println);
        System.out.println("============================================================");
        countryNames.stream().filter(c->c.endsWith("a")).forEach(System.out::println);
        System.out.println("============================================================");
        countryNames.stream().filter(countri->countri.length()>3).forEach(System.out::println);
        System.out.println("============================================================");
        countryNames.stream().filter(c->c.length()>10).forEach(System.out::println);
        System.out.println("============================================================");
        countryNames.stream().filter(c->c.length()<5).forEach(System.out::println);
        System.out.println("============================================================");
Collections.sort(countryNames);
countryNames.forEach(System.out::println);

            }
        }
