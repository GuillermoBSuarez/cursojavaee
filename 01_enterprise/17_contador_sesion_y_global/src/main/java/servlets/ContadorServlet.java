package servlets;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ContadorServlet")
public class ContadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		// recuperamos el contador, si es nulo (primera vez) lo ponemos a 0,
		// incrementamos y guardamos
		int contador = session.getAttribute("contador")==null ? 0 : (Integer)session.getAttribute("contador");
		session.setAttribute("contador", ++contador);
	
		int global = context.getAttribute("global")==null ? 0 : (Integer)context.getAttribute("global");
		context.setAttribute("global", ++global);

		// transferimos al jsp
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}
}