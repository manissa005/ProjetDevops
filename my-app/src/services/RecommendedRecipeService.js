import axios from "axios"

function RecommendedRecipeService() {
    const recommendedRecipe = async (age, weight, tall, sexe,mealType) => {
        return await axios.get('http://localhost:8081/recipe/' + age + '/' + weight +
            '/' + tall + '/' + sexe + '/' + mealType)
    };

    return { recommendedRecipe }
}

export default RecommendedRecipeService;