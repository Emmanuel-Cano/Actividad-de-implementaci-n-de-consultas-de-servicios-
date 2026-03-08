import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

function UserFindOne(){
    const { id } = useParams();
    const [user,setUser] = useState(null)

    const getUser = async () => {

        const response = await fetch(`https://fakestoreapi.com/users/${id}`)
        const data = await response.json()

        setUser(data)

    }

    useEffect(()=>{
        getUser()
    },[])

    if(!user){
        return <p>Cargando</p>
    }


    return (
        <div>
            <h1>User Find One</h1>
            <p>Nombre: {user.name.firstname} {user.name.lastname}</p>
            <p>Email: {user.email}</p>
            <p>Telefono: {user.phone}</p>
            <p>Ciudad: {user.address.city}</p>
        </div>
    )
}

export default UserFindOne;