package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class MoviesDto implements Serializable {
    private int movieId;
    private String movieName;
    private String language;
    private double budget;

}
