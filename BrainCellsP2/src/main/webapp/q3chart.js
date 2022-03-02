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

             console.log(rJson);
            }
            

        }
    }
