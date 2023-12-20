package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.GestorService;

public class productosPorCategoria extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestorService service = new GestorService();

		request.setAttribute("ProductosPorCategoria", service.productosPorCategoria(request.getParameter("categoria")));
		request.getRequestDispatcher("productosporcategoria.jsp").forward(request, response);
	}
}