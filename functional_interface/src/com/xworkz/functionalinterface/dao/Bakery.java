package com.xworkz.functionalinterface.dao;

@FunctionalInterface
public interface Bakery {
    double getPrice(String item, int quantity);
}
