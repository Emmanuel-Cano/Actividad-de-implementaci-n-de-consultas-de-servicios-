import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function UserList(){

    const [users, setUsers] = useState([])
    const navigate = useNavigate()

    const getUsers = async () =>{
        const response = await fetch('https://fakestoreapi.com/users');
        const data = await response.json();

        setUsers(data)
    }

    const deleteUser = async (id) => {

        await fetch(`https://fakestoreapi.com/users/${id}`,{
            method:'DELETE'
        })

        alert("Usuario eliminado")

        getUsers()

    }


    useEffect(()=>{
    getUsers()
    },[])


    return (
        <div>
            <h1>User List</h1>
            <button onClick={()=>navigate('/users/create')}>Crear Usuario</button>
            <div className="container">
                <table border="1">
                <thead>
                    <tr>
                    <th>Nombre</th>
                    <th>Email</th>
                    <th>Telefono</th>
                    <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                
                {
                    users.map((user)=>(
                    <tr key={user.id}>
                        <td>{user.name.firstname} {user.name.lastname}</td>
                        <td>{user.email}</td>
                        <td>{user.phone}</td>
                        <td>
                        <button onClick={()=>navigate(`/users/${user.id}`)}> Ver </button>
                        <button onClick={()=>deleteUser(user.id)}> Borrar</button>
                        </td>
                    </tr>
                ))
            }
            </tbody>
            </table>
            </div>
    </div>
    )
}

export default UserList;
