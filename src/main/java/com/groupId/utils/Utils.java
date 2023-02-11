package com.groupId.utils;

import com.groupId.entities.Department;
import com.groupId.entities.enums.DeptEnum;

import java.util.ArrayList;
import java.util.List;

public interface Utils {

    public static Department getDeptObj(DeptEnum deptEnum) {
        return new Department(deptEnum);
    }
}
