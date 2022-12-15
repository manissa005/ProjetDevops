import http from "../component/http-common";
const getAll = () => {
    return http.get("/getRecipes");
};
const create = data => {
    console.log( "data", data);
    return http.post("/analyse", data);
};

const RecipeService = {
    getAll,
    create,
};
export default RecipeService;
