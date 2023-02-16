package com.kenkogroup.kenko.Quantity;

public class QuantityCat {
    private String category;
    private double percentage;
    private double quantity;

    public QuantityCat(String category, double percentage, double quantity){
        this.category = category;
        this.percentage=percentage;
        this.quantity = quantity;
    }
    public String getCategory(){
        return this.category;
    }
    public double getPercentage(){
        return this.percentage;
    }
    public double getQuantity(){
        return this.quantity;
    }

    public void setCategory(String category){
        this.category=category;
    }
    public void setPercentage(double percentage){
        this.percentage=percentage;
    }
    public void setQuantity(double quantity){this.quantity=quantity;}
}
