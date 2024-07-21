import React,{useState} from 'react';
import axios from 'axios';

const  MemberForm = () => {
    const [name, setName] = useState('');
    const [relationship, setRelationship] = useState('');
    const [birthDate, setBirthDate] = useState('');
    const [parentId, setParentId] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        const member ={name,relationship,birthDate,parentId:parentId? parentId:null}
        addMember(member);
        console.log(response.data);
        setName('');
        setRelationship('');
        setBirthDate('');
        setParentId('');
    };
    return(
        <form onSubmit={handleSubmit}>
            <div>
                <label>Name:</label>
                <input type="text" value={name} onChange={(e) => setName(e.target.value)}
                required/>
            </div>
            <div>
                <label>Relationship:</label>
                <input type="text" value={relationship} onChange={(e) => setRelationship(e.target.value)}
                required/>
            </div>
            <div>
                <label>Birth Date:</label>
                <input type="date" value={birthDate} onChange={(e) => setBirthDate(e.target.value)}
                       required/>
            </div>
            <div>
                <label>Parent ID:</label>
                <input type= "text" value={parentId} onChange={(e) => setParentId(e.target.value)}
                       />
            </div>
            <button type="submit">Submit</button>
        </form>
    );
};
export default MemberForm;