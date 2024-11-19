import { Box,Button, Card, Divider,FormHelperText,Grid,Modal, TextField } from '@mui/material'
import React from 'react'
import CartItem from './CartItem'
import AdressCard from './AdressCard'
import AddLocationAltIcon from '@mui/icons-material/AddLocationAlt';
import { AddLocation } from '@mui/icons-material';
import { ErrorMessage, Field , Form, Formik } from 'formik';
//import * as Yup from "yup"

export const style = {
    position: 'absolute' ,
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: 400,
    bgcolor: 'background.paper',
    outline:"none",
    boxShadow: 24,
    p: 4,
  };
  const initialValues={
    streetAddress:"",
    state:"",
    pincode:"",
    city:""
  }
  //const validationSchema=Yup.object.shape({
   // streetAddress:Yup.string().required("Street address is required"),
   // state:Yup.string().required("state address is required"),
   // pincode:Yup.required("pincode address is required"),
   // city:Yup.string().required("city address is required")


  //})
const items=[1,1,1,1]
const Cart = () => {
    const [open, setOpen] = React.useState(false);
  const handleClose = () => setOpen(false);
  const handleSubmit =(values)=>{
    console.log("form value",values)
  }
    const createOrderUsingSelectedAddress=()=>{

    }
    const handleOpenAddressModal=()=>setOpen(true);
  return (
    <div>

        <main className="lg:flex justify-between">
            <section className='lg:w-[30%] space-y-6 lg:min-h-screen pt-10'>
{items.map((item)=><CartItem/>)}
           <Divider/>
        <div className='billlDetails px-5 text-sm'>
            <p className='font-extralight py-5'>Commande details</p>
            <div className=' space-y-3'>
                <div className="flex justify-between text-gray-400">
                    <p>Prix selectionné</p>
                    <p>20DT</p>
                </div>
                <div className="flex justify-between text-gray-400">
                    <p>Prix Commande</p>
                    <p>25DT</p>
                </div>
                <div className="flex justify-between text-gray-400">
                    <p>Restaurant charges</p>
                    <p>3DT</p>
                </div>
                <Divider/>
            </div>
            <div className='flex justify-between text-gray-400'>
            <p>Total pay</p>
            <p>30DT</p>
            </div>
        </div> 
        </section>
        <Divider orientation='vertical' flexItem/>
        <section className='lg:w-[70%] justify-center px-5 pb-10 lg:pb-0'>
            <div>
                <h1 className="text-center font-semibold text-2xl py-10">
                    Indiquez votre adresse
                </h1>
                <div className='flex gap-5 flex-wrap justify-center'>
                    {[1,1,1,1,1].map((item)=><AdressCard handleSelectAddress={createOrderUsingSelectedAddress} item={item} showButton={true}/>
                
                )}
                <Card className='flex gap-5 w-64 p-5'>
        <AddLocation/>
        <div className='space-y-3 text-gray-400'>
            <h1 className='font-semibold text-lg text-white'>Add New Address

            </h1>
        <p>Cite rawebi Sidi bouzid ouest </p>
        
            <Button variant="outlined" fullWidth onClick={handleOpenAddressModal}>
            Add  
            </Button>
        </div>
    </Card>
                </div>
            </div>
        </section>
        </main>
        
        <Modal
  open={open}
  onClose={handleClose}
  aria-labelledby="modal-modal-title"
  aria-describedby="modal-modal-description"
>
  <Box sx={style}>
    <Formik initialValues={initialValues}
  //  validationSchema={validationSchema}
    onSubmit={handleSubmit}>
        <Form>
           <Grid container spacing={2}>
            <Grid item xs={12}>
                <Field as={TextField} 
                name="streetAdress"
                label="street Adress"
                fullWidth
                variant="outlined"
               // error={!ErrorMessage("streetAddress")}
               // helperText={
                 //   <ErrorMessage>
                   //         {(msg)=><span className='text-red-600'>{msg}</span>}
                   // </ErrorMessage>
               // }
                />
            </Grid>
            <Grid item xs={12}>
                <Field as={TextField} 
                name="state"
                label="state"
                fullWidth
                variant="outlined"
               // error={!ErrorMessage("streetAddress")}
               // helperText={
                 //   <ErrorMessage>
                   //         {(msg)=><span className='text-red-600'>{msg}</span>}
                   // </ErrorMessage>
               // }
                />
            </Grid>
                <Grid item xs={12}>
                <Field as={TextField} 
                name="city"
                label="city"
                fullWidth
                variant="outlined"
               // error={!ErrorMessage("streetAddress")}
               // helperText={
                 //   <ErrorMessage>
                   //         {(msg)=><span className='text-red-600'>{msg}</span>}
                   // </ErrorMessage>
               // }
                />
            </Grid>
                <Grid item xs={12}>
                <Field as={TextField} 
                name="pincode"
                label="pincode"
                fullWidth
                variant="outlined"
               // error={!ErrorMessage("streetAddress")}
               // helperText={
                 //   <ErrorMessage>
                   //         {(msg)=><span className='text-red-600'>{msg}</span>}
                   // </ErrorMessage>
               // }
                />

            </Grid>
            <Grid item xs={12}>
                <Button fullWidth variant="contained" type="submit" color="primary">
                    Deliver here
                </Button>
                
            </Grid>
        </Grid> 
        </Form>
        

    </Formik>
  </Box>
</Modal>
    </div>
  );
};

export default Cart