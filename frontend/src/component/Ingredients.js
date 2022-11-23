import React, { Component } from 'react';
import Button from 'react-bootstrap/Button';
const PRODUCTS =[
    {category: "Vegetable", name : "TOMATO", img: "./component/tomate.jpg"},
    {category: "Vegetable", name : "POTATO", img:"/IMG_20220704_133559.jpg"},
    {category: "Vegetable", name : "CARROT" ,img : "/IMG_20220704_133559.jpg"},
    {category: "Vegetable", name : "GARLIC", img:"/IMG_20220704_133559.jpg"},
    {category: "Vegetable", name : "EGGPLANT", img:"/IMG_20220704_133559.jpg"},
    {category: "Vegetable", name : "ONION", img: "/IMG_20220704_133559.jpg"},
    {category: "Meat", name : "FISH", img: "/IMG_20220704_133559.jpg"},
    {category: "Meat", name : "MEAT", img: "/IMG_20220704_133559.jpg"},
    {category: "Meat", name : "CHICKEN", img: "/IMG_20220704_133559.jpg"},
    {category: "Other", name : "CHEESE", img: "/IMG_20220704_133559.jpg"},
    {category: "Other", name : "EGG", img: "/IMG_20220704_133559.jpg"},
    {category: "Other", name : "BREAD", img: "/IMG_20220704_133559.jpg"},
    ];
class Ingredients extends Component {

render(){
    console.log("Products",PRODUCTS)
return (
   <>
       <h1>Ingredients : </h1>
               {PRODUCTS.map((product)=>(
                   <div>
                   <br></br>
                   <br></br>
                   <span>Categorie : {product.category}</span>
                   <br></br>
                   <span>Nom : {product.name}</span>
                   <br></br>
                   <lable>Quantité :    </lable>
                   <input></input>
                   <br></br>
                   <Button> Ajouter</Button>
                   </div>
               ))}
       </>

       );
}
}
export default Ingredients;
