import { Button, Card } from '@mui/material'
import React from 'react'

export const OrderCard = () => {
  return (
    <Card className='flex justify-between items-center p-5'>
        <div className='flex items-center space-x-5'>
            <img className="h-16 w-16" src="https://cuisine.nessma.tv/uploads/1/2019-01/9c7c5dc13d3868d29fbc69e69b721939.jpg" alt="" />
        <div>
            <p>
                baguette farcie
            </p>
            <p>
                8.5DT
            </p>
        </div>
        </div>
        <div>
            <Button  className='cursor-not-allowed'>completed</Button>
        </div>

    </Card>
  )
}
