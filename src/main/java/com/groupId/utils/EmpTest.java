package com.groupId.utils;

import javax.persistence.*;

//@Entity
public class EmpTest {
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    String firstName;
    long phone;

    public EmpTest(String firstName, long phone) {
        this.firstName = firstName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getPhone() {
        return phone;
    }
}
