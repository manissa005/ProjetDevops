import axios from 'axios';
import {useState } from "react";

function UserRegistration() {

    const [id, setId] = useState('');
    const [name, setName] = useState("");
    const [address, setAddress] = useState("");
    const [password, setPassword] = useState("");

    async function save(event)
    {
        event.preventDefault();
        try
        {
            await axios.post("http://localhost:8081/api/v1/user/save",
                {

                    username: name,
                    address : address,
                    password : password

                });
            alert("User Registation Successfully");
            setId("");
            setName("");
            setAddress("");
            setPassword("");


        }
        catch(err)
        {
            alert("User Registation Failed");
        }
    }


    return (
        <div className="container mt-4">
            <form>
                <div class="form-group">
                    <label>Name</label>
                    <input type="text" class="form-control" placeholder="Enter Name"
                           value={name}
                           onChange={(event) =>
                           {
                               setName(event.target.value);
                           }}
                    />
                </div>

                <div class="form-group">
                    <label>Email</label>
                    <input type="text" class="form-control" placeholder="Enter Address"
                           value={address}
                           onChange={(event) =>
                           {
                               setAddress(event.target.value);
                           }}
                    />
                </div>

                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" placeholder="Enter Password"
                           value={password}
                           onChange={(event) =>
                           {
                               setPassword(event.target.value);
                           }}
                    />
                </div>

                <button class="btn btn-primary mt-4"  onClick={save}>Register</button>
            </form>
        </div>
    );
}

export default UserRegistration;
