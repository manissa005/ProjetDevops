import axios from 'axios';

import {useState } from "react";
import LoginService from '../services/LoginService';
import { useNavigate } from 'react-router-dom';

function Login() {

    const nav = useNavigate();
    const [address, setAddress] = useState("");
    const [password, setPassword] = useState("");
    
    
 
    async function LoginComponent(event)

    {
        event.preventDefault();
        try
        {
            
            const a = await axios.get('http://localhost:8081/api/v1/user/login/' + address +"/" + password);
            console.log(address);
            console.log(password);
            console.log(a);
            nav("/recipecomponent");
            
    
        }
        catch(err)
        {
            alert("User Login Failed");
        }
    }


    async function Register(event){
        nav("/Registration");
    }

    return (
        <div className="container mt-4"
             >
            <form >
                <div className="form-group">
                    <h1> Bon retour parmis nous</h1>
                    <h2> Connectez-vous !</h2>
                    
                </div>

                <div className="form-group">
                    <label>Adresse mail</label>
                    <input type="text" class="form-control" placeholder="Entrer l'adresse"
                           value={address}
                           onChange={(event) =>
                           {
                               setAddress(event.target.value);
                           }}
                    />
                </div>

                <div className="form-group">
                    <label>Mot de passe</label>
                    <input type="password" class="form-control" placeholder="Entrer le mot de passe"
                           value={password}
                           onChange={(event) =>
                           {
                               setPassword(event.target.value);
                           }}
                    />
                </div>

               
               <button className="btn btn-primary mt-4"  onClick={LoginComponent}> Se connecter</button>
               <button className="btn btn-primary mt-4"  onClick={Register}> S'inscrire</button>
             
                
            </form>
        </div>
    );
}
export default Login;
