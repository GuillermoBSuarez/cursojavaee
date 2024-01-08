<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" import="model.*, java.util.*"%>
<%@taglib uri="jakarta.tags.core" prefix="c"%>
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
	
		<c:if test="${!empty sessionScope.carrito}">
			<c:forEach var="pr" items="${sessionScope.carrito}">
				<tr>
					<td>${pr.nombre}</td>
					<td>${pr.precio}</td>
					<td>${pr.categoria}</td>
					<td><a href="eliminar?nombre=${pr.nombre}">Borrar</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
	<a href="menu.html">Volver</a> 
</div>
</body>
</html>