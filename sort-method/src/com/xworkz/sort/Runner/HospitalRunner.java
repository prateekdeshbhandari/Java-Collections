package com.xworkz.sort.Runner;

import com.xworkz.sort.dto.Hospital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HospitalRunner {

    public static void main(String[] args) {
        Hospital h1 = new Hospital(101, "Apollo Hospital", "Bangalore", 500, 4.8);
        Hospital h2 = new Hospital(102, "Fortis Hospital", "Mysore", 350, 4.6);
        Hospital h3 = new Hospital(103, "Manipal Hospital", "Mangalore", 450, 4.7);
        Hospital h4 = new Hospital(104, "Aster CMI", "Bangalore", 600, 4.9);
        Hospital h5 = new Hospital(105, "Narayana Health", "Bangalore", 700, 4.8);
        Hospital h6 = new Hospital(106, "KMC Hospital", "Mangalore", 300, 4.5);
        Hospital h7 = new Hospital(107, "Sparsh Hospital", "Bangalore", 280, 4.4);
        Hospital h8 = new Hospital(108, "Unity Hospital", "Mangalore", 220, 4.3);
        Hospital h9 = new Hospital(109, "Columbia Asia", "Mysore", 400, 4.6);
        Hospital h10 = new Hospital(110, "Victoria Hospital", "Bangalore", 800, 4.2);
        Hospital h11 = new Hospital(111, "Wenlock Hospital", "Mangalore", 650, 4.1);
        Hospital h12 = new Hospital(112, "Kasturba Hospital", "Manipal", 550, 4.7);
        Hospital h13 = new Hospital(113, "AJ Hospital", "Mangalore", 370, 4.5);
        Hospital h14 = new Hospital(114, "Yenepoya Hospital", "Mangalore", 480, 4.6);
        Hospital h15 = new Hospital(115, "SS Hospital", "Davanagere", 260, 4.3);

        List<Hospital> list = new ArrayList<>();

        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
        list.add(h6);
        list.add(h7);
        list.add(h8);
        list.add(h9);
        list.add(h10);
        list.add(h11);
        list.add(h12);
        list.add(h13);
        list.add(h14);
        list.add(h15);

        Comparator<Hospital>comparator=(o1,o2)->{
            System.out.println("comparing"+o1+"witch"+o2);

            return o2.getHospitalName().compareTo(o1.getHospitalName());
        };
Collections.sort(list,comparator);
list.forEach(System.out::println);
//
//Hospital hospital=new Hospital();
//Collections.sort(list,hospital);
//        list.forEach(System.out::println);



    }
}
