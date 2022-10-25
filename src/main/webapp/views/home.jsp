<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Green Laundry Machines Ltd</title>
<style>
body {
	background-color: powderblue;
}

body {
	text-align: center;
}
</style>
</head>
<body>

	<h1 style="color: MediumSeaGreen;">Welcome to Green Laundry Machines Ltd</h1>
	<br>

	<form action="login" method="post">

		<div>
			<label for="companyEmail" class="form-label"> Enter your
				Email Address </label> <input type="text" class="form-control" name="companyEmail"
				required>
		</div>
		<br>
		<div>
			<label for="Password" class="form-label"> Enter your password
			</label> <input type="password" class="form-control" name="password" required>
		</div>
		<p>
			<input style="" type="submit" value="login">
		</p>
		<p style="color: red ">${loginErrorMessage}</p>
		
	</form>

	<small title="Click Here to Register"> <a
		href="RegistrationPage"> New User? Register Here</a>
	</small>

</body>
</html>