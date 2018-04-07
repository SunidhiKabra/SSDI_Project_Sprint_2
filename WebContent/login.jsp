
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>University Rental Application</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<style>
.carousel-inner img {
	width: 100%;
	height: 100%;
}
</style>
</head>
<body>



	<nav class="navbar navbar-expand-sm bg-dark navbar-dark text-white">
		<a class="navbar-brand" href="index.jsp"> <img src="logo.jpg"
			alt="logo" style="width: 40px;">
		</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item">
				<h1 class="w3-text-white">University Renting Application</h1>
			</li>
		</ul>
	</nav>



<jsp:include page="successMessage.jsp" />

	<div class="container">
		<form name="form" action="login.do" method="post">
			<br>
			<div class="col-md-12">
				<h1 class="display1">Log In</h1>
			</div>
			<div class="form-group">
				<label for="Email">Email</label> <input type="text"
					class="form-control" id="email" placeholder="email"
					name="email">
			

			</div>
			<div class="form-group">
				<label for="Password">Password</label> <input type="password"
					class="form-control" id="password" placeholder="password"
					name="password"> </br>
				<jsp:include page="errorList.jsp" />
			</div>
			<input type="submit" class="btn btn-success" value="Submit"></input>
			<input type="reset" class="btn btn-success" value="Reset"></input>

		</form>
	</div>


	<jsp:include page="footer.jsp" />