package com.xwork.Snack.dto;

import java.io.Serializable;
import java.util.Objects;

public class SnackDTO implements Serializable, Comparable<SnackDTO> {
    private String name;
    private String flavor;
    private double weight;
    private double price;

    public SnackDTO() {
    }

    public SnackDTO(String name, String flavor, double weight, double price) {
        this.name = name;
        this.flavor = flavor;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SnackDTO snackDTO = (SnackDTO) o;
        return Double.compare(snackDTO.weight, weight) == 0 &&
               Double.compare(snackDTO.price, price) == 0 &&
               name.equals(snackDTO.name) &&
               flavor.equals(snackDTO.flavor);
    }

    @Override
    public int hashCode() {

        int ref=31*name.hashCode();
        ref=31*ref+flavor.hashCode();
        ref=31*ref+(int)weight;
        ref=31*ref+(int)price;
        return ref;
    }

    @Override
    public String toString() {
        return "SnackDTO{name='" + name + "', flavor='" + flavor + "', weight=" + weight + ", price=" + price + "}";
    }

    @Override
    public int compareTo(SnackDTO o) {
        return this.name.compareTo(o.name);
    }
}
