import axios from "axios"

function LoginService() {



    const login = async (email,password) => {
        return await axios.get('http://localhost:8081/api/v1/user/login/' + email +"/" + password)
    };

    return { login }
}

export default LoginService;
