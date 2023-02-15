import React from "react";
import Chart from "react-apexcharts";
function PieChart()
{

    return(
        <React.Fragment>
            <div class Name="container-fluid">
                <h3> Résultatsdel'analyse </h3>
                <Chart
                    type="pie"
                    width={1349}
                    height={550}
                    series={[23,43,50,54,65]}
                    options={{
                        labels:['produits laitiers','féculents','fruits et légumes','viandes et oeufs','sucre']
                    }}
                >

                </Chart>
            </div>
        </React.Fragment>
    )

}
export default PieChart;