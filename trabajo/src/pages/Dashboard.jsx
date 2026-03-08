import { useAuth } from "../security/authContext";
import { useNavigate } from "react-router-dom";

function Dashboard() {
    const { logout} = useAuth();
    const navigate = useNavigate();
    return (
        <div>
            <h1>Dashboard</h1>
            <button onClick={()=>navigate('/users/list')}>Ver Usuarios</button>
            <button onClick={logout}>Logout</button>
        </div>
    )
}

export default Dashboard;