<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/CSSpetsitting.css">

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<!-- <link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/logo.jpg" /> -->

<!-- <a href="www.google.com"> <img
	alt="${pageContext.request.contextPath}/logo.jpg"
	src="${pageContext.request.contextPath}/logo.jpg"/>
</a>  -->


<meta charset="UTF-8">
<title>PetSitting</title>
</head>
<body>
	</h1>
	<div id="footer">PETSITTING 2020 AJC Ingénierie - SOPRA</div>

	<div id="entete" class="row">

		<div id="logoEntete" class="col-2">
			<a href="accueil"> <img height="135" width="130"
				src="${pageContext.request.contextPath}/logo.jpg" />
			</a> <br /> <br />
		</div>

		<div id="titreEntete" class="col-10">
			<p>
			<h1>Bienvenue sur PetSitting</h1>
			</p>

			<p
				style="font: bold; font-size: 20; text-align: right; margin-right: 5px">
				Le site de référence pour faire garder vos animaux</p>
		</div>

	</div>

	<div id="corps" class="row">




		<c:if test="${sessionScope.Type=='admin'}">
			<p>Admin</p>
		</c:if>







		<c:if test="${sessionScope.Type=='proprio'}">
			<div id="corps" class="row">

				<div id="banderole" class="col-2">
					<br />
					<h4 style="font-size: 23; color: white">Menu</h4>
					<br /> <a href="proprio?id=1"> Consulter mes annonces</a> <br />
					<br /> <a href="proprio?id=2">Modifier une annonce</a> <br /> <br />
					<a href="proprio?id=3">Publier une annonce</a> <br /> <br /> <a
						href="proprio?id=4">Valider un sitter</a> <br /> <br /> <a
						href="proprio?id=5">Noter un sitter</a> <br /> <br /> <a
						href="accueil">Me déconnecter</a> <br />



				</div>

				<div id="textePrincipal" class="col-8">

					<p>
					<h2>Propriétaire</h2>
					</p>
					<p>
						Bon retour parmi nous. Que souhaitez-vous faire ? <br /> <br />
					<ul>
						<li><a href="proprio?id=1"> Consulter mes annonces</a></li>
						<br />
						<li><a href="proprio?id=2">Modifier une annonce</a></li>
						<br />
						<li><a href="proprio?id=3">Publier une annonce</a></li>
						<br />
						<li><a href="proprio?id=4">Valider un pet-sitter sur une
								annonce</a></li>
						<br />
						<li><a href="proprio?id=5">Noter un pet-sitter sur un
								petsitting réalisé</a></li>
						<br />
						<li><a href="accueil">Me déconnecter</a></li>
						<br />
					</ul>
				</div>
		</c:if>




		<c:if test="${sessionScope.Type=='sitter'}">
			<div id="corps" class="row">

				<div id="banderole" class="col-2">
					<br />
					<h4 style="font-size: 23; color: white">Menu</h4>
					<li><a href="sitter?id=1">Consulter les annonces
							auxquelles j'ai postulé</a></li> <br />
					<li><a href="sitter?id=2">Consulter toutes les annonces</a></li> <br />
					<li><a href="sitter?id=3">Postuler à une annonce</a></li> <br />
					<li><a href="sitter?id=4">Noter un propriétaire sur un
							petsitting réalisé</a></li> <br />
					<li><a href="accueil">Me déconnecter</a></li> <br /> <br />

				</div>

				<div id="textePrincipal" class="col-8">

					<p>
					<h2>Pet-sitter</h2>
					</p>

					Bon retour parmi nous. Que souhaitez-vous faire ? <br /> <br />
					<ul>
						<li><a href="sitter?id=1">Consulter les annonces
								auxquelles j'ai postulé</a></li>
						<br />
						<li><a href="sitter?id=2">Consulter toutes les annonces</a></li>
						<br />
						<li><a href="sitter?id=3">Postuler à une annonce</a></li>
						<br />
						<li><a href="sitter?id=4">Noter un propriétaire sur un
								petsitting réalisé</a></li>
						<br />
						<li><a href="accueil">Me déconnecter</a></li>
						<br />
						<br />
					</ul>



				</div>
		</c:if>
</body>
</html>



