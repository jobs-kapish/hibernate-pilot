package com.groupId.entities;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    public enum Type {
        SALARIED, PER_DAY_BASIS
    }

    @Id
    int id;
    boolean isActive;

    @Enumerated(EnumType.STRING)
    Type type;
    double salary;
    @Column(name =  "per_day_wage")
    double perDayWage;

    /*@OneToMany(cascade = CascadeType.ALL)*/
    /*@JoinColumn(name = "dept_fk", referencedColumnName = "id")*/
    @ManyToMany
    List<Department> departments;

    public Employee() {
    }


    public Employee(int id, boolean isActive, Type type, double salary, double perDayWage) {
        this.id = id;
        this.isActive = isActive;
        this.type = type;
        this.salary = salary;
        this.perDayWage = perDayWage;
    }

    public Employee(int id, boolean isActive, Type type, double salary, double wage, List<Department> departments) {
        this.id = id;
        this.isActive = isActive;
        this.type = type;
        this.salary = salary;
        this.perDayWage = wage;
        this.departments = departments;
    }

    public int getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public Type getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }

    public double getPerDayWage() {
        return perDayWage;
    }

    public List<Department> getDepartments() {
        if (departments == null) departments = new ArrayList<>();
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
