<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="recipeStyle.css"/> 
<link href="https://fonts.googleapis.com/css?family=Lexend+Exa&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
<title>Display Results</title>
</head>
<body>

<header>
	<i class="fas fa-search"></i> <a href="/search"> Search Again</a>
</header>

<h1>Recipe List</h1>

	<table border=1 class="table-hover" id="table">
	<thead class="thead">
		<tr>
			<th>Image</th>
			<th>Title</th>
			<th>Calories</th>
		</tr>
	</thead>
	
		<c:forEach var="hit" items="${response}">
			<tr class ="trow">
				<td> <img src="${ hit.recipe.image }"/> </td>
				<td> ${ hit.recipe.label } </td>
				<td> ${ hit.recipe.calories } </td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>