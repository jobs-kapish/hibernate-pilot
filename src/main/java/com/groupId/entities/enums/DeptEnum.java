package com.groupId.entities.enums;

public enum DeptEnum {

    POLISH("POLISH"),
    UPHOLSTRY("UPHOLSTRY"),
    CARPENTER("CARPENTER"),
    HELPER("HELPER");

    String deptStr;

    DeptEnum(String deptStr) {
        this.deptStr = deptStr;
    }

    public String getDeptStr() {
        return deptStr;
    }
}
