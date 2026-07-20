package com.xworkz.map.runner;

import com.xworkz.map.dto.CmInstateDTO;

import java.util.HashMap;
import java.util.Map;

public class CmInstateRunnerDTO {
    public static void main(String[] args) {
        Map<CmInstateDTO,String>map=new HashMap<>();
        map.put(new CmInstateDTO("Karnataka", "Siddaramaiah"), "Bengaluru");
        map.put(new CmInstateDTO("Maharashtra", "Devendra Fadnavis"), "Mumbai");
        map.put(new CmInstateDTO("Tamil Nadu", "M. K. Stalin"), "Chennai");
        map.put(new CmInstateDTO("Kerala", "Pinarayi Vijayan"), "Thiruvananthapuram");
        map.put(new CmInstateDTO("Andhra Pradesh", "N. Chandrababu Naidu"), "Amaravati");

        map.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
