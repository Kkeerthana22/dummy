<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheduled Sessions</title>
</head>
<body>
<table border="1px">
<tr>
<th>Id</th>
<th>SessionName</th>
<th>Duration(Days)</th>
<th>Faculty</th>
<th>Mode</th>
</tr>
<a:forEach items="${sessiondata}" var="session">
<tr>
<td>${session.id}</td>
<td>${session.name}</td>
<td>${session.duration}</td>
<td>${session.faculty}</td>
<td>${session.mode1}</td>
<td><a href="Success.jsp">Enroll Me</a><br><br></br></td>
</tr>
</a:forEach>
</table>
</body>
</html>