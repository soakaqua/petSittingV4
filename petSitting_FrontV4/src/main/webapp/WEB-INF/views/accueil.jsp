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

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSSpetsitting.css">

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

<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/logo.jpg" />
<meta charset="UTF-8">
<title>PetSitting</title>
</head>
<body>
	<div id="footer">PETSITTING 2020 AJC Ingénierie - SOPRA</div>

	<div id="entete" class="row">

		<div id="logoEntete" class="col-2">
			<a href="Main page.html"> <img height="135" width="130"
				src="logo.jpg" />
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

		<div id="banderole" class="col-2">
			<br />
			<h4 style="font-size: 23; color: white">Menu</h4>
			<br /> <a href="connexion">Connexion</a> <br /> <br /> <a
				href="connexion?id=2" >Inscription</a> <br /> <br /> <a
				href="Main page.html">Accueil</a> <br /> <br /> <a
				href="Proprio main.html"> Accès cheat Proprio</a> <br /> <br /> <a
				href="Sitter main.html"> Accès cheat Sitter</a> <br /> <br />
		</div>

		<div id="textePrincipal" class="col-8">

			<p>
			<h2>Page Principale</h2>
			</p>

			Ce site permet de mettre en lien des pet-sitters compétents avec des
			propriétaires voulant prendre soin de leurs animaux. Nous offrons
			différents services comme des promenades, massages ou soins médicaux
			pour le bien-être de vos animaux. <br /> Nous offrons une
			optmisation du temps de trajet via la selection des annonces par code
			postal. <br /> (carte de la france ?) <br /> <br /> <a
				href="connexion">Connexion</a> <br /> <br /> <a href="toto">Inscription</a>
			<br /> <br /> <br /> <br />

		</div>



	</div>
</body>
</html>



