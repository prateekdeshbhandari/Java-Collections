package com.xworkz.ecommerceapp.DTO;

public class SupplierDTO {

    private int supplierId;
    private String name;
    private String address;
    private String contactPerson;
    private String phone;

    public SupplierDTO(int supplierId, String name, String address, String contactPerson, String phone) {
        this.supplierId = supplierId;
        this.name = name;
        this.address = address;
        this.contactPerson = contactPerson;
        this.phone = phone;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
