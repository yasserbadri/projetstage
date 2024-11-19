import React from 'react'
import { Accordion, AccordionDetails, AccordionSummary, Button } from '@mui/material';
import  ExpandMoreIcon  from '@mui/icons-material/ExpandMore';
import FormGroup from '@mui/material/FormGroup';
import Checkbox from '@mui/material/Checkbox';
import FormControlLabel from '@mui/material/FormControlLabel';




const demo=[
    {
        category :" المكسرات والبذور" , 
        ingredient :[" fritte" , "sauce"]
    },
    {
        category :"بروتين ",
        ingredient:["3dham" ," omlette"]
    },
    {
        category:"خبز",
        ingredient:['tabouna','khobz normal']
    },
    {
        category:"خضراوات",
        ingredient :['tomate' , 'salade' , "bsal"]
    }
]

const MenuCard = () => {
    const handleCheckBoxChange=(value)=>{
        console.log("value")

    }
  return (
    <Accordion>
    <AccordionSummary
      expandIcon={<ExpandMoreIcon/>}
      aria-controls="panel1-content"
      id="panel1-header"
    >
        <div className="lg:flex items-center justify-between">
        <div className='lg:flex items-center lg:gap-5' >
            <img className="w-[7rem] h-[7rem] object-cover" src="https://www.tounsia.net/uploads/2016/12/baguettefarcie.jpg" alt="" />
            <div className='space-y-1 lg:space-y-5 lg:max-w-2xl'>
                    <p className="font-semibold text-xl">baguette farcie

                    </p>
                    <p>
                        8.5 dt
                    </p>
            </div>
        </div>
        </div>
      Accordion 1
    </AccordionSummary>
    <AccordionDetails> 
      <form>
        <div className='flex gap-5 flex-wrap'>
            {
                demo.map((item)=>(
               
                    <div>
                        <p>{item.category}</p>
                <FormGroup>
                    {item.ingredient.map((item)=> (<FormControlLabel control={<Checkbox onChange={()=>handleCheckBoxChange(item)} />} label={item} />
                    ))}
                        </FormGroup>
                    </div>
  ))
        
            }
            </div>
        <div className="pt-5">
            <Button variant="contained" type="submit" disabled={false}>
               {true?"Add to cart":"out of stock"}  
            </Button>
        </div>
      </form>
      </AccordionDetails>
  </Accordion>
    )
}

export default MenuCard