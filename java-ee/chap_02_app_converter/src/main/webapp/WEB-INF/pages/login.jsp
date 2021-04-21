<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- CSS Perso -->
<link rel="stylesheet" href="css/style.css">

<title>Page Login</title>
</head>

<body>
	<div class="container-md">
		<div class="py-5 bg-primary text-white text-center h1 text-uppercase">projet converter</div>

		<div class="w-25 mx-auto border border-1 shadow">
			<h1 class="mb-3 bg-primary bg-primary.bg-gradient py-2 h2">Page de login</h1>
			<form method="post">
				<div class="mb-3">
					<label for="email" class="form-label">Email address</label> <input
						type="email" class="form-control" id="email" name="email">
				</div>
				<div class="mb-3">
					<label for="mdp" class="form-label">Mot de passe</label> <input
						type="password" class="form-control" id="mdp" name="mdp">
				</div>

				<button type="submit" class="btn btn-primary rounded-pill">Valider</button>
			</form>
		</div>

	</div>
</body>
</html>