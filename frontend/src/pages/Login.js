import React, {useState} from 'react';
import axios from 'axios';
import {useNavigate} from 'react-router-dom';

const Login = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const response = await axios.post('/api/v1/authenticate', {username, password});
            localStorage.setItem('token', response.data.jwt);
            navigate('/dashboard')
        }catch (error) {
            console.error('Error adding Authentication.',error);
        }
    };
    return(
        <div>
            <h1>Login</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Username:</label>
                    <input type="text" value={username} onChange={(e) => setUsername(e.target.value)}
                           required/>
                </div>
                <div>
                    <label>Password:</label>
                    <input type="password" value={password} onChange={(e) => setPassword(e.target.value)}
                    required/>
                </div>
                <button type="submit">Login</button>
            </form>
        </div>
    );
};
export default Login;