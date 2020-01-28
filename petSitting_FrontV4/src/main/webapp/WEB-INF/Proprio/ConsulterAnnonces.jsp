<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="CSS petsitting.css">

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<link rel="icon" type="image/png" href="logo.jpg" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PetSitting</title>
</head>
<body>

<div id="footer">
	PETSITTING 2020 AJC Ingénierie - SOPRA
</div>
	
<div id="entete" class="row">

	<div id="logoEntete" class="col-2">
		<a href="Main page.html"> <img height="135" width="130" src="logo.jpg"/> </a> <br/><br/>
	</div>
	
	<div id="titreEntete" class="col-10">
	<p> <h1> Bienvenue sur PetSitting </h1> </p>
	
	<p style="font:bold;font-size:20;text-align:right;margin-right:5px"> Le site de référence pour faire garder vos animaux </p>
	</div>
	
</div> 


<div id="corps" class="row">
	
	<div id="banderole" class="col-2">
	<br/>
	<h4 style="font-size:23;color:white">Menu</h4>
	<br/>
	<a href="Proprio consulterAnnonces.html"> Consulter mes annonces</a> <br/><br/>
	<a href="Proprio modifierAnnonce.html">Modifier une annoncee</a> <br/><br/>
	<a href="Proprio publierAnnonce.html">Publier une annonce</a> <br/><br/>
	<a href="Proprio validerSitter.html">Valider un sitter</a> <br/><br/>
	<a href="Proprio noterS.html">Noter un sitter</a> <br/><br/>	
	<a href="Main page.html">Accueil</a> <br/><br/>
	<a href="#deco">Me deconnecter </a> <br/><br/>
</div> 
	
<div id="textePrincipal" class="col-8">

<p> <h2> Propriétaire > Consulter mes annonces </h2> </p> 

<p> <h3> Consulter mes annonces </h3> </p> 

	Voici les annonces que vous avez publiées : <br/><br/>
	

<table border>

<c:forEach items="${ listeAnnonce }" var="ann">
	<tr>
		<td> ${ann.titre} </td>
		<td> ${ann.msg} </td>
	</tr>
</c:forEach>
	
</table>
	
</div>

</body>
</html>
