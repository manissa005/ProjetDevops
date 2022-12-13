import axios from "axios"

function SearchRecipeByNumberAndDuration() {

    const recipe = async (query, recipeNumber, duration) => {
        return await axios.get('http://localhost:8081/recipe/' + query.replace(" ", "+") + '/recipeMax/' + recipeNumber + '/duration/' + duration)
    };

    return { recipe }
}

export default SearchRecipeByNumberAndDuration; 