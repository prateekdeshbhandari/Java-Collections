package com.xworkz.functionalinterface.dao;

@FunctionalInterface
public interface Hospital {
    String getDoctor(String department, int roomNo);
}
