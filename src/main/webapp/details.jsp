<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Agenda - Detalhe</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body class="row vw-100">
	<div class="row">
		<jsp:include page="navbar.jsp" />
	</div>
	<div class="row justify-content-center">
		<div class="col-8">
			<h1>Contato</h1>

			<ul class="list-group">
				<li class="list-group-item">Nome: ${contact.name}</li>
				<li class="list-group-item">Telefone: ${contact.phone}</li>
				<li class="list-group-item">Telefone Residêncial:
					${contact.phoneHome}</li>
				<li class="list-group-item">Email: ${contact.email}</li>
				<li class="list-group-item">Data de nascimento: ${contact.date}</li>
			</ul>
		</div>
	</div>
</body>
</html>