<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form:form action="register" method="POST" modelAttribute="user">
		<p>
			<label for="userName">UserName: </label>
			<form:input path="userName" id="userName"/>
			<form:errors path="userName"></form:errors>
		</p>
		<p>
			<label for="passWord" type=>PassWord: </label>
			<form:password path="passWord" id="passWord"/>
			<form:errors path="passWord"></form:errors>
		</p>
		<p>
			<label for="email">Email: </label>
			<form:input path="email" id="email"/>
			<form:errors path="email"></form:errors>
		</p>
		<p>
			<label for="confirm" > Confirm PassWord: </label>
			<input type="password" id="confirm" name="confirm">
		</p>
		<input type="submit" value="Register">
	</form:form>
</body>
</html>