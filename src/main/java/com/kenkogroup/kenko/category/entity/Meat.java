package com.kenkogroup.kenko.category.entity;

public enum Meat{

    FISH("fish"),CHICKEN("chicken"),MEAT("meat");
    private String name;

    Meat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String analyse(Double quantite) {
        String result = "";
            if(this==FISH ) if (quantite>150) result = "La quantité recommandée de Poisson est dépassée ";
            if (this==MEAT) if (quantite>120) result = "La quantité recommandée de Viande rouge est dépassée ";
            if(this==CHICKEN) if (quantite>130) result = "La quantité recommandée de Poulet est dépassée ";
        return result;
    }
}
