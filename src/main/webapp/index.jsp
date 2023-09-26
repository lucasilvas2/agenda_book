<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agenda - Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="vh-100 d-flex justify-content-center align-items-center">
<div class="row">
    <div class="col-12 text-center">
        <h1>Agenda</h1>
    </div>
    <div class="col-12 text-middle mt-2">
        <div class="card p-2">
            <form action="LoginServlet" method="POST">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="user" name="user" placeholder="Usuário">
                    <label for="user">Usuário</label>
                </div>
                <div class="form-floating">
                    <input type="password" class="form-control" id="password" name="password" placeholder="Senha">
                    <label for="password">Senha</label>
                </div>
                <div class="d-flex justify-content-center">
                    <button type="submit" class="btn btn-info">Login</button>
                </div>
            </form>
        </div>
    </div>

</div>
</body>
</html>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>