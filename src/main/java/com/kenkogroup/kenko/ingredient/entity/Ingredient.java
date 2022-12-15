package com.kenkogroup.kenko.ingredient.entity;

import com.kenkogroup.kenko.product.entity.Product;

import javax.persistence.*;

//@Entity
//@Table(name = "ingredient")
public class Ingredient {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="idIngredient", nullable=false) //peut poser pb le nom de la colonne
    private int idIngredient;
    Product product;
    Double quantity;

    public Ingredient(Product product, Double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
