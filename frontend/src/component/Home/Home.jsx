import React from 'react'
import "./Home.css"
import MultiItemCarousel from './MultiItemCarousel';
import RestaurantCard from '../Restaurant/RestaurantCard'
import { Auth } from '../Auth/Auth';
const restaurant=[1,1,1,1,1,1,1,1,1]
const Home = () => {
    return (
        <div className='pb-10'>
            <section className='banner -z-50 relative flex flex-col justify-center items-center'>
                <div className="w-[50vw] z-10 text-center">
                    <p className='text-2xl lg:text-6xl font-bold z-10 py-5'>Restoox Food

                    </p>
                    <p className='z-10 text-gray-300 text-xl lg:text-4xl'>Taste the convenience : Food ,Fast and Delivered .

                    </p>

                </div>
                </section> 
            <section className='p-10 lg:py lg:px-20'>
                <p className='text-2xl font-semibold text-gray-400 py-3 pb-10'>collection food</p>
                <MultiItemCarousel/>
            </section>
            <section className='px-5 lg:px pt-5'>
                <h1 className='text2xl font-semibold text-gray-400 pb-5'> Restaurant disponible pour la commande </h1>
                <div className='flex flex-wrap items-center justify-around gap-5 '>
                    {
                        restaurant.map((item)=><RestaurantCard/>)
                    }
                </div>
            </section>
                </div>
    )
}
export default Home;