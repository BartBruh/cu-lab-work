import React from "react";
import { NavLink } from  "react-router-dom";

function Navbar() {
    return (
        <div id="navbarID">
            <NavLink to="/">Home</NavLink>
            <NavLink to="/about">About</NavLink>
            <NavLink to="/contact">Contact</NavLink>
        </div>
    );
}

export default Navbar;