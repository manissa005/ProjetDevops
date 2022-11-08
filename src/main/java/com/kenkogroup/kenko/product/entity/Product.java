package com.kenkogroup.kenko.entity;

import lombok.Generated;
import lombok.ToString;

import javax.persistence.*;

@Entity
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
    String category;


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


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
