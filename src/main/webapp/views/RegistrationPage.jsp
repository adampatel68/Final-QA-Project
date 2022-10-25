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
	<h1 style="color: MediumSeaGreen">Green Laundry Registration Page</h1>
	<br>


	<h3>Enter your Details to Register:</h3>
<!-- Order: name, Co Name, Co Phone No, Co EMail, Co Address, Password -->
	<form action="register" method="post">

		<div class="form-group" style="font-size: 125%;">

			<div>
				<label for="Name">Name</label><br> <input type="text"
					class="form-control" placeholder="Enter Name" name="name" required>
			</div>
			<div class="form-group">
				<label for="CompanyName">Company Name</label><br> <input
					type="text" class="form-control" placeholder="Company Name"
					name="companyName" required>
			</div>
			<div>
				<label for="exampleInputcompanyContactNo">Company Contact
					Number</label><br> <input type="text" class="form-control"
					placeholder="Phone Number" name="companyContactNo" required>
			</div>
			<div>
				<label for="exampleInputcompanyEmail">Company Email</label><br>
				<input type="text" class="form-control" placeholder="Email Address"
					name="companyEmail" required>
			</div>
			<div>
				<label for="exampleInputcompanyAddress">Company Address</label><br>
				<input type="text" class="form-control" placeholder="Location"
					name="companyAddress" required>
			</div>
			<div>
				<label for="exampleInputpassword">Password</label><br> <input
					type="password" class="form-control" placeholder="Enter Password"
					name="password" required>
			</div>
		</div>
		<br> <a href="WelcomePage"><button type="submit"
				class="btn btn-primary">Register here</button></a> <br>
	</form>
	<footer>
		<small><a href="home">Home Page</a></small>
	</footer>

</body>
</html>
