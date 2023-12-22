package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Producto;

@WebServlet("/grabar")
public class grabar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// "Solicitamos" la sesión
		HttpSession session = request.getSession();
		
		/* Recuperamos la lista de productos de la sesión. No comprobamos si está a null sino
		que lo creamos como ArrayList vacío. Si del parámetro no viene nada se queda vacía,
		y si viene algo lo añade. Pero en una lista null daría error intentar añadir algo. */
		List<Producto> productos = session.getAttribute("productos") == null ?
				new ArrayList<>() :
				(List<Producto>) session.getAttribute("productos");
		productos.add( new Producto( request.getParameter("nombre"),
									 Double.parseDouble(request.getParameter("precio")),
									 request.getParameter("categoria")));
		session.setAttribute("productos", productos);
			
		request.getRequestDispatcher("menu.html").forward(request, response);
	}
}