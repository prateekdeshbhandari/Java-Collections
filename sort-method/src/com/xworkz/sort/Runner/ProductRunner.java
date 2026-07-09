package com.xworkz.sort.Runner;

import com.xworkz.sort.dto.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductRunner {
    public static void main(String[] args) {


        Product p1 = new Product(101, "Laptop", 65000.0, "Electronics", 20);
        Product p2 = new Product(102, "Mobile", 25000.0, "Electronics", 50);
        Product p3 = new Product(103, "Keyboard", 1500.0, "Accessories", 80);
        Product p4 = new Product(104, "Mouse", 700.0, "Accessories", 100);
        Product p5 = new Product(105, "Monitor", 12000.0, "Electronics", 15);
        Product p6 = new Product(106, "Printer", 8500.0, "Office", 12);
        Product p7 = new Product(107, "Desk", 5000.0, "Furniture", 10);
        Product p8 = new Product(108, "Chair", 3500.0, "Furniture", 25);
        Product p9 = new Product(109, "Tablet", 18000.0, "Electronics", 18);
        Product p10 = new Product(110, "Speaker", 4000.0, "Audio", 30);
        Product p11 = new Product(111, "Headphones", 2200.0, "Audio", 45);
        Product p12 = new Product(112, "Smart Watch", 9500.0, "Wearable", 22);
        Product p13 = new Product(113, "Power Bank", 1800.0, "Accessories", 60);
        Product p14 = new Product(114, "Camera", 45000.0, "Electronics", 8);
        Product p15 = new Product(115, "Router", 3200.0, "Networking", 28);


        List<Product> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
        list.add(p11);
        list.add(p12);
        list.add(p13);
        list.add(p14);
        list.add(p15);



//        Collections.sort(list);
//        list.forEach(System.out::println);

        list.stream().sorted((a1,a2)->a2.getCategory().compareTo(a1.getCategory())).forEach(System.out::println);

    }
}