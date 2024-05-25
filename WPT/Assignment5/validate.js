function validateEmail(){
    const emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

    var emailIn= document.getElementById('exampleInputEmail1').value;
    
   document.getElementById('emailErr').innerHTML= emailIn.match(emailRegex) ? '' : 'Invalid Email'
}

function validatePassword(){
    const passRegex = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,12}$/;

    var passIn= document.getElementById('exampleInputPassword1').value;
    
   document.getElementById('passErr').innerHTML= passIn.match(passRegex) ? '' : 'Invalid Password'
}

function validateName(idIn,idErr){
    const nameRegex=/^[A-Z][a-z]{3,20}$/

    var nameIn=document.getElementById(idIn).value;

    document.getElementById(idErr).innerHTML=nameIn.match(nameRegex) ? '': 'Invalid Name'
}