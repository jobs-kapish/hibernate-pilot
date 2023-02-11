package com.groupId.entities.enums;

/*https://www.baeldung.com/jpa-persisting-enums-in-jpa*/
public enum Role {

    CUSTOMER("CUSTOMER"),
    EMPLOYEE("EMPLOYEE");

    String roleStr;

    Role(String roleStr) {
        this.roleStr = roleStr;
    }

    public String getRoleStr() {
        return roleStr;
    }
}
