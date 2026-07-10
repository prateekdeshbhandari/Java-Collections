package com.xworkz.sort.Runner;

import com.xworkz.sort.dto.BankAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BankRunner {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001001001L, "Amit", 25000.00, "Savings", "Bangalore");
        BankAccount b2 = new BankAccount(1001001002L, "Priya", 50000.00, "Current", "Mysore");
        BankAccount b3 = new BankAccount(1001001003L, "Rahul", 12000.00, "Savings", "Hubli");
        BankAccount b4 = new BankAccount(1001001004L, "Sneha", 75000.00, "Current", "Mangalore");
        BankAccount b5 = new BankAccount(1001001005L, "Kiran", 30000.00, "Savings", "Belgaum");
        BankAccount b6 = new BankAccount(1001001006L, "Pooja", 8500.00, "Savings", "Shimoga");
        BankAccount b7 = new BankAccount(1001001007L, "Rakesh", 45000.00, "Current", "Dharwad");
        BankAccount b8 = new BankAccount(1001001008L, "Anjali", 92000.00, "Savings", "Udupi");
        BankAccount b9 = new BankAccount(1001001009L, "Vikram", 67000.00, "Current", "Tumkur");
        BankAccount b10 = new BankAccount(1001001010L, "Deepa", 18000.00, "Savings", "Davanagere");
        BankAccount b11 = new BankAccount(1001001011L, "Arjun", 99000.00, "Current", "Bijapur");
        BankAccount b12 = new BankAccount(1001001012L, "Meena", 15000.00, "Savings", "Bellary");
        BankAccount b13 = new BankAccount(1001001013L, "Suresh", 40000.00, "Current", "Hassan");
        BankAccount b14 = new BankAccount(1001001014L, "Kavya", 28000.00, "Savings", "Chitradurga");
        BankAccount b15 = new BankAccount(1001001015L, "Nikhil", 60000.00, "Current", "Karwar");

        List<BankAccount> list = new ArrayList<>();

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);
        list.add(b9);
        list.add(b10);
        list.add(b11);
        list.add(b12);
        list.add(b13);
        list.add(b14);
        list.add(b15);


//        Collections.sort(list);
//        list.forEach(System.out::println);
list.stream().sorted((a1,a2)->a2.getBranch().compareTo(a1.getBranch())).forEach(System.out::println);
        System.out.println("===============================");
        list.stream().sorted((a1,a2)->Double.compare(a1.getBalance(),a2.getBalance())).forEach(System.out::println);

        System.out.println("===============================");
        list.stream().map(bankAccount -> bankAccount.getAccountNumber())
                .sorted((a1,a2)->a2.compareTo(a1)).forEach(System.out::println);
//        Comparator comparator=(a1,a2)->{
//            System.out.println(a1+""+a2);
//            return Integer.compare(a1.ge);
//        }


    }
}
