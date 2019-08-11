<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="recipeStyle.css" />
<link
	href="https://fonts.googleapis.com/css?family=Lexend+Exa&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
<title>Recipe Details</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<h1>${recipe.getLabel()}</h1>
				<p>Cuisine type</p>
				<p>Meal Type</p>
				<p>Servings</p>
				<p>Ingredient list</p>
				<p>Health label</p>
			</div>
		</div>
	</div>
</body>
</html>