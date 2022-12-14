import 'bootstrap/dist/css/bootstrap.min.css';
import {useState, useEffect } from "react";
import ListeService from "../services/ListeService";


const ResultatListeRecettes = () => {
    const [resultatListe, setResultatListe] = useState([])

    const getAllListe = () => {
        ListeService.getListe().then(response => {
            setResultatListe(response.data)
        }).catch(e => {
            console.log(e)
        })
    }
    useEffect(() => {
        getAllListe()
    }, [])
    return (
        <div>
            <h1> Resultat de la liste des recettes </h1>
            <p>{resultatListe}
            </p>
        </div>

    )
}
export default ResultatListeRecettes;
