import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { PieChart, Pie, Cell, Legend, Tooltip } from 'recharts';

function ResultAnalyse() {
    const [listeObjets, setListeObjets] = useState([]);
    const [listeStrings, setListeStrings] = useState([]);

    useEffect(() => {
        axios.get('/api/mon-endpoint')
            .then(response => {
                setListeObjets(response.data.listeObjets);
                setListeStrings(response.data.listeStrings);
            })
            .catch(error => {
                console.error(error);
            });
    }, []);

    function genererDonnees() {
        const donnees = listeObjets.map(obj => ({ name: obj.categorie, value: obj.pourcentage }));
        return donnees;
    }

    const couleurs = ['#0088FE', '#00C49F', '#FFBB28', '#FF8042'];

    return (
        <div>
            <h1>Mon Composant</h1>
            <PieChart width={400} height={400}>
                <Pie
                    data={genererDonnees()}
                    dataKey="value"
                    nameKey="name"
                    cx="50%"
                    cy="50%"
                    innerRadius={60}
                    outerRadius={80}
                    fill="#8884d8"
                    label
                >
                    {
                        genererDonnees().map((entry, index) => (
                            <Cell key={`cell-${index}`} fill={couleurs[index % couleurs.length]} />
                        ))
                    }
                </Pie>
                <Tooltip />
                <Legend />
            </PieChart>
            <div>
                <ul>
                    {listeStrings.map((item, index) => (
                        <li key={index}>{item}</li>
                    ))}
                </ul>
            </div>
        </div>
    );
}

export default ResultAnalyse;
