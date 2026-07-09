package com.xworkz.sort.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Food implements Serializable,Comparable<Food> {

    private int foodId;
    private String foodName;
    private double price;
    private String category;
    private double calories;

    @Override
    public int compareTo(Food o) {
        return this.foodName.compareTo(o.foodName);
    }
}
