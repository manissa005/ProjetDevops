package com.kenkogroup.kenko.recipePersonalized.repository;
import com.kenkogroup.kenko.Quantity.QuantityCat;

import java.util.List;

public class Analyse {

    private List<String> recommandations;
    private List<QuantityCat> results;

    public Analyse(List<QuantityCat> results, List<String> recommandations) {
        this.results=results;
        this.recommandations = recommandations;
    }

    public List<String> getRecommandations(){
        return recommandations;
    }
    public List<QuantityCat> getResults(){
        return results;
    }
}
