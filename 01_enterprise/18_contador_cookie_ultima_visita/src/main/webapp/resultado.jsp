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
			<%String fecha = "Primera visita";
			Cookie[] cookies = request.getCookies();
			/* Estas son las cookies que el cliente YA TENÍA (si tenía) en su navegador. */
			
			if (cookies!=null){
				for (Cookie cookie:cookies){
					if(cookie.getName().equals("fecha")) fecha = cookie.getValue();
				}
			}%>
			<h1>Has entrado <%=session.getAttribute("contador")%> veces</h1><br>
			<h1>Número total de visitas: <%=application.getAttribute("global")%></h1><br>
			<h1>Fecha de tu anterior visita: <%=fecha%></h1><br>
			<a href="inicio.html">Volver</a>
		</div>
	</body>
</html>