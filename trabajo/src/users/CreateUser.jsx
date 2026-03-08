import { useState } from "react";

function CreateUser(){

    const [email,setEmail] = useState('')

    const createUser = async () => {

        if(email === ''){
            alert("Email obligatorio")
            return
        }

        const response = await fetch('https://fakestoreapi.com/users',{
            method:'POST',
            headers:{
                'Content-Type':'application/json'
            },
            body: JSON.stringify({
                email
            })
        })

        const data = await response.json()

        alert("Usuario creado")

        console.log(data)

    }

    return(

        <div>

            <h1>Crear Usuario</h1>

            <input
            type="text"
            placeholder="email"
            onChange={(e)=>setEmail(e.target.value)}
            />

            <button onClick={createUser}>
                Crear
            </button>

        </div>

    )

}

export default CreateUser