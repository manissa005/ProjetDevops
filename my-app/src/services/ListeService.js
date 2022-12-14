import http from "../component/http-common";
const getListe = () => {
    return http.get("/analyseRecipes");
};
const ListeService = {
    getListe,
};
export default ListeService;
