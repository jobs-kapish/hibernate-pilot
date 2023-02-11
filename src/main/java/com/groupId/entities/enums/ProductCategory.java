package com.groupId.entities.enums;

public enum ProductCategory {

    SOFA("SOFA"), BED("BED"),

    CENTRE_TABLE("CENTRE_TABLE"), CHAIR("BEDROOMCHAIR"),

    DINING("DINING"), DINING_CHAIR("DINING_CHAIR");


    String productCategory;

    ProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
