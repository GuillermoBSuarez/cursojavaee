<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla de multiplicar JSP</title>
</head>
<body>
	<center>
		<table>
			<%for (int x=1; x<=10; x++) {%>
				<tr>
				<%for (int y=1; y<=10; y++) {%>
					<td><%=y*x%></td>
				<%}%>
				</tr>
			<%}%>
		</table>	
	</center>
</body>
</html>