package com.xworkz.sort.Runner;

import com.xworkz.sort.dto.Food;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodRunner {
    public static void main(String[] args) {
        Food f1 = new Food(101, "Pizza", 299.0, "Fast Food", 850.0);
        Food f2 = new Food(102, "Burger", 199.0, "Fast Food", 650.0);
        Food f3 = new Food(103, "Dosa", 120.0, "South Indian", 320.0);
        Food f4 = new Food(104, "Idli", 80.0, "South Indian", 180.0);
        Food f5 = new Food(105, "Biryani", 250.0, "Main Course", 750.0);
        Food f6 = new Food(106, "Fried Rice", 180.0, "Chinese", 580.0);
        Food f7 = new Food(107, "Noodles", 170.0, "Chinese", 540.0);
        Food f8 = new Food(108, "Paneer Butter Masala", 240.0, "North Indian", 620.0);
        Food f9 = new Food(109, "Chapati", 40.0, "North Indian", 120.0);
        Food f10 = new Food(110, "Ice Cream", 90.0, "Dessert", 280.0);
        Food f11 = new Food(111, "Cake", 350.0, "Dessert", 450.0);
        Food f12 = new Food(112, "Salad", 150.0, "Healthy", 160.0);
        Food f13 = new Food(113, "Fruit Juice", 100.0, "Beverage", 140.0);
        Food f14 = new Food(114, "Coffee", 60.0, "Beverage", 90.0);
        Food f15 = new Food(115, "Sandwich", 130.0, "Snacks", 310.0);

        List<Food> list = new ArrayList<>();

        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);
        list.add(f7);
        list.add(f8);
        list.add(f9);
        list.add(f10);
        list.add(f11);
        list.add(f12);
        list.add(f13);
        list.add(f14);
        list.add(f15);
        Collections.sort(list);
        list.forEach(System.out::println);


    }
}
