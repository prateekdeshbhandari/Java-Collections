package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class CmInstateDTO implements Serializable,Comparable<CmInstateDTO> {
  private   String  name;

    @Override
    public int compareTo(CmInstateDTO o) {
        return this.name.compareTo(o.name);
    }
}
