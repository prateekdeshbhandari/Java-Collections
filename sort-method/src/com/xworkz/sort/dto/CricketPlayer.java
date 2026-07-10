package com.xworkz.sort.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Comparator;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CricketPlayer implements Serializable {
    private int playerId;
    private String playerName;
    private String team;
    private int runs;
    private double average;



}
