package com.xworkz.sort.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Product implements Serializable,Comparable<Product> {



        private int productId;
        private String productName;
        private double price;
        private String category;
        private int stock;

    @Override
    public int compareTo(Product o) {
        Product left=this;
        Product right=o;
        return left.productName.compareTo(right.productName);










    }
}
