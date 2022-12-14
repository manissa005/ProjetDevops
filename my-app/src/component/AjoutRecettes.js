import React, { useState } from 'react'
import Form from 'react-bootstrap/Form';
import { useNavigate } from "react-router-dom";
import { useFormik, FieldArray, FormikProvider } from 'formik';
import { Button, FloatingLabel } from 'react-bootstrap';
import {Link} from "react-router-dom";
import ReceiptsDataService from "../services/RecipeService";
const AjoutRecettes = () => {
    const formik = useFormik({
        initialValues: {
            ingredients: [
                { product: {id: 1, name: "TOMATO", category: { vegetable: "TOMATO", meat: null, other: null }, img: null}, quantity: 0 },
                { product: {id: 2, name: "POTATO", category: { vegetable: "POTATO", meat: null, other: null }, img: null}, quantity: 0 },
                { product: {id: 3, name: "CARROT", category: { vegetable: "CARROT", meat: null, other: null }, img: null}, quantity: 0 },
                { product: {id: 4, name: "GARLIC", category: { vegetable: "GARLIC", meat: null, other: null }, img: null}, quantity: 0 },
                { product: {id: 5, name: "EGGPLANT", category: { vegetable: "EGGPLANT", meat: null, other: null }, img: null}, quantity: 0 },
                { product: {id: 6, name: "ONION", category: { vegetable: "ONION", meat: null, other: null }, img: null}, quantity: 0 },
                { product: {id: 7, name: "FISH", category: { meat: "FISH", vegetable: null, other: null }, img: null}, quantity: 0 },
                { product: {id: 8, name: "MEAT", category: { meat: "MEAT", vegetable: null, other: null }, img: null}, quantity: 0 },
                { product: {id: 9, name: "CHICKEN", category: { meat: "CHICKEN", vegetable: null, other: null }, img: null}, quantity: 0 },
                { product: {id: 10, name: "CHEESE", category: { other: "CHEESE", vegetable: null, meat: null }, img: null}, quantity: 0 },
                { product: {id: 11, name: "EGG", category: { other: "EGG", vegetable: null, meat: null }, img: null}, quantity: 0 },
                { product: {id: 12, name: "BREAD", category: { other: "BREAD", vegetable: null, meat: null }, img: null}, quantity: 0 }
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
                    <h2>Fiche Recettes</h2>
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
            {step === 1 && (<div className='row'>
                <div className='col-md-12'>
                    <h2>Liste des ingrédients</h2>
                    <FormikProvider value={formik}>
                        <form>
                            <FieldArray name="ingredients">
                                <div className='row'>
                                    {values.ingredients.length > 0 &&
                                        values.ingredients.map((ingredient, index) => (
                                            <div className="col-md-3" key={index}>
                                                <Form.Group controlId="formGridName" className='mb-3'>
                                                    <Form.Label className="nameIngredient">{ingredient.product.name}</Form.Label>
                                                    <Form.Control
                                                        placeholder="Quantité"
                                                        type="number"
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
                                    <button> <Link to = "/Resultat" type="button" onClick={handleAddReceipt} className="btn btn-primary add-to-receipt">Ajouter la recette </Link></button>

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
