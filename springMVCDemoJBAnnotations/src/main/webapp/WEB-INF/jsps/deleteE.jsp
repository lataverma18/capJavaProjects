<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${message }
<form action="deleteE">
<table border="1">
	<tr><td>Enter Id to be deleted:</td><td><input type="text" name="eid" /></td></tr>
	<tr colspan="2"><td><button type="submit">Submit</button></td></tr>
</table>
</form>
<br/>
<a href="welcome">Go Back to home Page</a>
</body>
</html>