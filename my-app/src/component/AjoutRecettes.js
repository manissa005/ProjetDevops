import React, { useState } from 'react'
import Form from 'react-bootstrap/Form';
import { useNavigate } from "react-router-dom";
import { useFormik, FieldArray, FormikProvider } from 'formik';
import { Button, FloatingLabel } from 'react-bootstrap';
import {Link} from "react-router-dom";
import ReceiptsDataService from "../services/RecipeService";
import './AjoutRecettes.css';
const AjoutRecettes = () => {
    const formik = useFormik({
        initialValues: {
            ingredients: [
                { product: {id: 1, name: "TOMATO", category: { vegetable: "TOMATO", meat: null, other: null }, img: "https://media.istockphoto.com/id/941825808/fr/photo/tomate-isol%C3%A9-tomate-sur-fond-blanc-avec-un-trac%C3%A9-de-d%C3%A9tourage-toute-la-profondeur-de-champ.jpg?s=612x612&w=0&k=20&c=I5YdXcbCQ8SSTNudorEVWnI6neb9EJxbqTnyFJQx0EA="}, quantity: 0 },
                { product: {id: 2, name: "POTATO", category: { vegetable: "POTATO", meat: null, other: null }, img: "https://i0.wp.com/foodlabouffe.net/wp-content/uploads/2020/04/Patate-Nouvelle.jpg?resize=1000%2C740&ssl=1"}, quantity: 0 },
                { product: {id: 3, name: "CARROT", category: { vegetable: "CARROT", meat: null, other: null }, img: "https://www.aprifel.com/wp-content/uploads/2019/02/carotte.jpg"}, quantity: 0 },
                { product: {id: 4, name: "GARLIC", category: { vegetable: "GARLIC", meat: null, other: null }, img: "https://www.fisherofnewbury.co.uk/img/dynamic/950/a/100/32187224.jpg"}, quantity: 0 },
                { product: {id: 5, name: "EGGPLANT", category: { vegetable: "EGGPLANT", meat: null, other: null }, img: "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Aubergine.jpg/640px-Aubergine.jpg"}, quantity: 0 },
                { product: {id: 6, name: "ONION", category: { vegetable: "ONION", meat: null, other: null }, img: "https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Onion_on_White.JPG/1200px-Onion_on_White.JPG"}, quantity: 0 },
                { product: {id: 7, name: "FISH", category: { meat: "FISH", vegetable: null, other: null }, img: "https://d2gg9evh47fn9z.cloudfront.net/800px_COLOURBOX3296197.jpg"}, quantity: 0 },
                { product: {id: 8, name: "MEAT", category: { meat: "MEAT", vegetable: null, other: null }, img: "https://www.seriouseats.com/thmb/i8w9XWVo8P5EELO9WBwrScep6u0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__serious_eats__seriouseats.com__images__2016__06__porterhouse2-602115d7110546f3a6a4650bab1a9d39.jpg"}, quantity: 0 },
                { product: {id: 9, name: "CHICKEN", category: { meat: "CHICKEN", vegetable: null, other: null }, img: "https://sf1.viepratique.fr/wp-content/uploads/sites/2/2014/02/shutterstock_117420241.jpg"}, quantity: 0 },
                { product: {id: 10, name: "CHEESE", category: { other: "CHEESE", vegetable: null, meat: null }, img: "https://cdn.britannica.com/60/217660-050-DBCC409A/cheddar-cheese-wedge.jpg"}, quantity: 0 },
                { product: {id: 11, name: "EGG", category: { other: "EGG", vegetable: null, meat: null }, img: "https://openseauserdata.com/files/7d44b4b62ca56eb190023b3e3074570c.jpg"}, quantity: 0 },
                { product: {id: 12, name: "BREAD", category: { other: "BREAD", vegetable: null, meat: null }, img: "https://www.thespruceeats.com/thmb/vbc6MqkqHlkSOx_X5Clyo5qv0kk=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/loaf-of-bread-182835505-58a7008c5f9b58a3c91c9a14.jpg"}, quantity: 0 }
            ]
        },
        onSubmit: values => {
        },
    });
    const navigate = useNavigate();
    const formik2 = useFormik({
        initialValues: {
            idRecipe: 0,
            name: "",
            category: 0,
            description: "",
            duration: 0,
            taken: false,
        },
        validate: (formValues) => {
            const errors = {}
            if (!formValues.name)
                errors.name = true
            if (!formValues.description)
                errors.description = true
            if (!formValues.duration)
                errors.duration = true
            return errors
        },
        isInitialValid: false,
        onSubmit: values => {
            setStep(1)
        },
    });
    const [step, setStep] = useState(0);
    const {
        values,
    } = formik;
    const handleAddReceipt = () => {
        formik.handleSubmit()
           const dataToSend = {
            ...formik.values,
            ...formik2.values
        }
        console.log("dataToSend", dataToSend)
        ReceiptsDataService.create(dataToSend)
            .then(response => {
                console.log(response.data);
                navigate('/Resultat', { state: response.data});
            })
            .catch(e => {
                console.log(e);
            });

    }
    return (

        <div>
            {step === 0 && (<div className='row'>

                <div className='col-md-12'>
                    <h1>Vous pouvez ajouter une recette</h1>
                    <h2>Fiche Recette</h2>
                    <h5>Saisissez les informations suivantes :</h5>
                </div>
                <div className='col-md-12'>
                    {JSON.stringify()}
                    <Form onSubmit={formik2.handleSubmit}>
                        <Form.Group className="mb-3" controlId="formBasicEmail">
                            <Form.Label>le titre de la recette:
                            </Form.Label>
                            <Form.Control type="text"
                                placeholder="titre" value={formik2.values.fullname}
                                onChange={formik2.handleChange}
                                name="name"
                            />

                            <Form.Label>Durée de la recette:
                            </Form.Label>
                            <Form.Control
                                type="number"
                                min={0}
                                placeholder="min"
                                name="duration"
                                value={formik2.values.duration}
                                onChange={formik2.handleChange}
                            />
                            <Form.Label>Description de la recette:
                            </Form.Label>
                            <FloatingLabel controlId="floatingTextarea2" label="Description">
                                <Form.Control
                                    type="text"
                                    placeholder="description"
                                    name="description"
                                    value={formik2.values.description}
                                    onChange={formik2.handleChange}
                                    as="textarea"
                                    style={{ height: '100px' }}
                                />
                            </FloatingLabel>
                        </Form.Group>
                        <Button className='mx-auto' variant="primary" type="submit" disabled={!formik2.isValid}>
                            Liste des ingrédients
                        </Button>
                    </Form>
                </div>
            </div>)}
            {step === 1 && (<div className='row1'>
                <div className='col-md-12'>
                    <h2 className='TitreIngredients'>Liste des ingrédients</h2>
                    <FormikProvider value={formik}>
                        <form>
                            <FieldArray name="ingredients">
                                <div className='row'>
                                    {values.ingredients.length > 0 &&
                                        values.ingredients.map((ingredient, index) => (
                                            <div className="col-md-2" key={index}>
                                                <Form.Group controlId="formGridName" className='mb-3'>
                                                    <img src={ingredient.product.img} alt={ingredient.product.name} width="150" height="150" />
                                                    <Form.Control
                                                        placeholder="Quantité"
                                                        name={`ingredients[${index}].quantity`}
                                                        value={values.ingredients[index].quantity}
                                                        onChange={formik.handleChange}
                                                        onBlur={formik.handleBlur}

                                                    />

                                                </Form.Group>
                                            </div>
                                        ))}
                                </div>
                            </FieldArray>
                            <div className='row mt-5'>
                                <div className='col-md-12 mx-auto text-center'>
                                    <button> <Link to = "/Resultat" type="button" onClick={handleAddReceipt}  className="btn btn-primary add-to-receipt">Analyser la recette </Link></button>

                                </div>
                            </div>
                        </form>
                    </FormikProvider>

                </div>
            </div>)
            }
        </div>)
}

export default AjoutRecettes;
