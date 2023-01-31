import http from "../component/http-common";
const getAll = () => {
    return http.get("/getRecipes");
};
const create = data => {
    console.log( "data", data);
    return http.post("/analyse", data);
};

const getLike = () => {
    return http.get("/getLike");
};

const postLike = id => {
    return http.get("/postLike/"+ id);
};

const RecipeService = {
    getAll,
    create,
    getLike,
    postLike
};
export default RecipeService;
