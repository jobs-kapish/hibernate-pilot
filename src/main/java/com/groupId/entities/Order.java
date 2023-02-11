package com.groupId.entities;

import javax.persistence.*;

//@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int orderId;
    long orderDate;
    long expectedDeliveryDate;
    int itemId;
    String itemImgUrl;
    String comments;
    String sizeComments;
    @ManyToOne
    Customer customer;

    public Order() {
    }

    public Order(long orderDate, long expectedDeliveryDate, int itemId, String itemImgUrl, String comments, String sizeComments/*, Customer customerId*/) {
        this();
        this.orderDate = orderDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.itemId = itemId;
        this.itemImgUrl = itemImgUrl;
        this.comments = comments;
        this.sizeComments = sizeComments;
//        this.customerId = customerId;
    }

    public long getOrderId() {
        return orderId;
    }

    public long getOrderDate() {
        return orderDate;
    }

    public long getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemImgUrl() {
        return itemImgUrl;
    }

    public String getComments() {
        return comments;
    }

    public String getSizeComments() {
        return sizeComments;
    }
/*
    public Customer getCustomerId() {
        return customerId;
    }*/
}
