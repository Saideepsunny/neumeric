<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Withdrawal Form</title>
</head>

<body>
	<br>
	<form:form action="./getamount" method="post"
		modelAttribute="customer">
		<table width="500px" border=0 align="center">


			<tr>
				<td colspan=2 style="font-weight: bold; font-size: 20pt;"
					align="center">Withdrawal form</td>

			</tr>
			<tr>
				<td colspan=2>&nbsp;</td>

			</tr>
			<tr>
				<td>Account Number</td>
				<td><form:input path="accountnumber" /></td>
			</tr>

			<tr>
			<td>Amount:
			<input type="text" name="amount" value="">
			</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save"></td>
			</tr>

		</table>
	</form:form>
</body>
</html>