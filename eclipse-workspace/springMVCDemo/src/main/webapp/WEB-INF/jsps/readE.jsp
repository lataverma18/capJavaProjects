<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>EId</th><th>EName</th><th>ESalary</th>
</tr>
<c:forEach items="${elist}" var="e">
	<tr>
	<td><c:out value="${e.eid}"/></td>
	<td><c:out value="${e.ename}"/></td>
	<td><c:out value="${e.esalary}"/></td>
	</tr>
</c:forEach>
</table>
<br/>
<a href="welcome">Go Back to home Page</a>
</body>
</html>