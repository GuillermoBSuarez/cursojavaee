package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pagina;
import service.Buscador;

public class guguel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		Buscador buscador = new Buscador();
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body><center>");
		out.println("<h1>Resultados sobre " + request.getParameter("tematica") + "</h1>");
		for (Pagina p:buscador.buscar(request.getParameter("tematica"))) {
			out.println("<h2><a href='" + p.getUrl() + "'>" + p.getUrl() + "</a></h2>");
			out.println("<h4>" + p.getDescripcion() + "</h4><hr>");
		}
		out.println("</center></body></html>");
		out.close();
	}
}