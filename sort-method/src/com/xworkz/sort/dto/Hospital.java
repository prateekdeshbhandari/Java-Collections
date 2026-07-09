package com.xworkz.sort.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Comparator;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Hospital implements Serializable,Comparator<Hospital> {
    private int hospitalId;
    private String hospitalName;
    private String city;
    private int beds;
    private double rating;

    @Override
    public int compare(Hospital o1, Hospital o2) {
        return Integer.compare(o1.hospitalId, o2.hospitalId);
    }
}
