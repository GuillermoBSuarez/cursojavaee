<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align='center'>
		<h1>Has entrado <%=session.getAttribute("contador")%> veces</h1><br>
		<h1>Número total de visitas: <%=application.getAttribute("global")%></h1><br>
		<a href="inicio.html">Volver</a>
	</div>
</body>
</html>