<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Results</title>
</head>
<body>
	<table border=1>
		<c:forEach var="hit" items=" ${response.getHits()} ">
			<tr>
				<td>${hit.getRecipe().getImage()}</td>
				<td>${hit.getRecipe().getLabel()}</td>
				<td>${hit.getRecipe().getCalories()}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>