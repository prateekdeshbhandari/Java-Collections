package com.xworkz.map.runner;

import com.xworkz.map.dto.DoctorDTO;
import com.xworkz.map.dto.HospitalDTO;

import java.util.LinkedHashMap;
import java.util.Map;

public class HospitalRunner {
    public static void main(String[] args) {
        Map<HospitalDTO, DoctorDTO>map=new LinkedHashMap<>();
        map.put(new HospitalDTO(1, "Apollo", "Bangalore", 100), new DoctorDTO(1, "Dr. Smith", "Cardiology", 10));
        map.put(new HospitalDTO(2, "Fortis", "Mumbai", 150), new DoctorDTO(2, "Dr. Johnson", "Neurology", 8));
        map.put(new HospitalDTO(3, "Max", "Delhi", 200), new DoctorDTO(3, "Dr. Williams", "Orthopedics", 12));
        map.put(new HospitalDTO(4, "AIIMS", "New Delhi", 250), new DoctorDTO(4, "Dr. Brown", "Pediatrics", 15));
        map.put(new HospitalDTO(5, "Columbia Asia", "Hyderabad", 120), new DoctorDTO(5, "Dr. Davis", "Dermatology", 6));

        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
