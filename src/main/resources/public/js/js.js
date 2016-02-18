 function checklogin(){
  var email=document.getElementById('email').value;
  var password= document.getElementById('password').value;
  if(email.length<1||password.length<1){
    alert("Both email and password cannot be empty");
  }
  else if(password.length>16||password.length<6){
    alert("Password must be 6 to 16 letters");
  }
  else document.getElementById('login_info').submit();
}

function checkRegister(){
  var email=document.getElementById('email').value;
  var password=document.getElementById('password').value;
  var password0=document.getElementById('password0').value;
  var First_name=document.getElementById('First_name').value;
  var Last_name=document.getElementById('Last_name').value;
  var zipcode=document.getElementById('zipcode').value;
  var message="";
  if(email.length<1){
    message=message+"Email must not be empty!\n";
  }
  if(password.length<6||password.length>16){
    message=message+"Password need to be 6 to 16 letters!\n";
  }
  if(password!=password0){
    message=message+"Two password are not same!\n";
  }
  if(First_name.length<1){
    message=message+"First_name must not be empty!\n";
  }
  if(Last_name.length<1){
    message=message+"Last_name must not be empty!\n";
  }
  if(zipcode.length!=5){
    message=message+"Zip code in wrong format\n";
  }
  if(!isNaN(zipcode)){
    message=message+"Zip code need to be all numeric";
  }
  if(message.length>=1){
    alert(message);
  }
  else document.getElementById('register_info').submit();
}