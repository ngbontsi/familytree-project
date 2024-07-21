import React,{useState,useEffect} from "react";
import axios from 'axios';
import Memberlist from "./Memberlist";
import MemberForm from '/MemberForm';

const Dashboard = () => {
    const [members, setMembers] = useState([]);
    useEffect(()=>{
        fetchMembers();
    },[]);
    const  fetchMembers = async ()=>{
        try {
            const response = await axios.get('api/v1/members');
            setMembers(response.data)
        }catch(error){
            console.error('There was an error fetching members.',error);
        }
    };
    const addMember = async (member) => {
        try {
            const response = await axios.post('api/v1/members', member);
            setMembers([...members, response.data]);
        }catch (error) {
            console.error('Error adding Members.',error);
        }
    };
    const updateMember =async (mermber) => {
 try {
     await axios.put(`api/v1/members/${mermber.id}`,mermber)
     setMembers(members.map((m)=> (m.id ===mermber.id? mermber:m)));
 }catch (error) {
     console.error()

 }
    }
    const deleteMember = async (id) => {
        try {
            await axios.delete(`api/v1/members/${id}`);
            setMembers(members.filter((member) => member.id !== id));
        }catch (error) {
            console.error('Error deleting Member.',error);

        }
    };
    return(
        <div>
            <h1>Dashboard</h1>
            <MemberForm addMember={addMember}/>
            <Memberlist members={members} updateMember={updateMember(member)} deleteMember={deleteMember}/>
        </div>
    );
};
export default Dashboard;