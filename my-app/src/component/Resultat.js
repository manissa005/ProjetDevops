import 'bootstrap/dist/css/bootstrap.min.css';
import {useLocation} from "react-router-dom";

    const Resultat = async  (props) => {
    const location = useLocation();
    console.log(props, "props");
    console.log(location, "useLocation Hook");
    const val = location.state?.data;
    console.log(val);
    /*const[new_ingredients, setNewIngredients]=useState(null);
    setNewIngredients(oldIngredients => [...oldIngredients, { val['ingredients'][0]['quantite'], "ingredient":{"id" :id, "name" : name, "category" : category}}]);*/

   /* const quantite1 = val['ingredients'][0]['quantite'];
    const ingr1 = val['ingredients'][0]['ingredient'];
    const quantite2 = val['ingredients'][1]['quantite'];
    const ingr2 = val['ingredients'][1]['ingredient'];*/

    console.log(JSON.stringify(val));
    const url="http://localhost:8081/recipePersonalized/analyse"
    const response = await fetch(url, {
        method: 'POST',
        mode : 'cors',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(val)
    });

        const result = response.json();
        console.log("lejson de reponse", result);
        return result;
        return (
            <div>
                <h1>
                    Resultat de l'analyse de votre recette
                </h1>
            </div>
        );
}
export default Resultat;
