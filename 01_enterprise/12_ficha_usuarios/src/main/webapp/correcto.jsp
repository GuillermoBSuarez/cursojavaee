<%-- El primer bloque que define el tipo de lenguaje, contenido, etc.
es la directiva page. Una directiva se define por <%@. A ésta
le añadimos un parámetro para importar la clase Ficha, ya que la
necesitamos para castear la ficha de alumno que trae el request. --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="model.Ficha"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Correcto</title>
</head>
<body>
	<center>
	<%--recuperamos la ficha--%>
	<%Ficha f = (Ficha)request.getAttribute("ficha");%>

		<h2>Ficha de <%=request.getParameter("usuario")%></h2>
		<h3>Nombre: <%=f.getUsuario()%></h3>
		<h3>Edad: <%=f.getEdad()%></h3>
		<h3>e-mail: <%=f.getEmail()%></h3>
		<br>
		<br>
		<a href="Login.html">Volver</a> 
	</center>
</body>
</html>