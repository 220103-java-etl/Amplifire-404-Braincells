function getDataForq3(url,methods,Destid) {




    let xhr = new XMLHttpRequest();

    xhr.onreadystatechange = receiveData;

    xhr.open(methods, url, true)
    xhr.send();

    function receiveData() {

        if (xhr.readyState == 4 && xhr.status == 200) {
            let r = xhr.responseText;

            let trueVals=0
            let falseVals=0

             rJson = JSON.parse(r);

             createChart(rJson);
            }
            

        }
    }

function createChart(rJson){
    barHeight=[];
    barLabels=[];
    for(i in rJson){
        let state=rJson[i]['state']
        barLabels.push(state);
        barHeight.push(rJson[i]['agentRating'])

    }
    console.log(barLabels)
    console.log(barHeight)

    

    let div2=document.getElementById('divForCanv2')
    div2.innerHTML=""
    let div=document.getElementById('divForCanv')
    div.innerHTML=""
    let canvas=document.createElement('canvas')
    canvas.setAttribute('id','SecondChart')
    canvas.setAttribute('width','800')
    canvas.setAttribute('height','800')
    div.append(canvas);
    let SecondChart=document.getElementById('SecondChart').getContext('2d');
    
    let myChart= new Chart(SecondChart,{
    type:'bar',
    data:{
        labels:barLabels,
        datasets:[{
            label:'States',
            backgroundColor: ["#F26925", "#474C55","#474C55"],
            data:
            barHeight
            

}]
},
options:{
maintainAspectRatio: false,
responsive: false,
plugins: {
title: {
display: true,
text: `Top three agent rating`
    }}
}
});

}
