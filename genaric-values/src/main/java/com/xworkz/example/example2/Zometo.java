package com.xworkz.example.example2;

public class Zometo<T, P > {
    public T delivariBoyName;
    public P delivariBoyNumber;
    public String delivariAddress;

    public Zometo(T delivariBoyName,P delivariBoyNumber,String delivariAddress){
        this.delivariBoyName=delivariBoyName;
        this.delivariBoyNumber=delivariBoyNumber;
        this.delivariAddress=delivariAddress;
        System.out.println("name: "+delivariBoyName);
        System.out.println("number: "+delivariBoyNumber);
        System.out.println("location: "+delivariAddress);
    }


}
