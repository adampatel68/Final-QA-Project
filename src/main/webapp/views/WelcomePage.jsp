<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@ page import="java.util.*,com.qa.ecommerce.pojo.user"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Green Laundry Machines Ltd</title>

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
			<a style="color: #02716b;" class="navbar-brand" href="#">Green
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
					<a style="color: #063d63" class="nav-link" href="userProfile">Your Profile</a>
					<a style="color: #063d63" class="nav-link" href="NewPandS">Purchase New Products and Services</a> 
					<a style="color: #063d63" class="nav-link" href="contactUs">Contact Us</a> 
					<a style="color: #063d63" class="nav-link" href="logOut">Logout</a>
				</div>
			</div>
		</div>
	</nav>


	<h2 style="color: #02716b">Hello ${user.getName()}
	 and Welcome To Green laundry Machines</h2>
	<h3 style="color: #063d63">The Commercial Laundry Experts</h3>


	<h5>
		Supplier of New & Used Commercial Washing Machines, Dryers & Finishing
		Equipment with over 20 Years Experience Providing Commercial Laundry
		Equipment Solutions including Sales, Installation, Service, Repair &
		Rental Leading Brands at Affordable Prices <br> Over 200 Machines
		in Stock, and providing comprehensive Aftercare and Support
	</h5>
	<br>
	<br>

	<h6>Who We Are</h6>

	At Green Laundry Machines we take great satisfaction in aspiring to be
	one of the leading suppliers of commercial laundry equipment. We supply
	equipment to the UK, Europe and to other parts of the world from our
	head office in Yorkshire, we have the complete solution for your
	laundry needs

	<br>
	<br>
	<h6>We Know Commercial Laundry Equipment</h6>

	With over 20 years experience in the industry, you can be assured that
	all our laundry equipment is maintained and serviced to the highest
	standard, we offer a wide range of laundry equipment, with impartial
	advice to help provide the best solution for your needs. We can supply
	new & used machines from the leading brands. We also offer a design,
	installation, servicing, repair & rental service

	<br>
	<br>
	<h6>Quality Assurance</h6>

	We take a scrupulous and in depth approach to refurbishing all our
	equipment to a high standard so that it not only meets but exceeds
	customer expectation. This gives us great confidence in the quality of
	our work and machines, customers are more than welcome to come and
	inspect them working before purchasing, affordable prices without
	compromising on quality.

	<br>
	<br>
	<h6>We Buy Used Laundry Equipment</h6>

	We also buy used equipment, if you have old commercial laundry
	equipment that your about to send to the local scrap yard, give us a
	call, we will offer you the best price and remove your equipment for
	you.

</body>
</html>