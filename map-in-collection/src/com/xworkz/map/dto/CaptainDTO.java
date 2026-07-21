package com.xworkz.map.dto;

import lombok.*;

@NoArgsConstructor

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class CaptainDTO {
    private int captainId;
    private String captainName;
    private String country;
    private int matches;
}
