package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode

public  class StateDto implements Serializable,Comparable<StateDto> {
    private   String  capital;

    @Override
    public int compareTo(StateDto o) {
        return this.getCapital().compareTo(o.getCapital());
    }

    @Override
    public int hashCode() {
        int ref=Objects.hashCode(capital);
        ref=42*ref+Objects.hashCode(capital);return 0;
//        return ref;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StateDto stateDto = (StateDto) o;
        return Objects.equals(capital, stateDto.capital);
    }
}
