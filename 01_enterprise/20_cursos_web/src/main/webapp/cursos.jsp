<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" import="model.Curso, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cursos por precio</title>
</head>
<body>
	<div align='center'>
		<h1>Cursos de hasta <%=request.getParameter("precio")%> euros</h1>
	
		<table border="1">
			<tr>
				<th>Nombre</th>
				<th>Duración</th>
				<th>Precio</th>
			</tr>
		
			<%--recuperamos los resultados--%>
			<%ArrayList<Curso> cursos = (ArrayList<Curso>)request.getAttribute("cursos");%>
			<%for (Curso c:cursos) {%>
				<tr>
					<td><%=c.getNombre()%></td>
					<td><%=c.getDuracion()%></td>
					<td><%=c.getPrecio()%></td>
				</tr>
			<%}%>
		</table>
		<a href="menu.html">Volver</a> 
	</div>
</body>
</html>