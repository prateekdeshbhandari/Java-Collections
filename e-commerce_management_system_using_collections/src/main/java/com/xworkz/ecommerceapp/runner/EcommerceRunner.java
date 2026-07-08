package com.xworkz.ecommerceapp.runner;

import com.xworkz.ecommerceapp.DTO.*;

import java.awt.image.ImageProducer;
import java.util.*;
import java.util.concurrent.DelayQueue;

public class EcommerceRunner {
    public static void main(String[] args) {
        CustomerDTO customerDTO1 = new CustomerDTO(1, "Prateek", "prateek@gmail.com", 23875124934L, "JP Nagar");
        CustomerDTO customerDTO2 = new CustomerDTO(2, "Rahul", "rahul@gmail.com", 9876543210L, "BTM Layout");
        CustomerDTO customerDTO3 = new CustomerDTO(3, "Kiran", "kiran@gmail.com", 9988776655L, "Jayanagar");
        CustomerDTO customerDTO4 = new CustomerDTO(4, "Anjali", "anjali@gmail.com", 9123456789L, "Electronic City");
        CustomerDTO customerDTO5 = new CustomerDTO(5, "Sneha", "sneha@gmail.com", 9012345678L, "Rajajinagar");

//        Collection<CustomerDTO> customerDTOS=new ArrayList<>() ;
//        List<CustomerDTO> customerDTOS=new LinkedList<>() ;
//        Set<CustomerDTO> customerDTOS=new LinkedHashSet<>() ;
//        Collection<CustomerDTO> customerDTOS=new TreeSet<>() ;

//        Queue<CustomerDTO> customerDTOS=new LinkedList<>() ;
//       Collection<CustomerDTO> customerDTOS=new PriorityQueue<>() ;
//        Collection<CustomerDTO> customerDTOS=new Stack<>() ;
        List<CustomerDTO> customerDTOS=new Vector<>() ;


//        AbstractList<CustomerDTO> customerDTOS = new AbstractSequentialList<CustomerDTO>() {
//            @Override
//            public ListIterator<CustomerDTO> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//        };

        try {
            customerDTOS.add(customerDTO1);
            customerDTOS.add(customerDTO2);
            customerDTOS.add(customerDTO3);
            customerDTOS.add(customerDTO4);
            customerDTOS.add(new CustomerDTO(6, "prajwal", "prajwal@gmail.com", 4723478347l, "btm layout"));
            customerDTOS.add(customerDTO5);
        } catch (ClassCastException e) {

            System.out.println(e);



    }
        System.out.println("size in proparties..." + customerDTOS.size());


        OrderDTO order1 = new OrderDTO(101, 1, "2026-06-27", "Delivered", 1500.50);
        OrderDTO order2 = new OrderDTO(102, 2, "2026-06-28", "Pending", 2500.00);
        OrderDTO order3 = new OrderDTO(103, 3, "2026-06-29", "Shipped", 3200.75);
        OrderDTO order4 = new OrderDTO(104, 4, "2026-06-30", "Cancelled", 999.99);
        OrderDTO order5 = new OrderDTO(105, 5, "2026-07-01", "Processing", 4500.25);
        Collection<OrderDTO> orderDTOS = new ArrayList<>();
        //        Collection<orderDTOS> customerDTOS=new ArrayList<>() ;
//        Collection<OrderDTO> orderDTOS=new LinkedList<>() ;
//        Collection<OrderDTO> orderDTOS=new LinkedHashSet<>() ;
//        List<OrderDTO> orderDTOS=new TreeSet<>() ;

//        Queue<OrderDTO> orderDTOS=new LinkedList<>() ;
//       Set<OrderDTO> orderDTOS=new PriorityQueue<>() ;
//        Collection<OrderDTO> orderDTOS=new Stack<>() ;


        orderDTOS.add(order1);
        orderDTOS.add(order2);
        orderDTOS.add(order3);
        orderDTOS.add(order4);
        orderDTOS.add(order5);
        System.out.println("size in propertes..."+orderDTOS.size());


        EmployeeDTO employee1 = new EmployeeDTO(101, "Prateek", "IT", "Java Developer", 45000.00);
        EmployeeDTO employee2 = new EmployeeDTO(102, "Rahul", "HR", "HR Executive", 35000.00);
        EmployeeDTO employee3 = new EmployeeDTO(103, "Kiran", "Finance", "Accountant", 40000.00);
        EmployeeDTO employee4 = new EmployeeDTO(104, "Anjali", "Testing", "QA Engineer", 42000.00);
        EmployeeDTO employee5 = new EmployeeDTO(105, "Sneha", "Support", "Technical Support", 38000.00);

        Collection<EmployeeDTO> employeeDTOS = new ArrayList<>();
        //        Collection<EmployeeDTO> employeeDTOS=new ArrayList<>() ;
//        Collection<EmployeeDTO> employeeDTOS=new LinkedList<>() ;
//        Collection<EmployeeDTO>employeeDTOS=new LinkedHashSet<>() ;
//        List<EmployeeDTO> employeeDTOS=new TreeSet<>() ;

//        Queue<EmployeeDTO> employeeDTOS=new LinkedList<>() ;
//       Set<EmployeeDTO> employeeDTOS=new PriorityQueue<>() ;
//        Collection<EmployeeDTO employeeDTOS=new Stack<>() ;

        employeeDTOS.add(employee1);
        employeeDTOS.add(employee2);
        employeeDTOS.add(employee3);
        employeeDTOS.add(employee4);
        employeeDTOS.add(employee5);
        System.out.println("size in propertes..."+customerDTOS.size());

        InventoryDTO inventory1 = new InventoryDTO(1, "Laptop", 20, "Warehouse A", "Dell");
        InventoryDTO inventory2 = new InventoryDTO(2, "Mouse", 100, "Warehouse B", "Logitech");
        InventoryDTO inventory3 = new InventoryDTO(3, "Keyboard", 75, "Warehouse A", "HP");
        InventoryDTO inventory4 = new InventoryDTO(4, "Monitor", 30, "Warehouse C", "Samsung");
        InventoryDTO inventory5 = new InventoryDTO(5, "Printer", 15, "Warehouse B", "Canon");

        Collection<InventoryDTO> inventoryDTOS = new ArrayList<>();

        inventoryDTOS.add(inventory1);
        inventoryDTOS.add(inventory2);
        inventoryDTOS.add(inventory3);
        inventoryDTOS.add(inventory4);
        inventoryDTOS.add(inventory5);
        System.out.println("size in propertes..."+inventoryDTOS.size());

        SupplierDTO supplier1 = new SupplierDTO(1, "ABC Suppliers", "Bangalore", "Ramesh", "9876543210");
        SupplierDTO supplier2 = new SupplierDTO(2, "XYZ Traders", "Mysore", "Suresh", "9988776655");
        SupplierDTO supplier3 = new SupplierDTO(3, "Global Distributors", "Hubli", "Anil", "9123456789");
        SupplierDTO supplier4 = new SupplierDTO(4, "Tech Solutions", "Mangalore", "Priya", "9012345678");
        SupplierDTO supplier5 = new SupplierDTO(5, "Prime Suppliers", "Belgaum", "Kiran", "9871234567");

        Collection<SupplierDTO> supplierDTOS = new ArrayList<>();

        supplierDTOS.add(supplier1);
        supplierDTOS.add(supplier2);
        supplierDTOS.add(supplier3);
        supplierDTOS.add(supplier4);
        supplierDTOS.add(supplier5);
        System.out.println("size in propertes..."+supplierDTOS.size());

        CategoryDTO category1 = new CategoryDTO(1, "Electronics", "Electronic devices", 0, "Active");
        CategoryDTO category2 = new CategoryDTO(2, "Mobiles", "Smartphones and accessories", 1, "Active");
        CategoryDTO category3 = new CategoryDTO(3, "Laptops", "Laptops and notebooks", 1, "Active");
        CategoryDTO category4 = new CategoryDTO(4, "Home Appliances", "Home and kitchen products", 0, "Inactive");
        CategoryDTO category5 = new CategoryDTO(5, "Fashion", "Clothing and accessories", 0, "Active");

        Collection<CategoryDTO> categoryDTOS = new ArrayList<>();

        categoryDTOS.add(category1);
        categoryDTOS.add(category2);
        categoryDTOS.add(category3);
        categoryDTOS.add(category4);
        categoryDTOS.add(category5);
        System.out.println("size in propertes..."+customerDTOS.size());

        InvoiceDTO invoice1 = new InvoiceDTO(1001, 101, 1500.50, "2026-07-10", "Paid");
        InvoiceDTO invoice2 = new InvoiceDTO(1002, 102, 2500.00, "2026-07-12", "Pending");
        InvoiceDTO invoice3 = new InvoiceDTO(1003, 103, 3200.75, "2026-07-15", "Paid");
        InvoiceDTO invoice4 = new InvoiceDTO(1004, 104, 999.99, "2026-07-18", "Overdue");
        InvoiceDTO invoice5 = new InvoiceDTO(1005, 105, 4500.25, "2026-07-20", "Pending");

        Collection<InvoiceDTO> invoiceDTOS = new ArrayList<>();

        invoiceDTOS.add(invoice1);
        invoiceDTOS.add(invoice2);
        invoiceDTOS.add(invoice3);
        invoiceDTOS.add(invoice4);
        invoiceDTOS.add(invoice5);
        System.out.println("size in propertes..."+invoiceDTOS.size());


        ShipmentDTO shipment1 = new ShipmentDTO(201, 101, "BlueDart", "BD123456789", "2026-07-05");
        ShipmentDTO shipment2 = new ShipmentDTO(202, 102, "DTDC", "DT987654321", "2026-07-06");
        ShipmentDTO shipment3 = new ShipmentDTO(203, 103, "Delhivery", "DL456789123", "2026-07-07");
        ShipmentDTO shipment4 = new ShipmentDTO(204, 104, "India Post", "IP789123456", "2026-07-08");
        ShipmentDTO shipment5 = new ShipmentDTO(205, 105, "FedEx", "FD321654987", "2026-07-09");


        Collection<ShipmentDTO> shipmentDTOS = new ArrayList<>();

        shipmentDTOS.add(shipment1);
        shipmentDTOS.add(shipment2);
        shipmentDTOS.add(shipment3);
        shipmentDTOS.add(shipment4);
        shipmentDTOS.add(shipment5);

        System.out.println("size in propertes..."+shipmentDTOS.size());


        ReviewDTO review1 = new ReviewDTO(1, 101, 1, 5, "Excellent product");
        ReviewDTO review2 = new ReviewDTO(2, 102, 2, 4, "Very good quality");
        ReviewDTO review3 = new ReviewDTO(3, 103, 3, 3, "Average performance");
        ReviewDTO review4 = new ReviewDTO(4, 104, 4, 2, "Not satisfied");
        ReviewDTO review5 = new ReviewDTO(5, 105, 5, 5, "Highly recommended");

        Collection<ReviewDTO> reviewDTOS = new ArrayList<>();

        reviewDTOS.add(review1);
        reviewDTOS.add(review2);
        reviewDTOS.add(review3);
        reviewDTOS.add(review4);
        reviewDTOS.add(review5);
        System.out.println("size in propertes..."+reviewDTOS .size());

        DiscountDTO discount1 = new DiscountDTO(1, "SAVE10", "10% Off on Electronics", 10.0, "2026-12-31");
        DiscountDTO discount2 = new DiscountDTO(2, "WELCOME20", "20% Off for New Users", 20.0, "2026-10-15");
        DiscountDTO discount3 = new DiscountDTO(3, "FESTIVE15", "Festival Special Discount", 15.0, "2026-11-30");
        DiscountDTO discount4 = new DiscountDTO(4, "SUMMER25", "Summer Sale Offer", 25.0, "2026-08-31");
        DiscountDTO discount5 = new DiscountDTO(5, "MEGA30", "Mega Sale Discount", 30.0, "2026-09-30");

        Collection<DiscountDTO> discountDTOS = new ArrayList<>();

        discountDTOS.add(discount1);
        discountDTOS.add(discount2);
        discountDTOS.add(discount3);
        discountDTOS.add(discount4);
        discountDTOS.add(discount5);

        System.out.println("size in propertes..."+discountDTOS.size());

        discountDTOS.addAll(Arrays.);
        discountDTOS.forEach(discountDTO -> System.out.println(discountDTO));

    }


}
