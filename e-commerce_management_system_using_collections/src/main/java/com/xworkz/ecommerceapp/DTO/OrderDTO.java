package com.xworkz.ecommerceapp.DTO;

public class OrderDTO {


        private int orderId;
        private int customerId;
        private String orderDate;
        private String status;
        private double totalAmount;

        public OrderDTO(int orderId, int customerId, String orderDate, String status, double totalAmount) {
            this.orderId = orderId;
            this.customerId = customerId;
            this.orderDate = orderDate;
            this.status = status;
            this.totalAmount = totalAmount;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

}
