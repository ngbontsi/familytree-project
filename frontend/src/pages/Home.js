import React from "react";
import {Link}from 'react-router-dom';

const Home = () => {
    return(
        <div>
            <h1>Welcome to the family Tree Application</h1>
            <Link to="/dashboard">Go to Dashboard</Link>
        </div>
    );
};
export default Home;