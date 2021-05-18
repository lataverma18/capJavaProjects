<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error
{
	color:red;
}
</style>
</head>
<body>
${message}
<form:form modelAttribute="e" action="createE">
<table border="1">
	<tr><td>Enter Id:</td><td><form:input type="text" path="eid" /><form:errors cssClass="error" path="eid"></form:errors></td></tr>
	<tr><td>Enter Name:</td><td><form:input type="text" path="ename" /><form:errors cssClass="error" path="ename"></form:errors></td></tr>
	<tr><td>Enter Salary:</td><td><form:input type="text" path="esalary" /><form:errors cssClass="error" path="esalary"></form:errors></td></tr>
	<tr colspan="2"><td><form:button type="submit" >Submit</form:button></td></tr>
</table>
</form:form>
<br/>
<a href="welcome">Go Back to home Page</a>
</body>
</html>