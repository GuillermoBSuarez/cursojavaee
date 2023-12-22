<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" import="model.Producto, java.util.List, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Carro de compra</title>
</head>
<body>
<div align='center'>
	<h2>Carro de compra</h2>

	<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Precio</th>
			<th>Categoría</th>
			<th></th>
		</tr>
	
		<%--recuperamos los resultados--%>
		<%List<Producto> productos = session.getAttribute("productos") == null ?
				new ArrayList<>() :
				(List<Producto>) session.getAttribute("productos");
		for (Producto p:productos) {%>
			<tr>
				<td><%=p.getNombre()%></td>
				<td><%=p.getPrecio()%></td>
				<td><%=p.getCategoría()%></td>
				<td>
					<a href="eliminar?nombre=<%=p.getNombre()%>">Borrar</a>
				</td>
			</tr>
		<%}%>
	</table>
	<a href="menu.html">Volver</a> 
</div>
</body>
</html>