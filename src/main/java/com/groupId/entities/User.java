package com.groupId.entities;

import com.groupId.entities.enums.Role;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstName;
    String middleName;
    String lastName;

    String emailID;

    @Column(name = "phone_no", length = 10, unique = true)
    long phone;
    @Embedded
    Address address;
    @Enumerated(EnumType.STRING)
    Role role;

    public User() {
    }

    public User(String firstName, String middleName, String lastName, String emailID, long phone, Address address, Role role) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailID = emailID;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public long getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    public Role getRole() {
        return role;
    }
}
