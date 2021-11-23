<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<%@ include file="navbar.jsp" %>  
<div class="container">
	<form action  =  " loginServlet"  method  =  "post">
	  <div class="form-group">
	    <label for="exampleInputEmail1">ID</label>
	    <input type="text" class="form-control" id="id" aria-describedby="id" placeholder="Enter ID">
	  </div>
	  <div class="form-group">
	    <label for="exampleInputPassword1">Email</label>
	    <input type="email" class="form-control" id="email" placeholder="Email">
	  </div>
	  <div class="form-check">
	    <input type="checkbox" class="form-check-input" id="exampleCheck1">
	    <label class="form-check-label" for="exampleCheck1">Check me out</label>
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
	</div>
</body>
</html>