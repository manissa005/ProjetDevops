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
function App() {
  return (
    <div className="App">
     <BrowserRouter>
     <Routes>
         <Route path='/Registration' element={<UserRegistration/>}/>
         <Route path='Historique' element={<Historique/>}/>
         <Route path='/AjoutRecettes' element={<AjoutRecettes/>}/>
     <Route path='/Resultat' element={<Resultat/>}/>
         <Route path = '/ResultatListeRecettes' element = {<ResultatListeRecettes/>}/>
     <Route path='/RecipeComponent' element={<RecipeComponent/>}/>
     <Route path='/recommended' element={<RecommendedRecipeComponent/>}/>
     <Route path='/recipeotd' element={<OneRecipePerDayComponent/>}/>
     </Routes>
     </BrowserRouter>
    </div>
  );
}

export default App;

