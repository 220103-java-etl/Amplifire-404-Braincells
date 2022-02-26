function gettingCharts(theChartId){
let firstChart=document.getElementById('FirstChart').getContext('2d');
let myChart= new Chart(firstChart,{
    type:'bar',
    data:{
        labels:['bar1','bar2'],
        datasets:[{
            label:'x axis',
            data:[
            20,25
        ]

    }]},
    options:{},
});

}