package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class HeroDTO implements Serializable,Comparable<HeroDTO> {
    private int heroId;
    private String heroName;
    private int age;
    private String industry;

    @Override
    public int compareTo(HeroDTO o) {
        return Integer.compare(this.heroId, o.heroId);
    }
}
