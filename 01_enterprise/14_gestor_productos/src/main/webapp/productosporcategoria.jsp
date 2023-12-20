<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Producto, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Productos por categoría</title>
</head>
<body>
<center>
	<%--recuperamos los resultados--%>
	<%List<Producto> productos = (List<Producto>)request.getAttribute("ProductosPorCategoria");%>
	<h2>Resultados de <%=request.getParameter("categoria")%></h2>
	<%for (Producto p:productos) {%>
		<h3><%=p.getNombre()%></h3>
		<h4><%=p.getPrecio()%></h4>
	<%}%>
	<br>
	<br>
	<a href="gestor.html">Volver</a> 
	</center>
</body>
</html>