<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ page import="java.util.*, com.qa.ecommerce.pojo.user"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Profile Page</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
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

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a style="color: #02716b;" class="navbar-brand" href="WelcomePage">Green
				Laundry Machines Ltd</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
				aria-controls="navbarNavAltMarkup" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a style="color: #063d63" class="nav-link active" aria-current="page" href="#">Your Products and Services</a> 
					<a style="color: #063d63" class="nav-link" href="#">Your Profile</a> 
					<a style="color: #063d63" class="nav-link" href="NewPandS">Purchase New Products and Services</a> 
					<a style="color: #063d63" class="nav-link" href="contactUs">Contact Us</a> 
					<a style="color: #063d63" class="nav-link" href="logOut">Logout</a>
				</div>
			</div>
		</div>
	</nav>

<%// user.class. %>

<br>
<table style="width:70%; margin: auto; border: 1px solid black;"  class="table table-hover">
  <thead>
    <tr>
      <th scope="col">Type Of Data</th>
      <th scope="col">Your Details</th>
      <th scope="col">Click To Edit</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Name</td>
      <td>${user.getName()}</td>
      <td><a href="#">Edit</a></td>
    </tr>
    <tr>
      <td>Company Name</td>
      <td>${user.getCompanyName()}</td>
      <td><a href="#">Edit</a></td>
    </tr>
    <tr>
      <td>Company Phone Number</td>
      <td>${user.getCompanyContactNo()}</td>
      <td><a href="#">Edit</a></td>
    </tr>
     <tr>
      <td>Company Email</td>
      <td>${user.getCompanyEmail()}</td>
      <td><a href="#">Edit</a></td>
    </tr> 
     <tr>
      <td>Company Address</td>
      <td>${user.getCompanyAddress()}</td>
      <td><a href="#">Edit</a></td>
    </tr> 
    <tr>
      <td>Account Password</td>
      <td>${user.getPassword()}</td>
      <td><a href="#">Edit</a></td>
    </tr> 
  </tbody>
</table>
</body>
</html>