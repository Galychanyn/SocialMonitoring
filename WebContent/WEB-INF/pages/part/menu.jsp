<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index">Social Monitoring</a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="index">Home</a></li>
				<li><a href="#about">About</a></li>
				<li><a href="#contact">Contact</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Dropdown <span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li class="divider"></li>
						<li class="dropdown-header">Nav header</li>
						<li><a href="#">Separated link</a></li>
						<li><a href="#">One more separated link</a></li>
					</ul></li>
			</ul>
			<form id="loginform" name="loginform" class="navbar-form navbar-right" role="form" method="post">
				<div class="form-group">
					<input type="text" placeholder="UserName" class="form-control" name="name_login">
				</div>
				<div class="form-group">
					<input type="password" placeholder="Password" class="form-control" name="pass_login">
				</div>
				<button id="signIn" type="submit" class="btn btn-success">Sign in</button>
				<a id="signUp" href="#" type="submit" class="btn btn-primary">Sign up</a>
				<span id="errorLogin" class="label label-danger">${errorMsgLogin}</span>
			</form>
			<form id="logoutform" class="navbar-form navbar-right" role="form" style="display:none">
				<a id="loguot" type="submit" class="btn btn-success">Logout</a>
			</form>
		</div>
		<!--/.navbar-collapse -->
	</div>
</div>