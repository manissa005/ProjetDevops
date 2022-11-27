package com.kenkogroup.kenko.product.entity;

import com.kenkogroup.kenko.category.entity.Category;
import com.kenkogroup.kenko.category.entity.Meat;
import com.kenkogroup.kenko.category.entity.Other;
import com.kenkogroup.kenko.category.entity.Vegetable;
import lombok.ToString;

import javax.persistence.*;

//@Entity
@Table (name="Product")
@ToString
public class Product {
    @Id
    @GeneratedValue

    @Column(name="id",nullable = false)
    private int id;
    @Column(name="name",nullable = false)
    String name;
    @Column(name="category", nullable = false)
    Category category;

    public Product(int id, String name, Category category) {
        this.id=id;
        this.name=name;
        this.category=category;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

}
