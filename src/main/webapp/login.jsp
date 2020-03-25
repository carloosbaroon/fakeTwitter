<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<link href="styles/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery-3.4.1.min.js"> </script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>

    <nav class="navbar navbar-default">
        <div class="container">
            <div class="navbar-header">
            <s:url action="goto_twitter" var="twitter"/>

                <a class="navbar-brand" href="index.jsp">Registro</a>
            </div>
            <div class="navbar-header">
            <s:url action="goto_login" var="login"/>

                <a class="navbar-brand" href="login.jsp">Login</a>
            </div>

        </div>
    </nav>

        <div class="col-sm-4">
            <s:form action="loginuser">
                <s:textfield name="usuario.mail" label="Correo" />
                <s:textfield name="usuario.password" label="Contraseña" />

                <a> <s:submit value="Registrarme"/> </a>
            </s:form>

    </div>

</body>
</html>