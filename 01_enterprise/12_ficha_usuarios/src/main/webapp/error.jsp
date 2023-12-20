<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>
	<center>
		<h3>Pues a <%=request.getParameter("usuario")%> con contraseña <%=request.getParameter("password")%> no le conozco de nada.</h3>
		<br><br>
		<a href="Login.html">Volver</a>
	</center>
</body>
</html>