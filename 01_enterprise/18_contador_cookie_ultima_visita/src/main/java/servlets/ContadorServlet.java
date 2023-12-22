package servlets;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
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
		
		int contador = session.getAttribute("contador")==null ? 0 : (Integer)session.getAttribute("contador");
		session.setAttribute("contador", ++contador);
	
		int global = context.getAttribute("global")==null ? 0 : (Integer)context.getAttribute("global");
		context.setAttribute("global", ++global);

		generarCookie(response);
		
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		/* OJO, en request está un cookies, el que tenía (o no) el cliente en su navegador,
		y en response está el cookies creado ahora y que recibirá y sobreescribirá el cliente al recibir
		la página que construye resultado.jsp */
	}
	
	private void generarCookie(HttpServletResponse response) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
		
		Cookie cookie = new Cookie("fecha", LocalDateTime.now().format(formatter));
		cookie.setMaxAge(100000);
		response.addCookie(cookie);
	}
}