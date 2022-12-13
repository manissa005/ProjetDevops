import './App.css';
import {BrowserRouter, Routes, Route} from "react-router-dom";
import Ingredients from './component/Ingredients';
import Personnel from './component/Personnel';
import Resultat from './component/Resultat';
import RecipeComponent from './component/RecipeComponent'
import ResultatRecettes from "./component/ResultatRecettes";
function App() {
  return (
    <div className="App">
     <BrowserRouter>
     <Routes>
     <Route path='/personnel' element={<Personnel/>}/>
     <Route path='/Ingredients' element={<Ingredients/>}/>
     <Route path='/Resultat' element={<Resultat/>}/>
         <Route path = '/ResultatRecettes' element = {<ResultatRecettes/>}/>
     <Route path='/RecipeComponent' element={<RecipeComponent/>}/>
     </Routes>
     </BrowserRouter>
    </div>
  );
}

export default App;
