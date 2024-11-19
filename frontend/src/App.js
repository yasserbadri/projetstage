import logo from './logo.svg';
import './App.css';
import { CssBaseline, ThemeProvider } from '@mui/material';
import { darkTheme } from './Theme/DarkTheme';
import { Navbar } from './component/Navbar/Navbar';
import  Home  from './component/Home/Home';
import RestaurantDetails from './component/Restaurant/RestaurantDetails';
import Cart from './component/Cart/Cart';
import Profile from './component/Profile/Profile';
import { CustomerRoute } from './Routers/CustomerRoute';
import { Auth } from './component/Auth/Auth';
import { getUser } from './component/State/Authentification/Action';
import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { store } from './component/State/store';

function App() {
  const dispatch=useDispatch();
  const jwt=localStorage.getItem('jwt');
  const {auth}=useSelector((store)=>store);
  useEffect(()=>{
    dispatch(getUser(auth.jwt || jwt));
  },[auth.jwt]);
  return (
    <ThemeProvider theme={darkTheme}>
      <CssBaseline/>
      {/*<Navbar/>*/}
     {/* <Home/> */}
     {/* <RestaurantDetails/>*/}
    {/* <Cart/>*/}
    {/* <Profile/>*/}
     <CustomerRoute/>
     

    </ThemeProvider>
    
  );
}

export default App;
