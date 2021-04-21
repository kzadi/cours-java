<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<%--<c:if test="${user == null }">--%>
<%--    <c:redirect url="login"/>--%>
<%--</c:if>--%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- CSS Perso -->
    <link rel="stylesheet" href="assets/css/app.css">

    <title>Page Converter</title>
</head>

<body>
<div class="container">
    <jsp:include page="includes/header.jsp"/>

    <div class="app_form border shadow">
        <h1 class="titre">Page de conversion</h1>
        <form class="m-3" method="post">
            <div class="mb-3">
                <label for="celsius" class="form-label">Température en °C</label>
                <input type="text" class="form-control" id="celsius" name="celsius"
                       placeholder="Saisir la température en °C"/>
            </div>
            <button type="submit" class="btn btn-valider">Valider</button>
            <button type="submit" class="btn btn-secondary float-end">Reset</button>
        </form>
    </div>

    <c:if test="${error != null }">
        <div class="erreur">${error}</div>
    </c:if>

    <c:if test="${resultat != null }">
        <div class="resultat">Resultat = ${resultat}°F</div>
    </c:if>


</div>
</body>
</html>