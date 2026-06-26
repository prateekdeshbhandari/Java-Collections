package com.xworkz.example.example1;

public class FlipkartRunner {


    public static void main(String[] args) {
        // Flipkart.onlineOrderApp(2,"prateek",86778752185L);
        Flipkart<Integer,String,Long> order=new Flipkart();
        order.orderId=1;
        order.orderName="prateerk";
        order.contactNumber=1234567887l;

        order.onlineOrderApp();
    }
}


