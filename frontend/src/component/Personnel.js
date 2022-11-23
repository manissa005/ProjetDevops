import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Button from 'react-bootstrap/Button';
import {Link} from "react-router-dom";
//import Ingredients from './component/Ingredients';
class Personnel extends Component{
render(){
return (
<div>
<h1> Ajouter une recette </h1>
<br></br>
<br></br>
<label>Titre :    </label>
<br></br>
<input style={{width: "300px"}}></input>
<br></br>
<br></br>
<label>Durée de la recette(min):    </label>
<br></br>
<input type="number" style={{width: "300px"}}></input>
<br></br>
<br></br>
<label>Description :    </label>
<br></br>
<input style={{width: "300px", height: "150px"}}></input>
<br></br>
<br></br>
<Button style={{width: "300px", background : "red"}}><Link to="/Ingredients"> Ajouter des ingrédients </Link></Button>
<br></br>
<br></br>
<Button style={{width: "300px"}}>Ajouter la recette</Button>
</div>
)
}

}
export default Personnel;
