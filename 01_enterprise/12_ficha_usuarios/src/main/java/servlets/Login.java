package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;
import service.UsuariosService;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UsuariosService service = new UsuariosService();
		RequestDispatcher dispatcher;
		if (service.autenticar(request.getParameter("usuario"), request.getParameter("password"))){
			// busca la ficha
			Ficha ficha = service.fichaUsuario(request.getParameter("usuario"));
			// guardamos ficha en atributo de petición
			request.setAttribute("ficha", ficha);			
			// a correcto.jsp
			dispatcher = request.getRequestDispatcher("correcto.jsp");
		} else {
			// a error.jsp
			dispatcher = request.getRequestDispatcher("error.jsp");
		}
		dispatcher.forward(request, response);
	}
}