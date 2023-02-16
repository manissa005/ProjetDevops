import React, { useState, useEffect } from 'react'
import Table from 'react-bootstrap/Table';
//import {Link,} from "react-router-dom";
import './Historique.css';
import './Personnel.css';
import ReceiptsDataService from '../services/RecipeService'
import {Link} from "react-router-dom";
const HistoriqueSimilaire = () => {
    const [recettes, setRecettes] = useState([])
    const getRecetteSimilaire = () => {
        //console.log("Le parametres est");
        //console.log(id);
        ReceiptsDataService.getLike().then(response => {
            setRecettes(response.data)
        }).catch(e => {
            console.log(e)
        })
    }

    useEffect(() => {
        getRecetteSimilaire()
    }, [])
    return (
        <div>
            <h1 className="titre2">Recettes similaires</h1>
            <div className="container2">
                <Table className="table" striped="columns">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Nom recette similaire</th>
                        <th>Image recette similaire</th>
                    </tr>
                    </thead>
                    <tbody className="row2">
                    {recettes.map((recettes, index) => (
                        <tr>
                            <td>{index}</td>
                            <td>{recettes.label}</td>
                            <td><img src={recettes.image} width='70' height={70} /></td>
                        </tr>))}
                    </tbody>
                </Table>
            </div>
        </div>
    )
}
export default HistoriqueSimilaire;
