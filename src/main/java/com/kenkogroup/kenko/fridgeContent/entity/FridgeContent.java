/*package com.kenkogroup.kenko.fridgeContent.entity;

import lombok.ToString;

import javax.persistence.*;


@ToString
@Entity
@Table(name = "fridgeContent")

public class FridgeContent {

    @Id
    @GeneratedValue

    @Column(name="fridgeContentId",nullable = false)
    private int fridgeContentId;

    @Column(name="id",nullable = false)
    private int id; // the fridge id

    @Column(name="product")
    private String product;

    @Column(name="quantity")
    private double quantity;


    public void setFridgeContentId(int fridgeContentId)
    {
        this.fridgeContentId = fridgeContentId;
    }
    public int getFridgeContentId() {return fridgeContentId;}

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }


    public void setProduct(String product)
    {
        this.product = product;
    }
    public String getProduct()
    {
        return product;
    }

    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }
    public double getQuantity()
    {
        return quantity;
    }

}
*/