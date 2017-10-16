package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TablaNumero
 */
@WebServlet("/TablaNumero")
public class TablaNumero extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num=Integer.parseInt(request.getParameter("numero"));
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body><center>");
		out.println("<h1>Tabla del "+num+"</h1>");
		out.println("<table border='1'>");
		for(int i=1;i<=10;i++) {
			out.println("<tr><td>"+num+"X"+i+"</td><td>"+num*i+"</td></tr>");
		}
		out.println("</table></center></body></html>");
	}

}
