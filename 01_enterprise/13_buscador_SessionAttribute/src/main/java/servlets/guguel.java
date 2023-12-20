package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
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
		Buscador buscador = new Buscador();
		
		request.setAttribute("resultados", buscador.buscar(request.getParameter("tematica")));
		request.getRequestDispatcher("resultados.jsp").forward(request, response);
	}
}