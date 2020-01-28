<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<!-- bootstrap -->
<c:set var="ctx" value="${pageContext.servletContext.contextPath}"></c:set>
<link rel="stylesheet" href="${ctx}/bootstrap/css/bootstrap.min.css">
<!-- lien bootstrap js local -->
<script rel="stylesheet" src="${ctx}/bootstrap/js/bootstrap.min.js"></script>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>ajout salle</h1>
		
		<!-- form de spring ; modelAttribute : sorte de préfixe pour les appels model -->
		<form:form action="${ctx}/salle/saveSalle" methode="post" modelAttribute="salle">
			<div class="form-group">
				<form:label path="nom">nom</form:label>
				<form:input path="nom" cssClass="form-control" ></form:input>
			</div>

		


			<div class="form-group">
				<button type="submit" class="btn btn-success">envoyer</button>
				<a href="${ctx}/salle/list" class="btn btn-warning">annuler</a>
			</div>

		</form:form>

	</div>

</body>
</html>