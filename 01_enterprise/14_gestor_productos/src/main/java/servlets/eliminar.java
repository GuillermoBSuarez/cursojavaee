package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Producto;
import service.GestorService;

import java.io.IOException;

@WebServlet("/eliminar")
public class eliminar extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestorService service = new GestorService();
		
		service.borrar(request.getParameter("nombre"));
		request.getRequestDispatcher("gestor.html").forward(request, response);
	}
}