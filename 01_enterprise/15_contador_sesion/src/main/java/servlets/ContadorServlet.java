package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/ContadorServlet")
public class ContadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// "pedimos" el HttpSession
		HttpSession session = request.getSession();
		
		// recuperamos el contador, si es nulo (primera vez) lo ponemos a 0,
		// incrementamos y guardamos
		int contador = session.getAttribute("contador")==null ? 0 : (Integer)session.getAttribute("contador");
		session.setAttribute("contador", ++contador);
	
		// transferimos al jsp
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}
}