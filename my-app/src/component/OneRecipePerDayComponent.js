import React, {Component, useState} from 'react';
import Card from 'react-bootstrap/Card';
import Button from 'react-bootstrap/Button';
import ListGroup from 'react-bootstrap/ListGroup';
import OneRecipePerDayService from "../services/OneRecipePerDayService";
import './forms.css';
import {Row} from "react-bootstrap";

class OneRecipePerDayComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            s: [],
            isDisabled: false,
            gbButton: "My menu"
        }
    }
    disable(){
        this.setState({isDisabled : true});
    }

    myMenu(){
        alert('Hi there!');
        this.setState({gbButton : "See you Tomorrow"});
    }

    render() {

        return (
            <div>
                <div>
                <Button disabled={this.state.isDisabled} onClick={async () => {
                    try {
                        const { recipePerDay } = OneRecipePerDayService();
                        const data = await recipePerDay();
                        this.setState({ s: data.data });
                        this.setState({ recipeNumber: 1 });
                        this.disable()
                        this.myMenu()

                        console.log(data);
                    }
                    catch (error) {
                        console.log(error);
                    }
                }} >{this.state.gbButton}</Button>
                </div>

                {
                    this.state.s.map(
                        s =>
                            <Card border="info" style={{width: '25rem', padding: '1rem', display: 'inline-flex' }}>
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