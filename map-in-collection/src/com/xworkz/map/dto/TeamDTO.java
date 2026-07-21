package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class TeamDTO implements Serializable {
    private int teamId;
    private String teamName;
    private String format;
    private int ranking;
}
