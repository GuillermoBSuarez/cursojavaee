package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.GestorService;

@WebServlet("/productosporcategoria")
public class productosPorCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestorService service = new GestorService();

		request.setAttribute("ProductosPorCategoria", service.productosPorCategoria(request.getParameter("categoria")));
		request.getRequestDispatcher("productosporcategoria.jsp").forward(request, response);
	}
}