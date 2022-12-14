import React, { useState, useEffect } from 'react'
import Table from 'react-bootstrap/Table';
//import {Link,} from "react-router-dom";
import './Historique.css';
import './Personnel.css';
import getAllListe from '../component/ResultatListeRecettes'
import ReceiptsDataService from '../services/RecipeService'
import {Link} from "react-router-dom";
const Historique = () => {
    const [recettes, setRecettes] = useState([])
       /* {
            id: 1,
            name: 'Pomme de terre au four',
            category: '0',
            ingredients: ['pomme de terre', 'oignon', 'fromage'],
            description: 'Couper les oignons avec les pommes de terres, les mettre au four et ajouter du fromage',
            image: 'https://assets.afcdn.com/recipe/20221006/135761_w1024h1024c1cx1112cy833.webp'
        },
        {
            id: 2,
            name: 'Tomates farcies',
            category: '0',
            ingredients: ['Tomates', 'viande', 'fromage'],
            description: 'Farcir les tomates avec de la viande et ajouter du fromage, laisser cuir 30 min',
            image: 'https://assets.afcdn.com/recipe/20171012/73069_w1024h768c1cx1944cy1292.webp'
        },
        {
            id: 3,
            name: 'Courgette farcies',
            category: '0',
            ingredients: ['Courgettes', 'viande', 'fromage'],
            description: 'Farcir les courgettes avec de la viande et ajouter du fromage, laisser cuir 30 min',
            image: 'https://assets.afcdn.com/recipe/20180601/79378_w1024h1024c1cx2000cy3000.webp'
        }])*/
    const getAllRecettes = () => {
        ReceiptsDataService.getAll().then(response => {
            setRecettes(response.data)
        }).catch(e => {
            console.log(e)
        })
    }

    useEffect(() => {
        getAllRecettes()
    }, [])
    return (
        <div>
           <h1 className="titre2">Historique des recettes </h1>
           <div className="container2">
            <Table className="table" striped="columns">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>nom</th>
                        <th>description</th>
                        <th>image</th>
                    </tr>
                </thead>
                <tbody className="row2">
                    {recettes.map((recettes, index) => (
                        <tr>
                            <td>{index}</td>
                            <td>{recettes.name}</td>
                            <td>{recettes.description}</td>
                            <td><img src={recettes.image} width='70' height={70} /></td>
                        </tr>))}
                </tbody>
            </Table>
               <button> <Link to = "/ResultatListeRecettes" type="button" onClick={getAllListe} className="btn btn-primary add-to-receipt">Analyser l'historique des recettes </Link></button>
        </div>
        </div>
    )
}
export default Historique;
