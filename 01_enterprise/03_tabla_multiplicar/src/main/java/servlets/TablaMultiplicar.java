package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TablaMultiplicar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body><center><table border=1>");
		for (int x=1; x<=10; x++) {
			out.println("<tr>");
			for (int y=1; y<=10; y++) {
				out.print("<td> " + y*x + " </td>");
			}
			out.println("</tr>");
		}
		out.println("</table></center></body></html>");
		out.close();
	}
}