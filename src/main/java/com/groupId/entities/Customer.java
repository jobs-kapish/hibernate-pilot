package com.groupId.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class Customer {

    @Id
    int id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    List<Order> orders;

    public Customer() {
    }

    public Customer(int id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        if (orders == null) orders = new ArrayList<>();
        return orders;
    }
}
