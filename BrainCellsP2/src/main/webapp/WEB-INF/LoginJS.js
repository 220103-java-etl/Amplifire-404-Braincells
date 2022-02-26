
let fun = 0;

function popup(formId){

    if (fun %2 == 0){
    document.getElementById(formId).style.display="inline-block";
    document.getElementById("login-popup").style.display="none";
    /*
    document.getElementById("register").style.display="none";
    */
}
    else{
    document.getElementById(formId).style.display="none";
    document.getElementById("login-popup").style.display="inline-block";
    /*
    document.getElementById("register").style.display="inline-block";
    */
}

    fun++;
    console.log(fun);
}

function login(test) {
    popup(test);
    alert("Login Attempt Detected!");
}


function registerpop(value){

    if (fun %2 == 0){
        document.getElementById(value).style.display="inline-block";
        document.getElementById("login-popup").style.display="none";
    }
        else{
        document.getElementById(value).style.display="none";
        document.getElementById("login-popup").style.display="inline-block";

    }
    fun++;
}

function register(stuff) {
    registerpop(stuff);
    alert("Registration Successful!");
}