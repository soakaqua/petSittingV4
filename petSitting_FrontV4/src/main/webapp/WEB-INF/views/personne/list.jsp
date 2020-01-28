<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- bootstrap -->
<c:set var="ctx" value="${pageContext.servletContext.contextPath}"></c:set>
<link rel="stylesheet" href="${ctx}/bootstrap/css/bootstrap.min.css">
<!-- lien bootstrap js local -->
<script rel="stylesheet" src="${ctx}/bootstrap/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
	
	
	
		<a href="${ctx}/personne/addFormateur" class="btn btn-link">ajout
			formateur </a> <a href="${ctx}/personne/addEleve" class="btn btn-link">ajout
			Eleve </a>

		<table class="table">
			<tr>
				<th>id</th>
				<th>civilite</th>
				<th>prenom</th>
				<th>nom</th>
				<th>date de naissance</th>
				<th>adresse</th>
				<th>code postal</th>
				<th>ville</th>
				<th>salle</th>
			</tr>
			<!-- forEach : issu de la jstl -->
			<c:forEach items="${personne}" var="p">
				<tr>
					<td>${p.id}</td>
					<td>${p.civilite.francais}</td>
					<td>${p.prenom}</td>
					<td>${p.nom}</td>
					<td><fmt:formatDate value = "${p.dtNaiss}" pattern="dd/MM/yyyy"/></td>
					<td>${p.adresse.numero}&nbsp;${p.adresse.rue}</td>
					<!-- &nbsp : espace (html) -->
					<td>${p.adresse.codePostal}</td>
					<td>${p.adresse.ville}</td>
					<td>${p.salle.nom}</td>

					<td><a href="${ctx}/personne/edit?id=${p.id}"
						class="btn btn-info">editer</a></td>
					<td><a href="${ctx}/personne/delete?id=${p.id}"
						class="btn btn-warning">supprimer</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>





</body>
</html>