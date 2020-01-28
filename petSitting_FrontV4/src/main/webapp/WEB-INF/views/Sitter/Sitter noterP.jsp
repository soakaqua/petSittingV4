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

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<link rel="icon" type="image/png" href="logo.jpg" />
<title>PetSitting</title>
</head>
<body>
	<div id="footer">
	PETSITTING 2020 AJC Ingénierie - SOPRA
</div>
	
<div id="entete" class="row">

	<div id="logoEntete" class="col-2">
	<img height="135" width="130" src="logo.jpg"/>
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
	<a href="Sitter consulterAnnoncesS.html"> Consulter mes annonces</a> <br/><br/>
	<a href="Sitter toutesAnnonces.html">Consulter toutes les annonces </a> <br/><br/>
	<a href="Sitter postulerAnnonce.html">Postuler à une annonce</a> <br/><br/>
	<a href="Sitter noterP.html">Noter un propriétaire</a> <br/><br/>	
	<a href="Main page.html">Accueil</a> <br/><br/>
	<a href="#deco">Me deconnecter </a> <br/><br/>
	
	
	</div>  
	
	<div id="textePrincipal" class="col-8">

<p><h2> Pet-sitter > Noter un propriétaire </h2></p> 

<p><h3> Noter un propriétaire sur une annonce passée </h3></p> 

Vous voulez noter un propriétaire sur vos interactions sur l'une des annonces passées. 
<br/><br/>
<em><p>Choix de l'annonce réalisée :</p></em>

<br/><br/>

Veuillez remplir les champs suivants : <br/><br/>

<em><p><label for="noteS">Notez entre 0 (à ne pas recommander) et 5 (à recommander) :</label></p></em>
<input type="radio" name="ns"/>0 
<input type="radio" name="ns"/>1 
<input type="radio" name="ns"/>2 
<input type="radio" name="ns"/>3 
<input type="radio" name="ns"/>4 
<input type="radio" name="ns"/>5

<br/><br/>
<input value="Valider" type="submit"/>
<br/><br/>

	
	
</div> 
</body>
</html>



