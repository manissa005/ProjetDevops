import React, { Component } from 'react';
import Card from 'react-bootstrap/Card';
import Button from 'react-bootstrap/Button';
import ListGroup from 'react-bootstrap/ListGroup';
import RecommendedRecipeService from "../services/RecommendedRecipeService";
import './forms.css';

class RecommendedRecipeComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            s: [],
            age: 0,
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
                <form>
                    <label>Age</label>
                    <input type="text" placeholder="Age" name="Age" onChange={async (event) => {
                        const value = event.target.value;
                        this.setState({ age: value });
                    }} />
                    <br></br>
                    <label>Weight</label>
                    <input type="text" placeholder="Weight" onChange={async (event) => {
                        const value = event.target.value;
                        this.setState({ weight: value });
                    }} />
                    <br></br>
                    <label>Tall</label>
                    <input type="text" placeholder="Tall" onChange={async (event) => {
                        const value = event.target.value;
                        this.setState({ tall: value });
                    }} />
                    <br></br>
                    <fieldset data-role="controlgroup">
                        <label>Gender:</label>
                        <br></br>
                        <label htmlFor="male">Homme</label>
                        <input type="radio" name="gender" id="male" value="Homme" onChange={async (event) => {
                            const value = event.target.value;
                            this.setState({ sexe: value });
                        }}/>
                            <label htmlFor="female">Femme</label>
                            <input type="radio" name="gender" id="female" value="Femme" onChange={async (event) => {
                                const value = event.target.value;
                                this.setState({ sexe: value });
                            }}/>
                    </fieldset>
                    <fieldset data-role="">
                        <label>Type:</label>
                        <br></br>
                        <label htmlFor="breakfast">P'tit Dèj</label>
                        <input type="radio" name="type" id="breakfast" value="Breakfast" onChange={async (event) => {
                            const value = event.target.value;
                            this.setState({ mealType: value });
                            console.log(this.state.mealType)
                        }}/>
                        <label htmlFor="lunch">Déjeuner</label>
                        <input type="radio" name="type" id="lunch" value="Lunch" onChange={async (event) => {
                            const value = event.target.value;
                            this.setState({ mealType: value });
                        }}/>
                        <label htmlFor="dinner">Diner</label>
                        <input type="radio" name="type" id="dinner" value="Dinner" onChange={async (event) => {
                            const value = event.target.value;
                            this.setState({ mealType: value });
                        }}/>

                    </fieldset>
                </form>

                <Button onClick={async () => {
                    try {
                        const { recommendedRecipe } = RecommendedRecipeService();
                        const data = await recommendedRecipe(this.state.age, this.state.weight, this.state.tall, this.state.sexe,this.state.mealType);
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
                                   

                                    <ListGroup.Item><b>Durée</b></ListGroup.Item>
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



export default RecommendedRecipeComponent;