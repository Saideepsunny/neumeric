<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>	Registration Form</title>
</head>

<body>
	<br>
	<form:form action="./customerSave" method="post"
		modelAttribute="customers">
		<table width="500px" border=0 align="center">


			<tr>
				<td colspan=2 style="font-weight: bold; font-size: 20pt;"
					align="center">Customer Registration</td>

			</tr>
			<tr>
				<td colspan=2>&nbsp;</td>

			</tr>
			<tr>
				<td>Account Number</td>
				<td><form:input path="accountnumber" /></td>
			</tr>

			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" name="firstName" /></td>
				<td align="left"><form:errors path="firstName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" name="lastName" /></td>
				<td align="left"><form:errors path="lastName" cssClass="error" /></td>

			</tr>
			
			<tr>
				<td>SSN</td>
				<td><form:input path="ssn" name="ssn"  /></td>
				<td align="left"><form:errors path="ssn" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:input path="address" name="address"  /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" name="city"  /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><form:input path="state" name="state" /></td>
			</tr>
			<tr>
				<td>Zip Code</td>
				<td><form:input path="zipcode" name="zipcode"  /></td>
			</tr>
			<tr>
				<td>Account Type</td>
				<td><form:input path="accounttype"   /></td>
			</tr>
			<tr>
				<td>Balance</td>
				<td><form:input path="balance"  /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save"></td>
			</tr>

		</table>
	</form:form>
</body>
</html>