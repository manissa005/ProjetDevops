import axios from "axios"

function OneRecipePerDayService() {

    const recipePerDay = async () => {
        return await axios.get('http://localhost:8081/recipe/menu')
    };

    return { recipePerDay }
}

export default OneRecipePerDayService;