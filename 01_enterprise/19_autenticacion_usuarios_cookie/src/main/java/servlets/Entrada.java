package servlets;

import java.io.IOException;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class Entrada extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String usuario = Arrays.stream( request.getCookies() != null ? request.getCookies() : new Cookie[0])
							  .filter( c -> c.getName().equals("usuario") )
							  .findFirst()
							  .orElse(new Cookie("usuario", null))
							  .getValue();
		
		if (usuario == null) {
			request.getRequestDispatcher("Login.html").forward(request, response);
		} else {
			request.getRequestDispatcher("correcto.jsp?usuario=" + usuario).forward(request, response);
			// O también como atributo de sesión: request.setAttribute("usuario", usuario);
		}
	}
}