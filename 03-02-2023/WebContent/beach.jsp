<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv= charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="44" class="d-inline-block align-text-top">
     X-works ODC
    </a>
    <a href="index.jsp" style="color: white;" class="btn btn-outline-success">Home</a>
  </div>
</nav>
<body>
<form action="beach" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name of the Beach</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the batch name" name="name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name of the Location</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the location name" name="location">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Clean</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Clean" name="clean">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name of the Game</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the Game name" name="game">
</div>
<div>
<input type="submit" class="btn btn-secondary" value="Send">
</div>

</form>

</body>
</html>