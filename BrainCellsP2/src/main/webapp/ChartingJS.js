let value1=0

let states=['Alabama','Alaska','Arizona','Arkansas','California','Colorado','Connecticut','Delaware','Florida','Georgia','Hawaii','Idaho','Illinois','Indiana','Iowa','Kansas','Kentucky','Louisiana','Maine','Maryland','Massachusetts','Michigan','Minnesota','Mississippi','Missouri','Montana','Nebraska','Nevada','New Hampshire','New Jersey','New Mexico','New York','North Carolina','North Dakota','Ohio','Oklahoma','Oregon','Pennsylvania','Rhode Island','South Carolina','South Dakota','Tennessee','Texas','Utah','Vermont','Virginia','Washington','West Virginia','Wisconsin','Wyoming'];
function gettingCharts(theChartId,barHeight,barLabels){
let firstChart=document.getElementById(theChartId).getContext('2d');
let myChart= new Chart(firstChart,{
    type:'bar',
    data:{
        labels:barLabels,
        datasets:[{
            label:'States',
            data:barHeight

    }]},
    options:{},
});
}
function getData(url,methods,Destid) {

    

    
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
            let greaterThanvalue=document.getElementById('age')
            valueSelected=greaterThanvalue.value
            let stateValue=document.getElementById('state selection')
            let barHeightArray=[]
            let allStateAccepatance= new Map;
            let allFromStateDenial= new Map;
            for(i=0;i<states.length;i++){
                allFromStateDenial.set(states[i],0)
                allStateAccepatance.set(states[i],0)
            }
            
            for(r in rJson){
               
              if(stateValue.value=='UnitedStates'){ 

            if(valueSelected<=rJson[r]['customerAge']){
             
                
    

            if(rJson[r]['approval']==true){
                trueVals++
               

                
                allStateAccepatance.set(rJson[r]['state'],allStateAccepatance.get(rJson[r]['state'])+1)
            }else{
                falseVals++
                allFromStateDenial.set(rJson[r]['state'],allFromStateDenial.get(rJson[r]['state'])+1)
            }
                }
            }else{ 
              
                if(valueSelected<=rJson[r]['customerAge']&&stateValue.value==rJson[r]['state']){
                    
                 
                if(rJson[r]['approval']==true){
                    trueVals++
                    
                }else{
                    falseVals++
                    
                }
                    }



            }
            
            }
            
            for(i=0; i<states.length;i++){
                if((allStateAccepatance.get(states[i])+allFromStateDenial.get(states[i]))!=0){
                barHeightArray.push(
                    allStateAccepatance.get(states[i])*100/(allStateAccepatance.get(states[i])+allFromStateDenial.get(states[i])))}
                    else{
                        barHeightArray.push(0)
                    }
            }
            
            let div2=document.getElementById('divForCanv2')
            div2.innerHTML=""
            let canvas2=document.createElement('canvas')
            canvas2.setAttribute('id','BarChart')
            div2.append(canvas2);
            gettingCharts('BarChart',barHeightArray,states);

            let div=document.getElementById('divForCanv')
            div.innerHTML=""
            let canvas=document.createElement('canvas')
            canvas.setAttribute('id','SecondChart')
            div.append(canvas);
            let SecondChart=document.getElementById('SecondChart').getContext('2d');
            
            let myChart= new Chart(SecondChart,{
            type:'pie',
            data:{
                labels:['Approved Applications%','Denied Applications%'],
                datasets:[{
                    label:'x axis',
                    backgroundColor: ["#F26925", "#474C55"],
                    data:[
                    (trueVals/(trueVals+falseVals))*100,(falseVals/(trueVals+falseVals))*100
                    ]

        }]
    },
    options:{
        plugins: {
        title: {
        display: true,
        text: `Application Acceptance Percentage for Age ${valueSelected} and up, ${stateValue.value},with ${falseVals+trueVals} values returned`
            }}
        }
    });

            
        }

        }
    }
    function getStates(Destid) {

    

    

                let stateDropDown=document.getElementById(Destid)
                
                
                for(var i = 0; i < states.length; i++){
                    let stateValue=document.createElement('option')
                    stateValue.setAttribute('value',states[i])
                    stateValue.innerHTML=states[i]
                    stateDropDown.append(stateValue)
    
              
               
                
                }
                
                
            }
    
            
        function deleteDuplicits(array){
            m=0
            x=1
            for(i=1;i<array.length;i++){
                
                if(array[i-1]==array[i]){
                array.splice(i-1,i)
                console.log(array);
                }
               
            }
            
            console.log(array)
            return array;
        }

