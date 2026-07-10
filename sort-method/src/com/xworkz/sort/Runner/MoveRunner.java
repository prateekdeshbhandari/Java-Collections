package com.xworkz.sort.Runner;

import com.xworkz.sort.dto.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MoveRunner {
    public static void main(String[] args) {
        Movie m1 = new Movie(101, "KGF", "Yash", 8.5, "Kannada");
        Movie m2 = new Movie(102, "RRR", "Ram Charan", 8.8, "Telugu");
        Movie m3 = new Movie(103, "Pushpa", "Allu Arjun", 8.2, "Telugu");
        Movie m4 = new Movie(104, "Kantara", "Rishab Shetty", 9.0, "Kannada");
        Movie m5 = new Movie(105, "Leo", "Vijay", 7.9, "Tamil");
        Movie m6 = new Movie(106, "Jailer", "Rajinikanth", 8.3, "Tamil");
        Movie m7 = new Movie(107, "Vikram", "Kamal Haasan", 8.6, "Tamil");
        Movie m8 = new Movie(108, "Baahubali", "Prabhas", 8.9, "Telugu");
        Movie m9 = new Movie(109, "Drishyam", "Mohanlal", 8.7, "Malayalam");
        Movie m10 = new Movie(110, "Lucifer", "Mohanlal", 7.8, "Malayalam");
        Movie m11 = new Movie(111, "3 Idiots", "Aamir Khan", 8.4, "Hindi");
        Movie m12 = new Movie(112, "Dangal", "Aamir Khan", 8.9, "Hindi");
        Movie m13 = new Movie(113, "Shershaah", "Sidharth Malhotra", 8.5, "Hindi");
        Movie m14 = new Movie(114, "Mersal", "Vijay", 8.1, "Tamil");
        Movie m15 = new Movie(115, "Charlie", "Dulquer Salmaan", 8.4, "Malayalam");

        List<Movie> list = new ArrayList<>();

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        list.add(m6);
        list.add(m7);
        list.add(m8);
        list.add(m9);
        list.add(m10);
        list.add(m11);
        list.add(m12);
        list.add(m13);
        list.add(m14);
        list.add(m15);

        list.stream().sorted((o1, o2) -> Integer.compare(o2.getMovieId(), o1.getMovieId())).forEach(System.out::println);



    }
}
