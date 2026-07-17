package com.workz.set.dto;

import lombok.*;

import java.util.Objects;


@AllArgsConstructor
@Setter
@Getter
@ToString
public class MovieBookingDTO {

    private int movieId;
    private String movieName;
    private String language;
    private String genre;
    private double rating;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MovieBookingDTO that)) return false;
        return movieId == that.movieId && Double.compare(rating, that.rating) == 0 && Objects.equals(movieName, that.movieName) && Objects.equals(language, that.language) && Objects.equals(genre, that.genre);
    }

    @Override
    public int hashCode() {

        int result=movieId;
        result=31*result+movieName.hashCode();
        result=31*result+language.hashCode();
        result=31*result+genre.hashCode();


        return result;

    }
}
