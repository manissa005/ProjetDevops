package com.kenkogroup.kenko.Quantity;

public class QuantityCat {
    private String category;
    private double percentage;

    public QuantityCat(String category, double percentage){
        this.category = category;
        this.percentage=percentage;
    }
    public String getCategory(){
        return this.category;
    }
    public double getPercentage(){
        return this.percentage;
    }

    public void setCategory(String category){
        this.category=category;
    }
    public void setPercentage(double percentage){
        this.percentage=percentage;
    }
}
