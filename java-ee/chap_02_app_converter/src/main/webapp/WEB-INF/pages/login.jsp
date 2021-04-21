<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- CSS Perso -->
    <link rel="stylesheet" href="assets/css/app.css">

    <title>Page Login</title>
</head>

<body>
<div class="container">
    <jsp:include page="includes/header.jsp"/>
    <div class="app_form border shadow">
        <h1 class="titre">form connexion</h1>
        <form class="m-3" method="post">
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Saisir votre email"/>
            </div>
            <div class="mb-3">
                <label for="mdp" class="form-label">Mot de passe</label>
                <input type="password" class="form-control" id="mdp" name="mdp" placeholder="Saisir votre mot de passe">
            </div>
            <button type="submit" class="btn btn-valider">Valider</button>
            <button type="submit" class="btn btn-secondary float-end">Reset</button>
        </form>
    </div>
</div>
</body>
</html>