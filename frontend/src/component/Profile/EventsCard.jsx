import { Card, CardActions, CardContent, CardMedia, IconButton, Typography } from '@mui/material'
import React from 'react'
import DeleteIcon from '@mui/icons-material/Delete';
export const EventsCard = () => {
  return (
    <div>
        <Card sx={{width:345}}>

        <CardMedia 
        
        sx={{height:345}}

        image="https://images.pexels.com/photos/842571/pexels-photo-842571.jpeg?auto=compress&cs=tinysrgb&w=400"/>
        <CardContent>
            <Typography variant="h5"  >
                Tunisian  fast food
            </Typography>
            <Typography variant="body2"  >
                50% off on your first order
            </Typography>
            <div className='py-2 space-y-2'>
                <p>{"Sidi bouzid"}</p>
                <p className="text-sm text-blue-500">2 aout , 2024 20:52</p>
                <p className="text-sm text-red-500">3aout , 2024 23:59
                </p>

            </div>

        </CardContent>
      {true &&  <CardActions>
            <IconButton>
                <DeleteIcon/>
            </IconButton>

        </CardActions>}
        </Card>


    </div>
  )
}
