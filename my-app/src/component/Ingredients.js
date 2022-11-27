import React from 'react';
import './Ingredients.css';
import {useState} from 'react';
import Button from 'react-bootstrap/Button';
//import {Image} from 'react';
const PRODUCTS =[
    {name : "TOMATO", image: "./images/tomate.png"},
    {name : "POTATO", image: "./images/potato.png"},
    {name : "CARROT"},
    {name : "GARLIC"},
    {name : "EGGPLANT"},
    {name : "ONION"},
    {name : "FISH"},
    {name : "MEAT"},
    {name : "CHICKEN"},
    {name : "CHEESE"},
    {name : "EGG"},
    {name : "BREAD"},
    ];
 
const Ingredients = () =>{
const[quantite, setQuantite] = useState(null);
const[name] = useState(null);
const values = {
quantite,
name
};
    console.log(values);
    console.log("Products",PRODUCTS)
return (
    <div>
    <h1 className="titre">La liste des ingrédients </h1>
    <div className="container1">
    <div className="row">
            {PRODUCTS.map((product)=>(
                  <div>
                  <img src={product.image} alt=""/>
                  <span>{product.name}</span>
                  <br></br>
                  <div className="button-quantite">
                  <label htmlFor="quantite" className="label-quantite">Quantité :    </label>
                  <input className="input-Ingredients"
                  type="number"
                  id="quantite"
                  nanme="quantite"
                  placeholder="number"
                  onChange={(e) => setQuantite(e.target.value)}>
                  </input>
                  <br></br>
                  <Button classeName="button-Ingredients" type="Submit" value="Ajouter"> Ajouter</Button>
                  </div>
                  </div>
                  ))}
                  </div>
</div>
</div>
    );

}
export default Ingredients;


