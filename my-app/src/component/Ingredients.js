import React from 'react';
import './Ingredients.css';
import {useState} from 'react';
import Button from 'react-bootstrap/Button';
import {Link, useLocation} from "react-router-dom";
//import {Image} from 'react';

const PRODUCTS =[
    {id : 0,name : "TOMATO",category : {vegetable : "TOMATO", meat : null, other : null}},
    {id : 1,name : "POTATO", category : {vegetable : "POTATO",  meat : null, other : null }},
    {id : 2,name : "CARROT", category : {vegetable : "CARROT", meat : null, other : null }},
    {id : 3,name : "GARLIC",category : {vegetable : "GARLIC", meat : null, other : null }},
    {id : 4,name : "EGGPLANT",category : {vegetable : "EGGPLANT", meat : null, other : null}},
    {id : 5,name : "ONION",category : {vegetable : "ONION",meat : null, other : null  }},
    {id : 6,name : "FISH",category : {meat : "FISH" , vegetable :  null, other : null}},
    {id : 7,name : "MEAT",category : {meat : "MEAT" ,  vegetable :  null, other : null}},
    {id : 8,name : "CHICKEN",category : {meat : "CHICKEN" , vegetable :  null, other : null}},
    {id : 9,name : "CHEESE",category : {other : "CHEESE", vegetable : null, meat : null }},
    {id : 10,name : "EGG",category : {other : "EGG", vegetable : null, meat : null }},
    {id : 11,name : "BREAD",category : {other : "BREAD", vegetable : null, meat : null }},
    ];
 
const Ingredients = (props) =>{
    const location = useLocation();
    console.log(props, "props");
    console.log(location, "useLocation Hook");
    const data = location.state?.data;

const[quantity, setQuantity] = useState(null);
const[name, setName] = useState(null);
const[id, setId] = useState(null);
const[taken, setTaken] = useState(null);
const[category,setCategory ] = useState(null);
const[vegetable,setVegetable ] = useState(null);
const[meat,setMeat ] = useState(null);
const[other,setOther ] = useState(null);
const [ingredients, setIngredients] = useState([]);

const onClickIngredient =  (p) =>
{
    setId(p.id);
    setName(p.name);
    setVegetable(p.vegetable);
    setMeat(p.meat);
    setOther(p.other);
    setCategory(p.category);
    //setIngredients(oldIngredients => [...oldIngredients,{ "quantity":quantity, "ingredient":{"id" :id, "name" : name, "category" : category}}]);
    console.log(ingredients);
}

    function arrayToList(array) {
        let list = null;
        for (let i = array.length - 1; i >= 0; i--) {
            list = { value: array[i]};
        }
        return list;
    }
/*let map = [];
ingredients.map((ingr) =>{
    map = [...map,{ingr[1],{ingr.ingredient.id}}]
});*/
    const new_ingredients = arrayToList(ingredients);
    const values = {
        idRecipe : data.id,
        name : data.name,
        category : data.category,
        duration : data.duration,
        description : data.description,
        taken : data.taken,
        ingredients,
    };

return (
    <div>
        <h1 className="titre">La liste des ingrédients </h1>
        <div className="container1">
            <div className="row">
                {PRODUCTS.map((product)=>(
                    <div>
                        <span>{product.name}</span>
                        <br></br>
                        <div className="button-quantite">
                            <label htmlFor="quantite" className="label-quantite">Quantité :    </label>
                            <input className="input-Ingredients"
                                   type="number"
                                   id="quantity"
                                   nanme="quantity"
                                   placeholder="number"
                                   onChange={(e) => setQuantity(e.target.value)}>
                            </input>
                            <br></br>
                  <button classeName="button-Ingredients" type="Submit" value="Ajouter"
                  onClick = {() => {
                      setIngredients(oldIngredients => [...oldIngredients, {"product" : {"id" :product.id, "name" : product.name, "category" : {"vegetable" : product.category.vegetable, "meat" : product.category.meat, "other" : product.category.other}},"quantity" : quantity }]);
                      console.log(ingredients);
                  }}> Ajouter</button>
                  </div>
                  </div>
                  ))}
                  </div>
                <div>
                    <Link to ="/Resultat" state = {{data : values}} className={"link"}> Analyser la recette </Link>
                    <Link to ="/ResultatRecettes" className={"link"}> Analyser les recettes </Link>
                </div>
        </div>
    </div>
    );
}
export default Ingredients;


