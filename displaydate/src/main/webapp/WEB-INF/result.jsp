<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Results</title>
</head>
<body>
	<c:set var="result" value="${ result }"/>
	<h1>Submitted Info</h1>
	<p><strong>Name:</strong> <c:out value="${ result.getName() }"/></p>
	<p><strong>Language:</strong> <c:out value="${ result.getLanguage() }"/></p>
	<p><strong>Location:</strong> <c:out value="${ result.getLocation() }"/></p>
	<p><strong>Comment:</strong> <c:out value="${ result.getComment() }"/></p>
</body>
</html>