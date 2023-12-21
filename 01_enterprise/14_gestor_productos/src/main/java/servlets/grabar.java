package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Producto;
import service.GestorService;

@WebServlet("/grabar")
public class grabar extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestorService service = new GestorService();
		
		service.grabar(new Producto( request.getParameter("nombre"),
									 Double.parseDouble(request.getParameter("precio")),
									 request.getParameter("categoria")));
		
		request.getRequestDispatcher("gestor.html").forward(request, response);
	}
}