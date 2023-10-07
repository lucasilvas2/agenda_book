<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Agenda - Lista</title>
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
	<div class="row">
		<c:if test="${deleted}">
			<div class="alert alert-success alert-dismissible fade show" role="alert">
				Contato excluído com sucesso!
				<a type="button" class="btn-close" data-bs-dismiss="alert"
					aria-label="Close" href="ListServlet"></a>
			</div>
		</c:if>
	</div>
	<div class="row justify-content-center">
		<div class="col-8">
			<h1>Lista de Contatos</h1>
			<table border="1" class="table table-striped table-info">
				<thead>
					<tr>
						<th>Name</th>
						<th>Email</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="contact" items="${contacts}">
						<tr>
							<td>${contact.name}</td>
							<td>${contact.phone}</td>
							<td>
								<form action="DetailContactServlet" method="POST"
									enctype="application/x-www-form-urlencoded">
									<input type="hidden" name="id" value="${contact.id}">
									<button class="btn btn-info" type="submit">Detalhes</button>
								</form>
							</td>
							<td>
								<form action="DeleteContactServlet" method="POST"
									enctype="application/x-www-form-urlencoded">
									<input type="hidden" name="id" value="${contact.id}">
									<button class="btn btn-danger" type="submit">Excluir</button>
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>



</body>
</html>