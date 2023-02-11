package com.groupId.entities;

import com.groupId.entities.enums.UnitsEnum;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
//@Table(indexes = {@Index(name = "product_id_index", columnList = "product", unique = false)})
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    float depth;
    float width;
    float thickness;

    @Enumerated(EnumType.STRING)
    UnitsEnum unit;
    Date date;

    @ManyToOne
    @JoinColumn(name = "join_column_Product_id")
    Product product;

    public Material() {
    }

    public Material(String name, float depth, float width, float thickness, UnitsEnum unit, Date date) {
        this.name = name;
        this.depth = depth;
        this.width = width;
        this.thickness = thickness;
        this.unit = unit;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getDepth() {
        return depth;
    }

    public float getWidth() {
        return width;
    }

    public Product getProduct() {
        return product;
    }

    public float getThickness() {
        return thickness;
    }

    public UnitsEnum getUnit() {
        return unit;
    }

    public Date getDate() {
        return date;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}