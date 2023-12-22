package servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Producto;

@WebServlet("/eliminar")
public class eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
				
		/* En el html de eliminar hemos añadido como parámetro de la url el nombre del producto a eliminar.
		Ahora lo recogemos y lo usamos.*/
		String nombre = request.getParameter("nombre");

		// Recogemos la lista de los atributos de sesión.
		List<Producto> productos = (List<Producto>) session.getAttribute("productos");
		
		// 					Predicate
		productos.removeIf( p -> p.getNombre().equals(nombre));
		
		/* No hacemos setAttribute porque productos en Java las variables de tipo objeto no contienen
		el objeto sino una referencia al objeto, así que productos está apuntando a blablablá. */

		request.getRequestDispatcher("carrito.jsp").forward(request, response);
	}
}