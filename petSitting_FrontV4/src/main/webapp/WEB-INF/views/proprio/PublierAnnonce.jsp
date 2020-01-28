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

<p><h2> Propriétaire > Publier une annonce </h2></p> 

<p><h3> Publier une annonce </h3></p> 

	Vous voulez publier une annonce. Veuillez remplir les champs suivants :
	
	<br/><br/>
	
	<!-- FORMULAIRE -->	
	<form:form action="add" method="post" modelAttribute="personne">
		<!--  
		<form:hidden path="version"/> 
		-->

			<!-- CHAMPS DE CREATTION D'ANNONCE -->
			<div class="form-group">
				<form:label path="titre">Titre</form:label>
				<form:input path="titre" placeholder="Entrez un titre" cssClass="form-control"/>
				<form:errors path="titre" cssClass="alert alert-danger">
					<div class="alert alert-danger"> Champ obligatoire </div>
				</form:errors>   
			</div>
			
			<div class="form-group">
				<form:label path="msg">Message</form:label>
				<form:textarea path="msg" placeholder="Entrez un message" rows="5" cols="60"></form:textarea>
				<form:errors path="msg" cssClass="alert alert-danger">
					<div class="alert alert-danger"> Champ obligatoire </div>
				</form:errors>   
			</div>
			
			<div class="form-group">
				<form:label path="services">Selectionnez le(s) service(s)</form:label>
				<c:forEach items="${services}">
					<form:checkbox path="services.nom" items="${services}" itemValue="nom" itemLabel="nom" cssClass="form-control"/>
				</c:forEach>
			</div>
	
	</form:form>
	
				<!-- BOUTONS DE VALIDATION OU ANNULATION -->
			<div class="form-group">
				<button type="submit" class="btn btn-success">Valider</button>
				<a href="${ctx}/proprio/ConsulterAnnonces" class="btn btn-warning">Annuler</a>
			</div>
	
</div>

</body>
</html>
