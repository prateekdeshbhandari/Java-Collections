package com.xworkz.sort.Runner;

import com.xworkz.sort.dto.CricketPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;



public class CricketPlayerRunner {
    public static void main(String[] args) {
        CricketPlayer c1 = new CricketPlayer(101, "Virat Kohli", "India", 13848, 58.67);
        CricketPlayer c2 = new CricketPlayer(102, "Rohit Sharma", "India", 11168, 49.12);
        CricketPlayer c3 = new CricketPlayer(103, "Babar Azam", "Pakistan", 5729, 57.86);
        CricketPlayer c4 = new CricketPlayer(104, "Joe Root", "England", 6522, 50.94);
        CricketPlayer c5 = new CricketPlayer(105, "Steve Smith", "Australia", 5445, 43.21);
        CricketPlayer c6 = new CricketPlayer(106, "Kane Williamson", "New Zealand", 6810, 47.35);
        CricketPlayer c7 = new CricketPlayer(107, "Shubman Gill", "India", 2328, 61.26);
        CricketPlayer c8 = new CricketPlayer(108, "David Warner", "Australia", 6932, 45.90);
        CricketPlayer c9 = new CricketPlayer(109, "Jos Buttler", "England", 5022, 41.50);
        CricketPlayer c10 = new CricketPlayer(110, "KL Rahul", "India", 2851, 49.15);
        CricketPlayer c11 = new CricketPlayer(111, "Travis Head", "Australia", 2784, 42.18);
        CricketPlayer c12 = new CricketPlayer(112, "Hardik Pandya", "India", 1895, 34.45);
        CricketPlayer c13 = new CricketPlayer(113, "Rassie van der Dussen", "South Africa", 2480, 54.20);
        CricketPlayer c14 = new CricketPlayer(114, "Shai Hope", "West Indies", 5178, 48.39);
        CricketPlayer c15 = new CricketPlayer(115, "Glenn Maxwell", "Australia", 3990, 34.70);

        List<CricketPlayer> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);
        list.add(c8);
        list.add(c9);
        list.add(c10);
        list.add(c11);
        list.add(c12);
        list.add(c13);
        list.add(c14);
        list.add(c15);

        list.stream().sorted((o1, o2) -> o1.getTeam().compareTo(o2.getTeam())).forEach(System.out::println);
        System.out.println("=========================================");

        list.stream().filter(cricketPlayer -> (cricketPlayer.getPlayerId() > 105)).map(cricketPlayer -> cricketPlayer.getPlayerId())
                .sorted((a, d) -> a.compareTo(d)).forEach(System.out::println);
        System.out.println("=========================================");
        list.stream()
                .filter(cricketPlayer ->
                        cricketPlayer.getPlayerName().toLowerCase().contains("virat Kohli") ||
                                cricketPlayer.getTeam().toLowerCase().contains("india"))
                .map(cricketPlayer -> cricketPlayer.getTeam()).sorted((a, b) -> a.compareTo(b))

                .forEach(s -> System.out.println(s));



    }
}
