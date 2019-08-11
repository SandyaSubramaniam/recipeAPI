<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<title>Display Results</title>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<c:choose>
					<c:when test="${ not empty error }">
						<h1>${error}
							<a href="/search">Please try again!</a>
						</h1>
					</c:when>
					<c:otherwise>
					<h3 align="center">Recipes</h3>
						<h4 align="right">
							<a href="/search">Back to Search</a>
						</h4>
						<table border=1>
							<thead class="thead">
								<tr>
									<th>Image</th>
									<th>Title</th>
									<th>Nutrients</th>
									<th></th>
								</tr>
							</thead>
							<c:forEach var="hit" items="${response.getHits()}">
								<tr class="trow">
									<td width="30%"><img src="${hit.getRecipe().getImage()}"></td>
									<td width="40%"><span
										style="font-size: larger; font-weight: bolder"><a
											href="${hit.getRecipe().getUrl()}">${hit.getRecipe().getLabel()}</a>
									</span> <br> <strong>Calories:</strong> <fmt:parseNumber
											integerOnly="true" type="number"
											value="${hit.getRecipe().getCalories()}" /></td>
									<td width="20%">
										<table>
											<tr>
												<td>Protein</td>
												<td><fmt:parseNumber integerOnly="true" type="number"
														value="${hit.getRecipe().getTotalNutrients().getpROCNT().getQuantity()}" />
													${hit.getRecipe().getTotalNutrients().getpROCNT().getUnit()}</td>
											</tr>
											<tr>
												<td>Carbs</td>
												<td><fmt:parseNumber integerOnly="true" type="number"
														value="${hit.getRecipe().getTotalNutrients().getcHOCDF().getQuantity()}" />
													${hit.getRecipe().getTotalNutrients().getcHOCDF().getUnit()}</td>
											</tr>
											<tr>
												<td>Fat</td>
												<td><fmt:parseNumber integerOnly="true" type="number"
														value="${hit.getRecipe().getTotalNutrients().getfAT().getQuantity()}" />
													${hit.getRecipe().getTotalNutrients().getfAT().getUnit()}</td>
											</tr>
										</table>
									</td>
									<td width="10%"><a
										href="/details?uri=${hit.getRecipe().getUriEncoded()}"><img
											src="details.png" height="50"></a></td>
								</tr>
							</c:forEach>
						</table>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
</body>
</html>