package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.GestorService;

@WebServlet("/eliminar")
public class eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestorService service = new GestorService();
		
		service.borrar(request.getParameter("nombre"));
		request.getRequestDispatcher("gestor.html").forward(request, response);
	}
}