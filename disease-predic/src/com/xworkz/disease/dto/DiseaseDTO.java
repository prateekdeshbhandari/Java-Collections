package com.xworkz.disease.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {


    private int id;
    private String name;
    private String description;
    private String symptoms;
    private String cause;
    private String treatment;
    private String cure;
    private String prevention;
    private String etiology;






//    @Override
//    public int compareTo(DiseaseDTO o) {
//        return Integer.compare(o.id,this.id);
//    }

    @Override
    public int compareTo(DiseaseDTO o) {
        return o.name.compareTo( this.name);
    }
}
