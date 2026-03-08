import "./components/components-style.css";
import { Routes, Route, Navigate } from "react-router-dom";
import Home from "./pages/Home";
import Login from "./pages/Login";
import Dashboard from "./pages/Dashboard";
import Page404 from "./pages/Page404";
import UserFindOne from "./users/UserFindOne";
import UserList from "./users/UserList";
import Users from "./users/Users";
import ProtectedRoutes from "./routes/ProtectedRoutes";
import { useAuth } from "./security/authContext";
import CreateUser from "./users/CreateUser";

function App() {
  const { isLoggedIn : isAllowed } = useAuth();

  return (
    <>
      {isAllowed ? (
        <Routes>
          <Route path="/login" element={<Navigate to="/dashboard" />} />
          
          <Route element={<ProtectedRoutes isAllowed={isAllowed} />}>
            <Route path="/dashboard" element={<Dashboard />} />
          </Route>

          <Route path="/users" element={<Users />}>
            <Route path="list" element={<UserList />} />
            <Route path=":id" element={<UserFindOne />} />
          </Route>
          <Route path="/users/create" element={<CreateUser />} />

          <Route path="/" element={<Navigate to='/dashboard' />} />
          <Route path="*" element={<Page404 />} />
        </Routes>
      ) : (
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/login" element={<Login />} />
          <Route path="*" element={<Navigate to='/' />} />
        </Routes>
      )}
    </>
  );
}

export default App;