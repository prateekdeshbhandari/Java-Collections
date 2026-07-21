package com.xworkz.map.runner;

import com.xworkz.map.dto.CmInstateDTO;
import com.xworkz.map.dto.StateDto;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class CmInstateRunnerDTO {
    public static void main(String[] args) {
        Map<CmInstateDTO, StateDto>map=new HashMap<>();
        map.put(new CmInstateDTO("Karnataka"), new StateDto("Bengaluru"));
        map.put(new CmInstateDTO("Maharashtra"), new StateDto("Mumbai"));
        map.put(new CmInstateDTO("Tamil Nadu"), new StateDto("Chennai"));
        map.put(new CmInstateDTO("Kerala"), new StateDto("Thiruvananthapuram"));
        map.put(new CmInstateDTO("Andhra Pradesh"), new StateDto("Amaravati"));
        map.put(new CmInstateDTO("Andhra Pradesh"), new StateDto("Amaravati"));
        map.forEach((key, value) -> System.out.println(key.getName() + " -> " + value.getCapital().hashCode()));



    }
}
