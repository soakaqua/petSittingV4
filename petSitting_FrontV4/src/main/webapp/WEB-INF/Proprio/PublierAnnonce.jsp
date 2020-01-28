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

<p><h2> Propriétaire > Publier une annonce </h2></p> 

<p><h3> Publier une annonce </h3></p> 

	Vous voulez publier une annonce. Veuillez remplir les champs suivants :
	
	<br/><br/>

<em><p><label for="titre">Titre</label></p></em>
	<input size=63 placeholder="ex: Cherche pet-sitter pour chat" required id="titre" name="titre" type="text"/>   
	<br/><br/>
	
<em><p><label for="message" >Message</label></p></em>
<textarea rows="5" cols="60" placeholder="ex: Date, lieu" required id="message" name="message"></textarea> <br/><br/>

<em><p><label for="services">Selectionnez le(s) service(s)</label></p></em>
<input type="checkbox" id="gp" name="gp"/> <label for="gp">Garde chez propriétaire</label> <br/> <!-- on peut cliquer sur tout ce qui est dans le label pour cocher -->
<input type="checkbox" id="gs" name="gs"/> <label for="gs">Garde chez le sitter</label> <br/>
<input type="checkbox" id="med" name="med"/> <label for="med">Soins médicaux</label> <br/>
<input type="checkbox" id="bal" name="bal"/> <label for="bal">Ballade</label> <br/>
<input type="checkbox" id="mas" name="mas"/> <label for="mas">Massage</label> <br/>
<input type="checkbox" id="to" name="to"/> <label for="to">Toilettage</label> <br/>
<input type="checkbox" id="ali" name="ali"/> <label for="ali">Alimentaire</label>

<br/><br/>
<input value="Valider" type="submit" onClick="publierAnnonce()"/>
<br/><br/><br/><br/>

	
</div>

</body>
</html>
