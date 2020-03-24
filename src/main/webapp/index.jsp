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
						 
				<a class="navbar-brand" href="${twitter}">Registro</a>
			</div>
			
		</div>
	</nav>
	
		<div class="col-sm-4">
			<s:form action="registeruser">
				<s:textfield name="usuario.id_usuario" label="Name" />
				<s:textfield name="usuario.correo" label="Nombre" />
				<s:textfield name="usuario.contrase�a" label="Contrase�a" />

				<a> <s:submit value="Registrarme"/> </a>
			</s:form>
	
	</div>
</body>
</html>