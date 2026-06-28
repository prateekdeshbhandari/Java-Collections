package com.xworkz.ecommerceapp.DTO;

public class ShipmentDTO {

    private int shipmentId;
    private int orderId;
    private String carrier;
    private String trackingNumber;
    private String deliveryDate;

    public ShipmentDTO(int shipmentId, int orderId, String carrier, String trackingNumber, String deliveryDate) {
        this.shipmentId = shipmentId;
        this.orderId = orderId;
        this.carrier = carrier;
        this.trackingNumber = trackingNumber;
        this.deliveryDate = deliveryDate;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}