import 'bootstrap/dist/css/bootstrap.min.css';
import {useLocation} from "react-router-dom";
import {useEffect, useState} from "react";

const Resultat = () => {
    const location = useLocation();
    console.log(location.state);
    const [result, setResult] = useState([])
    return (
    <div>
    <h1>
        Resultat de l'analyse de votre recette
    </h1>
        <p>{location.state}</p>
    </div>
    );
    /*{data.map(item => {
        return <li>{item[0]}</li>;
    })}*/
}
export default Resultat;

