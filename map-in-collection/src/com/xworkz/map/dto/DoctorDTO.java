package com.xworkz.map.dto;

import lombok.*;

@NoArgsConstructor

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class DoctorDTO {
    private int doctorId;
    private String doctorName;
    private String specialization;
    private int experie;
}
