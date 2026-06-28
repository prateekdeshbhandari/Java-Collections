package com.xworkz.ecommerceapp.DTO;

public class DiscountDTO {

    private int discountId;
    private String code;
    private String description;
    private double percentage;
    private String expiryDate;

    public DiscountDTO(int discountId, String code, String description, double percentage, String expiryDate) {
        this.discountId = discountId;
        this.code = code;
        this.description = description;
        this.percentage = percentage;
        this.expiryDate = expiryDate;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
