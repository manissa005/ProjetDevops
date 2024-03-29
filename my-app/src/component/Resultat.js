import React, { useState } from 'react';
import { PieChart, Pie, Cell, Legend, Tooltip } from 'recharts';
import { useLocation } from 'react-router-dom';

const Resultat = () => {
    const location = useLocation();
    const data = location.state;
    const COLORS = ['#0088FE', '#00C49F', '#FFBB28', '#FF8042', '#AF19FF'];

    // Supprimez les chaînes en double de data.recommandations
    const uniqueRecommandations = [...new Set(data.recommandations)];

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
};

export default Resultat;