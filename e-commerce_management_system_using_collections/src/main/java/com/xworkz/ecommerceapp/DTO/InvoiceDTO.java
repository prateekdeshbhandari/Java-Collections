package com.xworkz.ecommerceapp.DTO;

public class InvoiceDTO {

    private int invoiceId;
    private int orderId;
    private double amount;
    private String dueDate;
    private String paymentStatus;

    public InvoiceDTO(int invoiceId, int orderId, double amount, String dueDate, String paymentStatus) {
        this.invoiceId = invoiceId;
        this.orderId = orderId;
        this.amount = amount;
        this.dueDate = dueDate;
        this.paymentStatus = paymentStatus;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
