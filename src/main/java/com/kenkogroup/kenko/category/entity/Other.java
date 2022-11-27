package com.kenkogroup.kenko.category.entity;

public enum Other{
    CHEESE("cheese"),EGG("egg"),BREAD("bread");
    private String name;

    Other(String name) {
        this.name = name;
    }
    public String analyse(Double quantite) {
        String result = "";
        switch(this){
            case CHEESE : if (quantite>100.0) result = "La quantité recommandée de Fromage est dépassée";
            case EGG : if (quantite>2.0) result = "La quantité recommandée d'Oeufs est dépassée";
            case BREAD: if (quantite>100.0) result = "La quantité recommandée de Pain est dépassée";
        }

        return result;
    }
}
