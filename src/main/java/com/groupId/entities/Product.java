package com.groupId.entities;

import com.groupId.entities.enums.ProductCategory;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Enumerated(EnumType.STRING)
    ProductCategory category;

    /*String size
    @Enumerated(EnumType.STRING)
    UnitsEnum unit;*/

    @OneToMany(mappedBy = "product")
    List<Material> materialList;
    //Foam,ply,


    public Product() {
    }

    public Product(ProductCategory category, /*String size, UnitsEnum unit,*/ List<Material> materialList) {
        this.category = category;
        /*this.size = size;
        this.unit = unit;*/
        this.materialList = materialList;
    }

    public int getId() {
        return id;
    }

    public ProductCategory getCategory() {
        return category;
    }

    /*public String getSize() {
        return size;
    }

    public UnitsEnum getUnit() {
        return unit;
    }*/

    public List<Material> getMaterialList() {
        if (materialList == null) materialList = new ArrayList<>();
        return materialList;
    }
}
