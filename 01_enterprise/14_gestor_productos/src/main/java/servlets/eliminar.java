package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.GestorService;

import java.io.IOException;

public class eliminar extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestorService service = new GestorService();
		
		request.setAttribute("nombre", request.getParameter("nombre"));
		request.getRequestDispatcher("eliminar.jsp").forward(request, response);
	}
}