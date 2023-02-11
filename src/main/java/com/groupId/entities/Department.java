package com.groupId.entities;

import com.groupId.entities.enums.DeptEnum;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int deptId;
    @Enumerated(EnumType.STRING)
    DeptEnum deptName;

    @ManyToMany(mappedBy = "departments")
    List<Employee> empList;

    public Department() {
    }


    public Department(DeptEnum deptName) {
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public DeptEnum getDeptName() {
        return deptName;
    }

    public List<Employee> getEmpList() {
        if (empList == null) empList = new ArrayList<>();
        return empList;
    }
}
