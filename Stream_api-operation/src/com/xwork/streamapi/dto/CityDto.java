package com.xwork.streamapi.dto;

import lombok.*;

@ToString
@Setter
@Getter


public class CityDto {


        private String cityName;
        private String state;
        private int pincode;

    public CityDto(String cityName, String state, int pincode) {
        this.cityName = cityName;
        this.state = state;
        this.pincode = pincode;
    }

}
