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
		<h1>Edition personne</h1>
		<c:choose>
			<%-- equivalent if  --%>
			<c:when test="${personne.getClass().simpleName == 'Formateur'}">
				<%-- equivalent if : on récupère le nom simplifié de la classe --%>
				<c:url var="action" value="/personne/saveFormateur"></c:url>
			</c:when>
			<c:otherwise>
				<c:url var="action" value="/personne/saveEleve"></c:url>
			</c:otherwise>
		</c:choose>
		<!-- form de spring ; modelAttribute : sorte de préfixe pour les appels model -->
		<form:form action="${action}" methode="post" modelAttribute="personne">
			<%-- on a choisi action en fonction de la classe avec les c:url --%>
			<form:hidden path="version" />
			<%-- envoyer la version pour éviter de modifier quelque chose avec la mauvaise version --%>
			<div class="form-group">
				<form:label path="id">id</form:label>
				<form:input path="id" cssClass="form-control" readonly="true"
					placeHolder="numéro généré automatiquement"></form:input>
			</div>
			<div class="form-group">
				<form:label path="civilite">civilite</form:label>
				<form:select path="civilite" items="${civilites}"
					itemLabel="francais" cssClass="form-control">
				</form:select>

			</div>
			<div class="form-group">
				<form:label path="prenom">prenom :</form:label>
				<form:input path="prenom" cssClass="form-control"></form:input>
				<%-- affiche message d'erreur quand binding result déclenché --%>
				<form:errors path="prenom" cssClass="alert alert-danger" element="div"></form:errors>
			</div>
			<div class="form-group">
				<form:label path="nom">nom :</form:label>
				<form:input path="nom" cssClass="form-control"></form:input>
				<form:errors path="nom"></form:errors>
			</div>
			<div class="form-group">
				<form:label path="dtNaiss">Date de naissance :</form:label>
				<form:input type="date" path="dtNaiss" cssClass="form-control"></form:input>
			</div>
			<div class="form-group">
				<form:label path="adresse.numero">numero :</form:label>
				<form:input type="number" path="adresse.numero"
					cssClass="form-control"></form:input>
			</div>
			<div class="form-group">
				<form:label path="adresse.rue">rue :</form:label>
				<form:input path="adresse.rue" cssClass="form-control"></form:input>
			</div>
			<div class="form-group">
				<form:label path="adresse.codePostal">code postal :</form:label>
				<form:input path="adresse.codePostal" cssClass="form-control"></form:input>
			</div>
			<div class="form-group">
				<form:label path="adresse.ville">ville :</form:label>
				<form:input path="adresse.ville" cssClass="form-control"></form:input>
			</div>
			
			
			<div class="form-group">
				<form:label path="salle">salle :</form:label>
				<%-- Spring comprend que salle.nom est un objet salle et stock directement l'objet salle grace au path="salle.nom" --%>
				<%-- path du select : où on stock la donnée --%>
				<form:select path="salle.nom" cssClass="form-control">
					<%-- On peut avoir options + plusieurs option --%>
					<%-- on lui renvoie un id null => pb avec save => géré dans save --%>
					<form:option value ="">pas de salle</form:option>
					<%-- items : issu du model envoyé par le controller | itemValue : valeur qu'on envoie | itemLabel affichage du nom 	 --%>
					<form:options items="${salles}" itemValue="nom" itemLabel="nom" ></form:options>
				</form:select>
			</div>


			<c:choose>
				<%-- equivalent if  --%>
				<c:when test="${personne.getClass().simpleName == 'Formateur'}">
					<%-- equivalent if : on récupère le nom simplifié de la classe --%>
					<div class="form-group">
						<form:label path="experience">experience :</form:label>
						<form:input path="experience" cssClass="form-control"></form:input>
					</div>
					<div class="form-group">
						<form:label path="referent">referent :</form:label>
						<form:checkbox path="referent"></form:checkbox>
					</div>
				</c:when>
				<c:otherwise>
					<div class="form-group">
						<form:label path="formation">formation :</form:label>
						<form:input path="formation" cssClass="form-control"></form:input>
					</div>
				</c:otherwise>
			</c:choose>

			<div class="form-group">
				<button type="submit" class="btn btn-success">envoyer</button>
				<a href="${ctx}/personne/list" class="btn btn-warning">annuler</a>
			</div>

		</form:form>

	</div>

</body>
</html>