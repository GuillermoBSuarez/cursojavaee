package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Tabla")
public class Tabla extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body><center>");
		out.println("<h1>Tabla del " + numero + "</h1>");
		for (int i = 1; i <= 10; i++) {
			out.println("<h4>" + numero + " * " + i + " = " + numero * i + "</h4>");
		}
		out.println("</center></body></html>");
		out.close();
	}
}