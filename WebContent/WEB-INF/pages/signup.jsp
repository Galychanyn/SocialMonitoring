<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<%@include file="/WEB-INF/pages/part/links.jsp"%>
</head>

<body>

	<%@include file="/WEB-INF/pages/part/menu.jsp"%>
	<div class="jumbotron">
		<div class="container">
			<span id="errorLogin" class="label label-danger">${errorMsg}</span>
			<form class="form-horizontal" role="form">
				<div class="form-group">
					<label for="firstname" class="col-sm-2 control-label">User
						Name:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="firstname"
							placeholder="Enter First Name">
					</div>
				</div>
				<div class="form-group">
					<label for="password" class="col-sm-2 control-label">Password:</label>
					<div class="col-sm-10">
						<input type="password" placeholder="Enter Password" class="form-control"
							name="pass_signup">
					</div>
				</div>
				<div class="form-group">
					<label for="email" class="col-sm-2 control-label">Email:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="email"
							placeholder="Enter Email">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							<label> <input type="checkbox"> Remember me
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Sign up</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>