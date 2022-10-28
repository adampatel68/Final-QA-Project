<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@ page
	import="java.util.*, com.qa.ecommerce.pojo.IPSOwasher, com.qa.ecommerce.repository.WasherRepository"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>New Products and Services</title>

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
					<a style="color: #063d63" class="nav-link active"
						aria-current="page" href="#">Your Products and Services</a> <a
						style="color: #063d63" class="nav-link" href="userProfile">Your
						Profile</a> <a style="color: #063d63" class="nav-link" href="#">Purchase
						New Products and Services</a> <a style="color: #063d63"
						class="nav-link" href="contactUs">Contact Us</a> <a
						style="color: #063d63" class="nav-link" href="logOut">Logout</a>
				</div>
			</div>
		</div>
	</nav>
	<br>
	<br>
	<table style="width: 90%; margin: auto; border: 1px solid black;"
		class="table table-hover">
		<thead>
			<tr>
				<th scope="col">Machine Name</th>
				<th scope="col">Load Capacity</th>
				<th scope="col">Dimensions (HxWxD in mm)</th>
				<th scope="col">Machine Net Weight</th>
				<th scope="col">Price (Per Machine)</th>
				<th scope="col">Type of Heating</th>
				<th scope="col">Electric Supply Type</th>
				<th scope="col">Quantity</th>
				<th scope="col">Submit</th>
			</tr>
		</thead>



		<!--  	int num = WasherRepository.getAllwashers().size();
  	for (int i = 0; i < num; i++) {
		     <tr>
		      <td>${allWashers.get(num).getName()}</td>
		      <td>${allWashers.get(num).getLoadCapacity()}</td>
		      <td>${allWashers.get(num).getdimensions()}</td>
		      <td>${allWashers.get(num).getNetWeight()}</td>
		      <td>${allWashers.get(num).getPrice()}</td>
		      <td>Dropdown menu - Type of Heating</td>
		      <td>Dropdown menu - Electric Supply Type</td>
		      <td>Dropdown menu - Quantity</td>
		 	  <td><a href="#">Submit</a></td>
		    </tr> }  -->

		<tbody>
				<tr>
			<td>IPSO HF234</td>
			<td>23.4kg (50lb)</td>
			<td>1505 x 900 x 1005</td>
			<td>570kg (1256lb)</td>
			<td>£6000</td>
			<td>Dropdown menu - Type of Heating</td>
			<td>Dropdown menu - Electric Supply Type</td>
			<td>Dropdown menu - Quantity</td>
			<td><a href="#">Submit</a></td>
		</tr>
		<tr>
			<td>IPSO WFF235</td>
			<td>23.5kg (50lb)</td>
			<td>1355 x 860 x 1020</td>
			<td>500kg (1102lb)</td>
			<td>£4750</td>
			<td>Dropdown menu - Type of Heating</td>
			<td>Dropdown menu - Electric Supply Type</td>
			<td>Dropdown menu - Quantity</td>
			<td><a href="#">Submit</a></td>
		</tr>
		<tr>
			<td>IPSO HC165</td>
			<td>16.5kg (35lb)</td>
			<td>1202 x 780 x 1004</td>
			<td>358kg (789lb)</td>
			<td>£3500</td>
			<td>Dropdown menu - Type of Heating</td>
			<td>Dropdown menu - Electric Supply Type</td>
			<td>Dropdown menu - Quantity</td>
			<td><a href="#">Submit</a></td>
		</tr>
		<tr>
			<td>IPSO HC100</td>
			<td>10g (22lb)</td>
			<td>1038 x 660 x 896</td>
			<td>236kg (520lb)</td>
			<td>£2500</td>
			<td>Dropdown menu - Type of Heating</td>
			<td>Dropdown menu - Electric Supply Type</td>
			<td>Dropdown menu - Quantity</td>
			<td><a href="#">Submit</a></td>
		</tr>
		<tr>
			<td>IPSO HC75</td>
			<td>5.6kg (16lb)</td>
			<td>1038 x 660 x 796</td>
			<td>211kg (465lb)</td>
			<td>£1750</td>
			<td>Dropdown menu - Type of Heating</td>
			<td>Dropdown menu - Electric Supply Type</td>
			<td>Dropdown menu - Quantity</td>
			<td><a href="#">Submit</a></td>
		</tr>
		</tbody></table>
</body>
</html>