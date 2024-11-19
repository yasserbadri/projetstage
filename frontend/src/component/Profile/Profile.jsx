import React from 'react'
import { ProfileNavigation } from './ProfileNavigation'
import { Route, Routes } from 'react-router-dom'
import UserProfile from './UserProfile'
import { Address } from './Address'
import { Orders } from './Orders'
import { Events } from './Events'
import { Favorites } from './Favorites'

const Profile = () => {
  return (
    <div className="lg:flex justify-between">
        <div className="sticky h-[80vh] lg:w-[20%]">
            <ProfileNavigation/>
        </div>
        <div className='lg:w-[80%]'>
<Routes>
<Route path='/' element={<UserProfile/>}/>
<Route path='/orders' element={<Orders/>}/>
<Route path='/address' element={<Address/>}/>
<Route path='/favorite' element={<Favorites/>}/>

<Route path='/events' element={<Events/>}/>







</Routes>
        </div>
    </div>
  )
}

export default Profile