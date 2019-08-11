<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Search Recipes</title>
</head>
<body>
	<h1>Please select a search category</h1>
	<form method="post" action="/search-response">
	<p>
		<label>Title</label> <input name="label" type="text" /></p>
	<p>	<label>Calories less than</label> <input name="calories" type="number"/></p>
		<p><label>Dietary Preferences</label></p>
					
			<p>	<select name="diet">
			<option value=""></option>
				<option value="balanced">balanced</option>
				<option value="high-fiber">high-fiber</option>
				<option value="high-protein">high-protein</option>
				<option value="low-carb">low-carb</option>
				<option value="low-fat">low-fat</option>
			</select>
		</p>
		<button type="submit" class="btn btn-primary">Go!</button>
	</form>
</body>
</html>