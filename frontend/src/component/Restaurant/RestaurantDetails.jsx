import React, { useState } from "react";
import { Divider, FormControl, Grid, Typography,RadioGroup, FormControlLabel, Radio } from "@mui/material";
import LocationOnIcon from '@mui/icons-material/LocationOn';
import DateRangeIcon from '@mui/icons-material/DateRange';
import MenuCard from "./MenuCard";

const categories=["pizza" , "lebanais" ,"makloub","baguette farcie", "sandwich thon/escalope"]

const foodTypes =[
    {label:"All" , value:"all"},
    {label:"Vegeterian only",value:'vegeterian'},
    {label:'Non-vegeterian', value:'non_vegeterian'},
    {label:"Seasonal",value:'seasonal'}
                ]
const menu=[1,1,1,1,1,1]
        const RestaurantDetails = ( ) => {
    const [foodType,setFoodType]=useState("all")
    const handleFilter=(e)=>{
        console.log(e.target.value,e.target.name)
    }
                    return (
        <div className='px-5 lg:px-20'>

        <section>
            <h3 className="text-gray-500 py-2 mt-10">Home/Tunisia/Tunisian fast food/3</h3>
            <div>
                <Grid container spacing={2}>

                    <Grid item xs={12} lg={6}>
                        <img className="w-full h-[40vh] object-cover" src="https://cache.marriott.com/is/image/marriotts7prod/mc-tunmc-tunmc-lonziemerestau37049-99330:Feature-Hor?wid=1920&fit=constrain" alt="" />
                    </Grid>
                    
                    <Grid item xs={12} lg={6}>
                        <img className="w-full h-[40vh] object-cover" src="https://resizer.otstatic.com/v2/photos/xlarge/4/28916235.webp" alt="" />
                    </Grid>
                    
                    <Grid item xs={12} lg={6}>
                        <img className="w-full h-[40vh] object-cover" src="https://img.restaurantguru.com/r5cf-Pizza_Maestro-view.jpg" alt="" />
                    </Grid>
                </Grid>
            </div>
            <div className="pt-3 pb-5">
                <h1 className='text-4xl font-semibold'>Maystro SBZ - Tunisian fast food </h1>
                <p className="items-center gap-3 text-gray-400 flex">
                    <span>
                        Découvrez nos délicieux repas à base de pizza, burger, sandwich et autres, disponibles pour une livraison rapide à domicile. Commandez dès maintenant 
                    </span>
                    
                    </p>
                    <p className="items-center gap-3 text-gray-400 flex">
                    
                    <LocationOnIcon/>
                    
                    <span>
                        Sidi bouzid ouest 9100 
                    </span>
                    
                    
                    </p>
                    <p className="items-center gap-3 text-gray-400 flex">
                    <DateRangeIcon/>
                    <span>
                     7.30h to 23h 
                    </span>
                    </p>

            </div>
        </section>
        <Divider/>
        <section className="pt-[2rem] lg:flex relative">
        <div className="space-y-10 lg:w-[20%] filter">
        <div className="box space-y lg:sticky top-28">
            <div>
                <Typography variant="h5" sx={{paddingBottom:"1rem"}}>
                Food Type
                </Typography>
                <FormControl className="py-10 space-y-5" component={"fieldset"}>
                    <RadioGroup  onChange={handleFilter} name="food_type" value={foodType}>
                       {foodTypes.map((item)=> (
            <FormControlLabel key={item.value} value={item.value} control={<Radio/>} label={item.label} />
                       ))}
                    </RadioGroup>
                </FormControl>
            </div>
            <div>
                <Typography variant="h5" sx={{paddingBottom:"1rem"}}>
                Food Category
                </Typography>
                <FormControl className="py-10 space-y-5" component={"fieldset"}>
                    <RadioGroup  onChange={handleFilter} name="food_type" value={foodType}>
                       {categories.map((item)=> (
            <FormControlLabel key={item} value={item} control={<Radio/>} label={item} />
                       ))}
                    </RadioGroup>
                </FormControl>
            </div>
        </div>
        </div>
        <div className="space-y-5 lg:w-[80%] lg:pl-10">
        {menu.map((item)=><MenuCard/>)}
        </div>
        </section>

        </div>
    )

}
export default RestaurantDetails;