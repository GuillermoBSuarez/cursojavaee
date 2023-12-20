<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Pagina, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guguel</title>
</head>
<body>
<center>
	<%--recuperamos los resultados--%>
	<%List<Pagina> paginas = (List<Pagina>)request.getAttribute("resultados");%>
	<h2>Resultados de <%=request.getParameter("tematica")%></h2>
	<%for (Pagina p:paginas) {%>
		<h3><a href="<%=p.getUrl()%>"><%=p.getUrl()%></a></h3>
		<h3><%=p.getDescripcion()%></h3>
	<%}%>
	<br>
	<br>
	<a href="buscar.html">Volver</a> 
	</center>
</body>
</html>