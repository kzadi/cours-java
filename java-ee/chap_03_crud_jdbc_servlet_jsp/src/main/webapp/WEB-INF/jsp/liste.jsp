<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Liste</title>
</head>
<body>
	<h1>Page Liste Employes</h1>

	<a href="ajouter">Ajouter un employé</a>

	<c:if test="${error != null }">
		<h3>${error }</h3>
	</c:if>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>PRENOM</th>
				<th>EMAIL</th>
				<th>DDN</th>
				<th>ROLE</th>
				<th>VOIE</th>
				<th>CODE POSTE</th>
				<th>VILLE</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty employes}">
				<c:forEach items="${employes}" var="employe">
					<tr>
						<td>${employe.id}</td>
						<td>${employe.prenom}</td>
						<td>${employe.email}</td>
						<td>${employe.ddn}</td>
						<td>${employe.role}</td>
						<td>${employe.adresse.nomVoie}</td>
						<td>${employe.adresse.codePostal}</td>
						<td>${employe.adresse.ville}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</body>
</html>