<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=ISO-8859-1>
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<nav class="navbar navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			alt="" width="80" height="44" class="d-inline-block align-text-top">
			X-works ODC
		</a>
	</div>
</nav>
<body>
<h1>Bakery Details</h1>
<h4>Click to get Data</h4>

<form action="name" method="post">
<input type="submit"  value="Name" class="btn btn-outline-success"/>
<br><label>${name}</label>
</form>

<form action="owner" method="post">
<input type="submit" value="OwnerName" class="btn btn-outline-success"/>
<br><label>${owner}</label>
</form>

<form action="wife" method="post">
<input type="submit" value="WifeName" class="btn btn-outline-success"/>
<br><label>${wife}</label>
</form>

<form action="married" method="post">
<input type="submit" value="Married" class="btn btn-outline-success"/>
<br><label>${married}</label>
</form>

<form action="famous" method="post">
<input type="submit" value="FamousFor" class="btn btn-outline-success"/>
<br><label>${famous}</label>
</form>

<form action="since" method="post">
<input type="submit" value="Since" class="btn btn-outline-success"/>
<br><label>${since}</label>
</form>
</body>
</html>