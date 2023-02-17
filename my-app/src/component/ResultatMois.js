import 'bootstrap/dist/css/bootstrap.min.css';
import React, {useState, useEffect } from "react";
import ListeService from "../services/ListeService";
import {Cell, Legend, Pie, PieChart, Tooltip} from "recharts";
import axios from "axios";


const ResultatListeRecettes = () => {

    const COLORS = ['#0088FE', '#00C49F', '#FFBB28', '#FF8042', '#AF19FF'];
    const [data, setData] = useState({ results :[], recommandations : []});

    useEffect(() => {
        axios.get("http://localhost:8081/recipePersonalized/analyseMonth")
            .then(response => {
                setData({ results: response.data.results, recommandations: response.data.recommandations });
            })
            .catch(error => {
                console.log(error);
            });
    }, []);
    console.log(data.results);
    console.log(data.recommandations);

    // Supprimez les chaînes en double de data.recommandations
    const uniqueRecommandations = [...new Set(data.recommandations)];
    const uniqueResults = new Set(data.results);
    return (
        <div>
            <h1 style={{ textAlign: 'center' }}>Résultat de l'analyse</h1>
            <div style={{ display: 'flex', justifyContent: 'center', alignItems: 'center' }}>
                <PieChart width={800} height={600}>
                    <Pie
                        data={data.results}
                        dataKey="quantity"
                        nameKey="category"
                        cx="50%"
                        cy="50%"
                        outerRadius={200}
                        fill="#8884d8"
                        label
                    >
                        {data.results.map((entry, index) => (
                            <Cell key={`cell-${index}`} fill={COLORS[index % COLORS.length]} />
                        ))}
                    </Pie>
                    <Legend />
                    <Tooltip />
                </PieChart>
            </div>
            <ul>
                {uniqueRecommandations.map((item, index) => (
                    <li key={index} style={{ color: COLORS[index % COLORS.length] }}>
                        {item}
                    </li>
                ))}
            </ul>
        </div>
    );
}
export default ResultatListeRecettes;
