import axios from "axios"

function SearchService() {

    const search = async (query) => {
        return await axios.get('http://localhost:8080/recettes/' + query.replace(" ", "+"))
    };

    return { search }
}

export default SearchService; 