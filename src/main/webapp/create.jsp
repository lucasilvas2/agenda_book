<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Agenda - Cadastro Contato</title>
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
			<h1>Novo contato</h1>
		</div>
		<div class="col-8">
			<form action="CreateContactServlet" method="POST"
				enctype="application/x-www-form-urlencoded">
				<div class="mb-3">
					<label for="name" class="form-label">Nome</label> <input
						type="text" class="form-control" id="name" name="name"
						placeholder="Nome do contato" value="nome">
				</div>
				<div class="mb-3">
					<label for="phone" class="form-label">Telefone</label> <input
						type="text" class="form-control" id="phone" name="phone"
						placeholder="(84) 91111-1111" value="(84) 91111-1111">
				</div>
				<div class="mb-3">
					<label for="phone_home" class="form-label">Telefone
						Residêncial</label> <input type="text" class="form-control"
						id="phone_home" name="phone_home" placeholder="(84) 3000-1111"
						value="(84) 3000-1111">
				</div>
				<div class="mb-3">
					<label for="email" class="form-label">Email</label> <input
						type="email" class="form-control" id="email" name="email"
						placeholder="name@example.com" value="name@example.com">
				</div>
				<div class="mb-3">
					<label for="date" class="form-label">Data de Nascimento</label> <input
						type="date" class="form-control" id="date" name="date"
						value="2023-10-02">
				</div>
				<div class="mb-3">
					<button type="submit" class="btn btn-info">Cadastrar</button>
					<button type="reset" class="btn btn-danger">Cancelar</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
