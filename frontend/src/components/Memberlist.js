import React,{useEffect,useState} from "react";
import axios from 'axios';
const Memberlist = () => {
    const  [members,setMember]=useState([]);

    useEffect(() =>{
        axios.get('api/v1/members')
            .then(response =>{
                setMember(response.data);
            })
            .catch(error =>{
                console.error('There was an error fetching members.',error);
            });
            },[]);
    return(
        <div>
            <h2>Family Members</h2>
            <ul>
                {members.map(member =>(
                    <li key={member.id}>
                        {member.name} (Born: {member.birthDate} - Parent ID{member.parentId}
                        <button onClick={() => updateMember(member)}>Update</button>
                        <button onClick={() => deleteMember(member)}>Delete</button>
                    </li>
                ))}
            </ul>
        </div>
    );
};
export default Memberlist;