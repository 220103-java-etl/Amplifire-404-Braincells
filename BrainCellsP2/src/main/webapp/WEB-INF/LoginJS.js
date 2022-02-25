
let fun = 0;

function popup(formId){

    if (fun %2 == 0){
    document.getElementById(formId).style.display="block";
    document.getElementById("login-popup").style.display="none";
    }
    else{
    document.getElementById(formId).style.display="none";
    document.getElementById("login-popup").style.display="block";
    }
    fun++;
    console.log(fun);
}

function login(test) {
    popup(test);
    alert("Login Attempt Detected!");
}
