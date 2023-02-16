import React, { useState, useEffect } from 'react'
import Table from 'react-bootstrap/Table';
//import {Link,} from "react-router-dom";
import './Historique.css';
import './Personnel.css';
import getAllListe from '../component/ResultatListeRecettes'
import getSimilaire from '../component/HistoriqueSimilaire'
import ReceiptsDataService from '../services/RecipeService'
import {Link} from "react-router-dom";
const Historique = () => {

    const [recettes, setRecettes] = useState([])
    const similaire = (id) => {
        ReceiptsDataService.postLike(id).then(response => {

        }).catch(e => {
            console.log(e)
        })
    }
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

            <h2 className="titre2">Votre historique de recettes ! </h2>
            <h5> Vous pouvez avoir une analyse complète de ce que vous avez manger en cliquant sur le bouton  !</h5>
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
                            <td><button onClick={ () => similaire(recettes.name) } >Like</button></td>

                        </tr>))}
                    </tbody>
                </Table>
                <button> <Link to = "/ResultatListeRecettes" type="button" onClick={getAllListe} className="btn btn-primary add-to-receipt">Analyser l'historique des recettes </Link></button>

            </div>
        </div>
    )
}
export default Historique;


