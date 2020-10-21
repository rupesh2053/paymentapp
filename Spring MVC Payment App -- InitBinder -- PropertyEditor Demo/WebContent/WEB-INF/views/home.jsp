<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>

	.error {
		color: red;
	}
	
</style>
</head>
<body>
	<form:form method = "post" action = "success" modelAttribute = "paymentDto">
	
		<label for = "name">Name : </label>
		<form:input path="name" id= "name"/>
		<form:errors path = "name" cssClass = "error"/><br><br>
		
		<label for = "creditCardDto">Credit Card Number : </label>
		<form:input path="creditCardDto" id= "creditCardDto"/>
		<form:errors path = "creditCardDto" cssClass = "error"/><br><br>
		
		<label for = "date">Date : </label>
		<form:input path="date" id= "date"/>
		<form:errors path = "date" cssClass = "error"/><br><br>
		
		<label for = "amount">Amount : </label>
		<form:input path="amount" id= "amount"/>
		<form:errors path = "amount" cssClass = "error"/><br><br>
		
		<label for = "currency">Currency : </label>
		<form:input path="currency" id= "currency"/>
		<form:errors path = "currency" cssClass = "error"/><br><br>
		
		<input type = "submit" value = "Pay"/>
	</form:form>
</body>
</html>