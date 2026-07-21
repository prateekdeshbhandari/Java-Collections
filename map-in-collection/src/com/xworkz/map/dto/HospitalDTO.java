package com.xworkz.map.dto;

import lombok.*;

@NoArgsConstructor

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class HospitalDTO {
    private int hospitalId;
    private String hospitalName;
    private String location;
    private int totalBeds;
}
