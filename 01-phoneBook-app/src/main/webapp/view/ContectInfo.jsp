<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
${msg}
<form:form action="index" modelAttribute="c" method="Post">
	<table>
		<tr>
			<td>Name :</td>
			<td><form:input path="contect_Name" /></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><form:input path="contect_Email" /></td>
		</tr>
		<tr>
			<td>Phone Number :</td>
			<td><form:input path="contect_PhnoNumber" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Ragister"></td>
		</tr>
	</table>
</form:form>