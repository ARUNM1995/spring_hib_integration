<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/register" method="post">
		<div>
			<label>Name</label> <input type="text" name="name">
		</div>
		<div>
			<label>Contact</label> <input type="tel" name="contact">
		</div>
		<div>
			<label>Email</label> <input type="email" name="email">
		</div>
		<div>
			<label>Address</label> <input type="text" name="address">
		</div>
		<div>
			<label>Country</label> <input type="text" name="country">
		</div>
		<div>
			<label>State</label> <input type="text" name="state">
		</div>
		<div>
			<input type="submit" value="Register">
		</div>
	</form>
</body>
</html>