package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class MoviesDto implements Serializable,Comparable<MoviesDto> {
    private int movieId;
    private String movieName;
    private String language;
    private double budget;

    @Override
    public int compareTo(MoviesDto o) {
        return Integer.compare(this.movieId , o.movieId);
    }
}
