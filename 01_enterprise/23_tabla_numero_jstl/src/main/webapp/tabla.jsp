<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align='center'>
		<%int num = Integer.parseInt(request.getParameter("numero"));%>
		<h1>Tabla del ${param.numero}</h1>
		
		<table border="1">
			<c:forEach var="i" begin="1" end="10">
				<tr>
					<td>${i} x ${param.numero}</td>
					<td>${i*param.numero}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<a href="numero.html">Volver</a>
</body>
</html>