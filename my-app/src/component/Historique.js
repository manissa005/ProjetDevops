import React, { useState, useEffect } from 'react'
import Table from 'react-bootstrap/Table';
import './Historique.css';
import './Personnel.css';
import getAllListe from '../component/ResultatListeRecettes'
import ReceiptsDataService from '../services/RecipeService'
import {Link} from "react-router-dom";
import './recetteImage.jpg';
const Historique = () => {
    const [recettes, setRecettes] = useState([]);

    const similaire = (id) => {
        ReceiptsDataService.postLike(id)
            .then((response) => {})
            .catch((e) => {
                console.log(e);
            });
    };

    const getAllRecettes = () => {
        ReceiptsDataService.getAll()
            .then((response) => {
                setRecettes(response.data);
            })
            .catch((e) => {
                console.log(e);
            });
    };

    useEffect(() => {
        getAllRecettes();
    }, []);

    return (
        <div>
            <h1 className="titre2">Historique des recettes</h1>
            <div className="container2">
                <Table className="table" striped>
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>nom</th>
                        <th>description</th>
                        <th>image</th>
                        <th>actions</th>
                    </tr>
                    </thead>
                    <tbody className="row2">
                    {recettes.map((recette, index) => (
                        <tr key={recette.id}>
                            <td>{index + 1}</td>
                            <td>{recette.name}</td>
                            <td>{recette.description}</td>
                            <td>
                                <img src={recette.image} alt={recette.name} width="70" height="70" />
                            </td>
                            <td>
                                <Button variant="primary" onClick={() => similaire(recette.id)}>
                                    Like
                                </Button>
                            </td>
                        </tr>
                    ))}
                    </tbody>
                </Table>
                <div className="button-group">
                    <Button as={Link} to="/ResultatListeRecettes" variant="primary" className="add-to-receipt">
                        Faire une analyse de mon alimentation du Jour
                    </Button>
                    <Button as={Link} to="/ResultatsSemaine" variant="primary" className="add-to-receipt">
                        Faire une analyse de mon alimentation de la Semaine
                    </Button>
                    <Button as={Link} to="/ResultatMois" variant="primary" className="add-to-receipt">
                        Faire une analyse de mon alimentation du Mois
                    </Button>
                </div>
            </div>
        </div>
    );
}
export default Historique;


