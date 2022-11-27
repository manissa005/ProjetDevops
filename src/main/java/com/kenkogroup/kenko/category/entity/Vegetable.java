package com.kenkogroup.kenko.category.entity;

public enum Vegetable{
    TOMATO("tomato"),POTATO("potato"),CARROT("carrot"),GARLIC("garlic"),EGGPLANT("eggplant"),ONION("onion"),PEPPER("pepper"),SPINACH("spinach"), PEA("pea"), CELERY("celery"), CORN("corn"), BROCOLI("broc");

    private String name;

    Vegetable(String name) {
        this.name = name;
    }
    public String analyse(Double quantite) {
        String result = "";
        switch(this){
            case PEPPER : if (quantite>150) result = "La quantité recommandée de Poivron est dépassée";
            case POTATO : if (quantite>110) result = "La quantité recommandée de Pomme de terre est dépassée";
            case SPINACH: if (quantite>110) result = "La quantité recommandée d'Epinard est dépassée";
            case PEA: if (quantite>150) result = "La quantité recommandée de Petits Pois est dépassée";
            case CELERY: if (quantite>120) result = "La quantité recommandée de Celeri est dépassée";
            case CORN : if (quantite>120) result = "La quantité recommandée de Mais est dépassée";
            case BROCOLI : if (quantite>100) result = "La quantité recommandée de Brocoli est dépassée";
            default : result = "";
        }
        return result;
    }
}
