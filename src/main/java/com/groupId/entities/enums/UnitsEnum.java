package com.groupId.entities.enums;

public enum UnitsEnum {
    METRE("METRE"), FOOT("FOOT"), INCHES("INCHES"), MM("MM");

    String unit;

    UnitsEnum(String s) {
        unit = s;
    }

    public String getUnit() {
        return unit;
    }
}
