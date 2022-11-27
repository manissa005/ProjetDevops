package com.kenkogroup.kenko.category.entity;

public class Category {

    Meat meat;
    Vegetable vegetable;
    Other other;


    public Category(Meat meat, Vegetable vegetable, Other other){
        this.other=other;
        this.meat=meat;
        this.vegetable = vegetable;
    }
    public Meat getMeat() {
        return meat;
    }

    public Vegetable getVegetable() {
        return vegetable;
    }
    public Other getOther(){
        return other;
    }

    public Category(Meat meat) {
        this.meat = meat;
    }

    public Category(Vegetable vege) {
        this.vegetable = vege;
    }

    public Category(Other other) {
        this.other = other;
    }
    public boolean isMeat(){
        if ((vegetable==null) && (other==null) ) return true;
        else return false;
    }
    public boolean isVegetable(){
        if ((meat==null) && (other==null) ) return true;
        else return false;
    }
    public boolean isOther(){
        if ((meat==null) && (vegetable==null) ) return true;
        else return false;
    }
}
