import 'bootstrap/dist/css/bootstrap.min.css';
import * as reponse from "react-bootstrap/ElementChildren";

const ResultatRecettes = async () => {

    const url = "http://localhost:8081/recipePersonalized/analyseRecipes"
    const response = await fetch(url, {
        method: 'GET',
        mode: 'cors',
        headers: {
            'Content-Type': 'application/json'
        }
    })/*.then(
        reponse.map((r,i)=>{
            console.log(i, r);
        })*/
    .then((response) =>{return response.text()}).then((text)=> console.log(text));
    //const result = response.data;
    //console.log("REPONSE", response);
    //console.log("RESULT",result);
    //return response;

    return (
        <div>
            <h1>
                Resultats
            </h1>
        </div>
    );
}
export default ResultatRecettes;