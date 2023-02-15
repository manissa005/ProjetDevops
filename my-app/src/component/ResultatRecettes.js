import 'bootstrap/dist/css/bootstrap.min.css';

const ResultatRecettes = async () => {

    const url = "http://localhost:8081/recipePersonalized/analyseRecipes"
    const response = await fetch(url, {
        method: 'GET',
        mode: 'cors',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then((response) =>{return response.text()}).then((text)=> console.log(text));
    return (
        <div>
            <h1>
                Resultats
            </h1>
        </div>
    );
}
export default ResultatRecettes;