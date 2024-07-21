import React from 'react';
import {BrowserRouter as Router,Routes,Route}from 'react-router-dom';
import Home from './src/pages/Home';
import Login from "./src/pages/Login";
import Dashboard from "./src/components/Dashboard";

const App = () => {
    return(
        <Router>
            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path={"login"} element={<Login/>}/>
                <Route path="/dashboard" element={<Dashboard/>}/>
            </Routes>
        </Router>
    );
};