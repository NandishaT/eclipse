<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Send Details of Favourite Person</h1>
<form action="display" method="post">
<pre>
FirstName <input type="text" name="fname"/></br>
LastName <input type="text" name="lname"/></br>
Gender   Male<input type="radio" name="gender" value="Male" checked="checked">
       Female<input type="radio" name="gender" value="Female" checked="checked"></br>
Reason <textarea rows="4" cols="45" name="reason"></textarea></br>
Address <textarea rows="4" cols="45" name="address"></textarea></br>
<input type="submit" value="send"/>
</pre>
</form>
</body>
</html>
