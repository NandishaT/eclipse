<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
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
<form action="crusie" method="post">

<!-- <div class="bg-image" 
     style="background-image: url('https://mdbootstrap.com/img/new/standard/city/041.jpg');
            height: 100vh">

 <div class="https://mdbootstrap.com/img/new/standard/city/041.jpg">  
</div> -->

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name of the casino</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the casino name" name="name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name of the cruise</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter the Cruise" name="cruise">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Entery Fee</label>
  <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="00.00" name="entryfee">
</div>


<div class="form-check">
<option selected>FreeFood</option><br>
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
  <label class="form-check-label" for="flexRadioDefault1">
 Yes
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
   No
  </label>
</div>

<div class="form-check">
<option selected>Alcohol</option><br>
  <input class="form-check-input" type="radio" name="flexRadioDefault1" id="flexRadioDefault1">
  <label class="form-check-label" for="flexRadioDefault1">
 Yes
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault1" id="flexRadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
   No
  </label>
</div>

<div>
<input type="submit" class="btn btn-secondary" value="Send">
</div>

</form>
</body>
</html>