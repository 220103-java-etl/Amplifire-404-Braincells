let fun = 0;

function popup(formId) {
  if (fun % 2 == 0) {
    document.getElementById(formId).style.display = "inline-block";
    document.getElementById("login-popup").style.display = "none";
    /*
    document.getElementById("register").style.display="none";
    */
  } else {
    document.getElementById(formId).style.display = "none";
    document.getElementById("login-popup").style.display = "inline-block";
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

function registerpop(value) {
  if (fun % 2 == 0) {
    document.getElementById(value).style.display = "inline-block";
    document.getElementById("login-popup").style.display = "none";
  } else {
    document.getElementById(value).style.display = "none";
    document.getElementById("login-popup").style.display = "inline-block";
  }
  fun++;
}

function addUser(stuff) {
  let fName = document.getElementById("Firstname").value;
  let lName = document.getElementById("Lastname").value;
  let uName = document.getElementById("username").value;
  let pWord = document.getElementById("password").value;

  let newUser = {
    firstName: fName,
    lastName: lName,
    userName: uName,
    password: pWord,
  };
  console.log(newUser);

  let user = JSON.stringify(newUser);

  let xhr = new XMLHttpRequest();

  xhr.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      let newUserResp = xhr.responseText;
      let user = JSON.stringify(newUserResp);
      console.log(user);
      

      if (user.length == 0){
      alert("Register Failed!");
      }
      else{
        
        alert("Registration Successful!");
        registerpop(stuff);
      }
    }
  };

  xhr.open("POST", "http://localhost:8080/Insurance/users", true);

  xhr.setRequestHeader("Content-Type", "application/json");

  xhr.send(user);
}
function LoginUser(test) {
  let uName = document.getElementById("username1").value;
  let pWord = document.getElementById("password1").value;

  let newUser = {
    userName: uName,
    password: pWord,
  };

  let user = JSON.stringify(newUser);

  let xhr = new XMLHttpRequest();

  xhr.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      let r = xhr.responseText;
      rJson = JSON.stringify(r);

      console.log(rJson);
      login(test);
     
      //if user = null give error
      if (r == "") {
        alert("Login Failed!");
      } else {
        window.location.href = "./TestingChartJS.html";
      }

      // put redirect here?

      // else = login successful -> redirect to charts
    }
  };

  xhr.open("POST", "http://localhost:8080/Insurance/users/login", true);

  xhr.setRequestHeader("Content-Type", "application/json");

  xhr.send(user);
}
