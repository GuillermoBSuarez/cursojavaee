<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" import="model.Producto, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Productos por categoría</title>
</head>
<body>
<center>
	<h2>Resultados de <%=request.getParameter("categoria")%></h2>

	<table border="1">
		<th>
			<td>Nombre</td>
			<td>Precio</td>
		</th>
	
		<%--recuperamos los resultados--%>
		<%List<Producto> productos = (List<Producto>)request.getAttribute("ProductosPorCategoria");%>
		<%for (Producto p:productos) {%>
			<tr>
				<td><%=p.getNombre()%></td>
				<td><%=p.getPrecio()%></td>
			</tr>
		<%}%>
	</table>
	<a href="gestor.html">Volver</a> 
	</center>
</body>
</html>