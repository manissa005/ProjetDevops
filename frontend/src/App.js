import './App.css';
import RecipeComponent from './component/RecipeComponent'
import Personnel from './component/Personnel'
import Ingredients from './component/Ingredients'
import {
  BrowserRouter as Router, Route
} from "react-router-dom";
function App() {
  return (
    <div className="container">
      <Router>
        <Route path="/recipe">
          <RecipeComponent />
        </Route>
        <Route path="/">
          <Personnel />
        </Route>
        <Route path="/ingredient">
          <Ingredients />
        </Route>
      </Router>
    </div >
  );
}
export default App;


