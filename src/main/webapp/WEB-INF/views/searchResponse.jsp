<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Results</title>
</head>
<body>
	<c:choose>
		<c:when test="${ not empty error }">
			<h1>${error}
				<a href="/search">Please try again!</a>
			</h1>
		</c:when>
		<c:otherwise>
			<table border=1>
				<c:forEach var="hit" items="${response.getHits()}">
					<tr>
						<td>
							<div>
								<span style="font-size: larger; font-weight: bolder">${hit.getRecipe().getLabel()}</span>
								<span><a href="${hit.getRecipe().getUrl()}">${hit.getRecipe().getLabel()}"</a>
								</span>
							</div>
							<div>
								<img src="${hit.getRecipe().getImage()}">
							</div>
						</td>
						<td><strong>Calories:</strong> <fmt:parseNumber
								integerOnly="true" type="number"
								value="${hit.getRecipe().getCalories()}" /></td>
						<td>
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
						<td><img src="details.png" height="50"></td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
</body>
</html>