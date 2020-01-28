<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- CHEMIN ABSOLU avec ctx -->
<c:set var="ctx" value="${pageContext.servletContext.contextPath}"></c:set>
<link rel="stylesheet" href="${ctx}/bootstrap/css/bootstrap.min.css"/> 
<script type="text/javascript" src="${ctx}/bootstrap/js/bootstrap.min.js"></script>

<link rel="icon" type="image/png" href="logo.jpg" />
<link rel="stylesheet" type="text/css" href="CSS petsitting.css">


<title>PetSitting</title>
</head>
<body class="container">

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
	<a href="proprio/consulterAnnonces">Consulter mes annonces</a> <br/><br/>
	<!--
	<a href="proprio/modifierAnnonce">Modifier une annoncee</a> <br/><br/>
	-->
	<a href="proprio/publierAnnonce">Publier une annonce</a> <br/><br/>
	<a href="proprio/validerSitter">Valider un sitter</a> <br/><br/>
	<a href="proprio/noterS">Noter un sitter</a> <br/><br/>	
	<a href="accueil">Accueil</a> <br/><br/>
	<a href="#deco">Me deconnecter </a> <br/><br/>
</div> 
	
<div id="textePrincipal" class="col-8">

<p> <h2> Propriétaire > Consulter mes annonces </h2> </p> 

<p> <h3> Consulter mes annonces </h3> </p> 

	Voici les annonces que vous avez publiées : <br/><br/>
	
<table class="table" border="1">
			<tr>
				<th>Titre</th>
				<th>Message</th>
				<th>Services</th>
				<th>Statut</th>
				<th></th>
			</tr>
			
			<c:forEach items ="${ listeAnnonce }" var="a">
				<tr>
					<!-- COLONNES -->
					<td>${a.titre}</td>
					<td>${a.msg}</td>
					<td>${a.service}</td>
					<td>${a.statut}</td>	
					
					<!-- BOUTONS -->				
					<td><a href="${ctx}/proprio/save?numA=${a.numA}" class="btn btn-primary">Modifier</a></td>
					<td><a href="${ctx}/proprio/delete?numA=${a.numA}" class="btn btn-danger">Supprimer</a></td>									
				</tr>
				
			</c:forEach>
		</table>
	
	
</div>

</body>
</html>
