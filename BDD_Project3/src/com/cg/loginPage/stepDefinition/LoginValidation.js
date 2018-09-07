function check(form) {
	if(form.uname.value == "admin" && form.pwd.value == "123")
	  {
	 window.open("C:/BDD workspace(use this)/BDD_Project3/src/com/cg/loginPage/stepDefinition/NewPage.html");
		
	  }
	 else if(form.uname.value == "")
	 {
		alert("Enter Username");
	   return false;
	  }
	   else if(form.pwd.value == "")
	 {
		alert("Enter Password");
	   return false;
	  }
	  else
	  {
		  alert("Incorrect username and password !!!")
		  return false;
	  }
}