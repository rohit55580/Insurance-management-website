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

<h1>Sign-Up Form</h1>
	
	<form>
  <div class="signupServlet" method = "post"><br>
    <div class="col-md-4 mb-3">
      <label for="validationServer01">First name</label>
      <input type="text" class="form-control is-valid" id="validationServer01" placeholder="First name" value="" required>
      <div class="valid-feedback">
        Looks good!
      </div>
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationServer02">Last name</label>
      <input type="text" class="form-control is-valid" id="validationServer02" placeholder="Lname" value="" required>
      <div class="valid-feedback">
        Looks good!
      </div>
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationServerUsername">Username</label>
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text" id="inputGroupPrepend3">@</span>
        </div>
        <input type="text" class="form-control is-invalid" id="validationServerUsername" placeholder="Username" aria-describedby="inputGroupPrepend3" required>
        <div class="invalid-feedback">
          Please choose a username.
        </div>
      </div>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="validationServer03">Email</label>
      <input type="text" class="form-control is-invalid" id="validationServer03" placeholder="email" required>
      <div class="invalid-feedback">
        Please provide a valid email.
      </div>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationServer04">Contact no.</label>
      <input type="text" class="form-control is-invalid" id="validationServer04" placeholder="phone" required>
      <div class="invalid-feedback">
        Please provide a valid phone number.
      </div>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationServer05">age</label>
      <input type="text" class="form-control is-invalid" id="validationServer05" placeholder="age" required>
      <div class="invalid-feedback">
        Please provide a valid age.
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" required>
      <label class="form-check-label" for="invalidCheck3">
        Agree to terms and conditions
      </label>
      <div class="invalid-feedback">
        You must agree before submitting.
      </div>
    </div>
  </div>
  <button class="btn btn-primary" type="submit">Submit form</button>
</form>

	<form action ="signupServlet" method ="post"><br>
	First Name <input type ="text" name="fname"><br>
	Last Name <input type ="text" name="lname"><br>
	Email <input type ="text" name="email"><br>
	Age <input type ="text" name="age"><br>
	Contact No. <input type ="text" name="phone"><br>	
	<input type="submit" value="signup">
	</form>
</body>
</html>