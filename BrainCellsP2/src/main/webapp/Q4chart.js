
function getDataForq4(url,methods,Destid){
    let xhr = new XMLHttpRequest();

    xhr.onreadystatechange = receiveData;

    xhr.open(methods, url, true) 
    xhr.send();

    function receiveData() {
       
        if (xhr.readyState == 4 && xhr.status == 200) {
            let r = xhr.responseText;
         
            let trueVals=0
            let falseVals=0
            barLabels=[];
            barHeights=[];
        

            rJson = JSON.parse(r);
                console.log(rJson)
            for(i in rJson){
                barLabels.push(rJson[i]['state'])
                barHeights.push(rJson[i]['numClaims'])
            }
            let div=document.getElementById('divForCanv')
            div.innerHTML=""
            let div2=document.getElementById('divForCanv2')
            div2.innerHTML=""
            let canvas=document.createElement('canvas')
            canvas.setAttribute('id','BarChart')
            div.append(canvas);
            gettingCharts2('BarChart',barHeights,barLabels,'Most common reason for claim per state');
        }
        else{
          

        }
    }
<<<<<<< HEAD:BrainCellsP2/src/main/webapp/Q4chart.js
function createChart(rJson){
    barHeight=[];
    barLabels=[];
    for(i in rJson){
       // let state=rJson[i]['state']
        barLabels.push(rJson[i]['reason'])
        barHeight.push(rJson[i]['numClaims'])

=======
}
function gettingCharts2(theChartId,barHeight,barLabels,xaxislabel){
    colorArray=[]
    for(i in barLabels){
        if(i%2==0){
        colorArray.push("#474C55")
        }else{
            colorArray.push("#F26925")
        }
>>>>>>> e5b3811628c802d31864b68e7d1491b5174bdb6c:BrainCellsP2/src/main/webapp/q4chart.js
    }
let firstChart=document.getElementById(theChartId).getContext('2d');
let myChart= new Chart(firstChart,{
    type:'bar',
    data:{
        labels:barLabels,
        datasets:[{
            label:xaxislabel,
            backgroundColor:colorArray,
            data:barHeight

    }]},
    options:{},
});
}