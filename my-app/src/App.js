import './App.css';
import {BrowserRouter, Routes, Route} from "react-router-dom";
import ResultatListeRecettes from './component/ResultatListeRecettes';
import Resultat from './component/Resultat';
import RecipeComponent from './component/RecipeComponent';
import RecommendedRecipeComponent from './component/RecommendedRecipeComponent';
import AjoutRecettes from './component/AjoutRecettes';
import Historique from './component/Historique';
import OneRecipePerDayComponent from './component/OneRecipePerDayComponent';
import UserRegistration from "./component/UserRegistration";
import Login from './component/Login';
import HistoriqueSimilaire  from "./component/HistoriqueSimilaire";

function ResultatMois() {
    return null;
}

function ResultatsSemaine() {
    return null;
}

function App() {
  return (

      <>
          <>
          <nav className="navbar navbar-expand-lg navbar-light bg-light">
              <div className="container-fluid">
                  <a className="navbar-brand" href="#">KENKO</a>
                  <button className="navbar-toggler" type="button" data-bs-toggle="collapse"
                          data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false"
                          aria-label="Toggle navigation">
                      <span className="navbar-toggler-icon"></span>
                  </button>
                  <div className="collapse navbar-collapse" id="navbarText">
                      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                          <li className="nav-item">
                              <a className="nav-link active" aria-current="page" href="/recipeotd">Recettes du jour</a>
                          </li>
                          <li className="nav-item">
                              <a className="nav-link active" aria-current="page" href="/Historique">Historique</a>
                          </li>

                          <li className="nav-item">
                              <a className="nav-link" href="/HistoriqueSimilaire">Recettes similaires</a>
                          </li>

                          <li className="nav-item">
                              <a className="nav-link" href="/recommended">Recettes recommandées</a>
                          </li>
                          <li className="nav-item">
                              <a className="nav-link" href="/ajoutrecettes">Ajouter une recette</a>
                          </li>
                          <li className="nav-item">
                              <a className="nav-link" href="/recipecomponent">Chercher une recette</a>
                          </li>
                          <li className="nav-item">
                              <a className="nav-link" href="/login">Se connecter</a>
                          </li>
                          <li className="nav-item">
                              <a className="nav-link" href="/Registration">Inscription</a>
                          </li>
                      </ul>
                  </div>
              </div>
          </nav>
          </>
        <div className="App">
         <BrowserRouter>
             <Routes>
                 <Route path='/registration' element={<UserRegistration/>}/>
                 <Route path='historique' element={<Historique/>}/>
                 <Route path='/ajoutrecettes' element={<AjoutRecettes/>}/>
                 <Route path='/resultat' element={<Resultat/>}/>
                 <Route path = '/resultatlisterecettes' element = {<ResultatListeRecettes/>}/>
                 <Route path='/recipecomponent' element={<RecipeComponent/>}/>
                 <Route path='/recommended' element={<RecommendedRecipeComponent/>}/>
                 <Route path='/recipeotd' element={<OneRecipePerDayComponent/>}/>
                 <Route path='/Login' element={<Login/>}/>
                 <Route path='/HistoriqueSimilaire' element={<HistoriqueSimilaire/>}/>
                 <Route path='/ResultatsSemaine' element={<ResultatsSemaine/>}/>
                 <Route path='/ResultatMois' element={<ResultatMois/>}/>

             </Routes>
         </BrowserRouter>
        </div>
      </>
  );
}

export default App;

