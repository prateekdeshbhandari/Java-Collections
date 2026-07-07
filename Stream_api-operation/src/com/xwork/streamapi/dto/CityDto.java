package com.xwork.streamapi.dto;
@
public class CityDto {


        private String cityName;
        private String state;
        private int pincode;

        public CityDto(String cityName, String state, int pincode) {
            this.cityName = cityName;
            this.state = state;
            this.pincode = pincode;
        }

        public String getCityName() {
            return cityName;
        }

        public String getState() {
            return state;
        }

        public int getPincode() {
            return pincode;
        }



}
