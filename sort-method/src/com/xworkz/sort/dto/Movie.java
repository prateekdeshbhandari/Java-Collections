package com.xworkz.sort.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Comparator;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Movie implements Serializable {
    private int movieId;
    private String title;
    private String hero;
    private double rating;
    private String language;




}
