import { Component } from 'react';
import {useState} from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {BrowserRouter, Routes, Route} from "react-router-dom";

import {useLocation} from "react-router-dom";
import data from "bootstrap/js/src/dom/data";
import {render} from "@testing-library/react";

    const Resultat = async  (props) => {
    const location = useLocation();
    console.log(props, "props");
    console.log(location, "useLocation Hook");
    const val = location.state?.data;
    console.log(val);
    /*const[new_ingredients, setNewIngredients]=useState(null);
    setNewIngredients(oldIngredients => [...oldIngredients, { val['ingredients'][0]['quantite'], "ingredient":{"id" :id, "name" : name, "category" : category}}]);*/

   /* const quantite1 = val['ingredients'][0]['quantite'];
    const ingr1 = val['ingredients'][0]['ingredient'];
    const quantite2 = val['ingredients'][1]['quantite'];
    const ingr2 = val['ingredients'][1]['ingredient'];*/

   /* const new_val = {
        id : val.id,
        name : val.name,
        category : val.category,
        duration : val.duration,
        description : val.description,
        ingredients : {{quantite1.toString(),ingr1},{quantite2,ingr2}}
    }*/
    console.log(JSON.stringify(val));
    const url="http://localhost:8081/recipePersonalized/analyse"
    const response = await fetch(url, {
        method: 'POST',
        mode : 'cors',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(val)
    });
    console.log(response);
    return response.json();
        return (
            <div>
                <h1>
                    Resultat de l'analyse de votre recette
                </h1>
                <span>
                    {response}
                </span>
            </div>
        );

}
export default Resultat;
