$(function() {

	var signUp = $("#signUp");
	var loginform = $("#loginform");
	var logoutform = $("#logoutform");
	var regDiv = $("#regDiv");
	
	signUp.click(function(){
		location.href="signup";
	});
	//example
//	var addArticle = $("#addArticle");
//	var insertForm = $("#insertForm");
//	addArticle.click(function(){
//		insertForm.toggle('slow');
//	});
		
	/*авторизація користувача*/
	loginform.submit( function(){
		if (validateForm())	{
	    	$.ajax({
			url: "signin",
			contentType: "application/x-www-form-urlencoded",
			dataType: "text",
			data: loginform.serialize(),
			success: function(data) {
//				loginform.hide();
//				//verifyLogin();
//				location.replace("index");
//				logoutform.show();
				//location.replace("signup");
			},
			error: function(error) {
				//location.replace("signup");
			
				//hello.hide();
				//regDiv.show();
				$("#errorLogin").html(error.responseText);
			}
	    	}); 
	    }
		return false;
	});
});

function validateForm() {
    var name = document.forms["loginform"]["name_login"].value;
    var pass = document.forms["loginform"]["pass_login"].value;
    if (name==null || name=="") {
        alert("UserName must be filled out");
        return false;
    } else if (pass==null || pass=="") {
        alert("Password must be filled out");
        return false;
    } else {return true; }; 
};