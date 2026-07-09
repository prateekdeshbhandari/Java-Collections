package com.xwork.streamapi.runner;

import com.xwork.streamapi.dto.WarDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WarRunner {
    public static void main(String[] args) {
       List<WarDTO> wars = new ArrayList<>();

        wars.add(new WarDTO("World War I", LocalDate.of(1914, 7, 28), LocalDate.of(1918, 11, 11),
                "Europe", List.of("Germany", "France", "Britain"), 17000000,
                "Allied Victory", 1567, "Ferdinand Foch", "Assassination"));

        wars.add(new WarDTO("World War II", LocalDate.of(1939, 9, 1), LocalDate.of(1945, 9, 2),
                "Worldwide", List.of("Germany", "Japan", "USA", "Britain"), 70000000,
                "Allied Victory", 2195, "Dwight Eisenhower", "Expansionism"));

        wars.add(new WarDTO("Kargil War", LocalDate.of(1999, 5, 3), LocalDate.of(1999, 7, 26),
                "Kargil", List.of("India", "Pakistan"), 1000,
                "India Victory", 85, "Ved Prakash Malik", "Border Conflict"));

        wars.add(new WarDTO("Indo-Pak War 1971", LocalDate.of(1971, 12, 3), LocalDate.of(1971, 12, 16),
                "Bangladesh", List.of("India", "Pakistan"), 13000,
                "India Victory", 13, "Sam Manekshaw", "Liberation"));

        wars.add(new WarDTO("Vietnam War", LocalDate.of(1955, 11, 1), LocalDate.of(1975, 4, 30),
                "Vietnam", List.of("USA", "Vietnam"), 3000000,
                "North Vietnam Victory", 7103, "Vo Nguyen Giap", "Cold War"));

        wars.add(new WarDTO("Korean War", LocalDate.of(1950, 6, 25), LocalDate.of(1953, 7, 27),
                "Korea", List.of("North Korea", "South Korea", "USA", "China"), 2500000,
                "Armistice", 1128, "Douglas MacArthur", "Division"));

        wars.add(new WarDTO("Gulf War", LocalDate.of(1990, 8, 2), LocalDate.of(1991, 2, 28),
                "Iraq", List.of("USA", "Iraq"), 50000,
                "Coalition Victory", 210, "Norman Schwarzkopf", "Invasion"));

        wars.add(new WarDTO("Crimean War", LocalDate.of(1853, 10, 16), LocalDate.of(1856, 3, 30),
                "Crimea", List.of("Russia", "Britain", "France"), 650000,
                "Allied Victory", 896, "Lord Raglan", "Territorial"));

        wars.add(new WarDTO("Napoleonic Wars", LocalDate.of(1803, 5, 18), LocalDate.of(1815, 11, 20),
                "Europe", List.of("France", "Britain", "Russia"), 3500000,
                "Coalition Victory", 4569, "Napoleon", "Expansion"));

        wars.add(new WarDTO("American Civil War", LocalDate.of(1861, 4, 12), LocalDate.of(1865, 5, 9),
                "USA", List.of("Union", "Confederacy"), 620000,
                "Union Victory", 1490, "Ulysses Grant", "Slavery"));

        wars.forEach(warDTO -> System.out.println(warDTO));
        System.out.println("======================================================");
        wars.stream().filter(war->war.getWarName().startsWith("W")).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getLocation().equals("Europe")).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getStartDate().getYear()>1900).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getStartDate().getYear()<1870).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getDurationDays()>365).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getCasualties()>100000).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getCasualties()>50000||war.getCasualties()<500000).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getDurationDays()%7==0).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getCountriesInvolved().contains("Russia")).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getCountriesInvolved().contains("India")).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getCountriesInvolved().size()>3).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getCasualties()>50000&&war.getDurationDays()>100).forEach(System.out::println);
        System.out.println("======================================================");
        wars.stream().filter(war->war.getLocation().equals("USA")&&war.getOutcome().equals("Victory")&&war.getCasualties()>10000).forEach(System.out::println);
        System.out.println("======================================================");


        Collections.sort((wars));
    }
}
