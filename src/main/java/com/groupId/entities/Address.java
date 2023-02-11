package com.groupId.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    String address;
    String state;
    long pincode;

    public Address() {
    }

    public Address(String address, String state, long pincode) {
        this.address = address;
        this.state = state;
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public long getPincode() {
        return pincode;
    }
}
