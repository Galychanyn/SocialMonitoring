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
	
	/*запускається на початку, перевіряє чи користувач зареєстрований*/
	var verifyLogin = function() {
		$.ajax({
			url: "check-login",
			success: function(user) {
				if (null != user) {
					loginform.hide();
					logoutform.show();
					//registerField.html("Hello, " + user.name + "!");
				} else {
					loginform.hide();
					logoutform.show();
				}
			}
		});
	};
	
	/*авторизація користувача*/
	loginform.submit( function(){
		if (validateForm())	{
	    	$.ajax({
			url: "signin",
			contentType: "application/x-www-form-urlencoded",
			dataType: "text",
			data: loginform.serialize(),
			success: function(data) {
				verifyLogin();
				loginform.hide();
//				//verifyLogin();
//				location.replace("index");
				logoutform.show();
				location.replace("home");
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
	
	var init = function() {
		//countUser();
		verifyLogin();
	};
	
	init();
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