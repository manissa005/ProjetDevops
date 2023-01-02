import React, { Component } from 'react';
import Card from 'react-bootstrap/Card';
import Button from 'react-bootstrap/Button';
import ListGroup from 'react-bootstrap/ListGroup';
import OneRecipePerDayService from "../services/OneRecipePerDayService";
import './forms.css';

class OneRecipePerDayComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            s: [],
            age: 1,
            weight: 0,
            tall: 1,
            sexe: "",
            checked:"",
            mealType:"",
            calories:""
        }
    }

    render() {
        return (
            <div>
                <Button onClick={async () => {
                    try {
                        const { recipePerDay } = OneRecipePerDayService();
                        const data = await recipePerDay();
                        this.setState({ s: data.data });
                        this.setState({ recipeNumber: 1 });
                        console.log(data);
                    }
                    catch (error) {
                        console.log(error);
                    }
                }} >Valider</Button>
                {
                    this.state.s.map(
                        s =>
                            <Card className="d-flex justify-content-center" border="info" style={{ width: '18rem' }}>
                                <Card.Img variant="top" src={s.image} />
                                <Card.Body>
                                    <Card.Title>{s.label}</Card.Title>
                                    <Card.Text>

                                    </Card.Text>
                                </Card.Body>

                                <ListGroup className="list-group-flush">
                                    <ListGroup.Item><b>Prépartion</b></ListGroup.Item>
                                    {s.ingredientLines.map(line =>
                                        <ListGroup.Item><li>{line}</li></ListGroup.Item>
                                    )}


                                    <ListGroup.Item><b>Durée (mn)</b></ListGroup.Item>
                                    <ListGroup.Item>{s.totalTime}minutes</ListGroup.Item>

                                    <ListGroup.Item><b>Calories</b></ListGroup.Item>
                                    <ListGroup.Item>{String(s.calories).slice(0, 4)}Kcal</ListGroup.Item>

                                    <ListGroup.Item><b>Sugar</b></ListGroup.Item>
                                    <ListGroup.Item>{String(s.totalNutrients.SUGAR.quantity).slice(0, 2)}g</ListGroup.Item>
                                </ListGroup>

                                <Card.Body>

                                </Card.Body>
                            </Card>
                    )
                }
            </div >
        );
    }
}
export default OneRecipePerDayComponent;