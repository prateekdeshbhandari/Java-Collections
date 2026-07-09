package com.xworkz.sort.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Comparator;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CricketPlayer implements Serializable, Comparator<CricketPlayer> {
    private int playerId;
    private String playerName;
    private String team;
    private int runs;
    private double average;

    @Override
    public int compare(CricketPlayer o1, CricketPlayer o2) {
        return 0;
    }
}
