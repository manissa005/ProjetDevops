import {useState} from 'react';
import React from 'react';
import './Personnel.css'
//import 'bootstrap/dist/css/bootstrap.min.css';
//import Button from 'react-bootstrap/Button';
import {Link, Route, Routes} from "react-router-dom";
import Ingredients from "./Ingredients";
//import Ingredients from './component/Ingredients';
const Personnel = () => {
const[name, setName] = useState(null);
const[duration, setDuration] = useState(null);
//const[id,setId] = useState(null);
//const[category, setCategory] = useState(null);
    const idRecipe = 0;
    const category = 1;
    const taken = false
const[description, setDescription] = useState(null);
const values = {
    idRecipe,
    name,
    category,
    duration,
    description,
    taken
};
console.log(values);
return (
<div>
<h1 className="h1-Personnel"> Fiche Recettes </h1>
<form className="Personnel-form">
<div className="form-content">
<label htmlFor="titre" className="label-personnel"> le titre de la recette: </label>
<input
className="input-Personnel"
type="text"
id="titre"
nanme="titre"
placeholder="Titre"
onChange={(e) => setName(e.target.value)}
/>
<label htmlFor="durée" className="label-personnel"> Durée de la recette: </label>
<input
className="input-Personnel"
type="number"
id="durée"
nanme="durée"
placeholder="min"
onChange={(e) => setDuration(e.target.value)}
/>
<label htmlFor="description" className="label-personnel"> Description de la recette: </label>
<textarea
className="message-Personnel"
id="description"
cols="20"
rows="10"
nanme="description"
onChange={(e) => setDescription(e.target.value)}>
</textarea>
    <Link to = "/Ingredients" state = {{data : values}} className="link"> Ajouter ingredients </Link>
<button className="button1-Personnel" type="Submit" value="Ajouter la recette"> Ajouter la recette
</button>
</div>
</form>
</div>
)
}

export default Personnel;
