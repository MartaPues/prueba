package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Bienvenida
 */
@WebServlet("/Bienvenida")
public class Bienvenida extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		PrintWriter out=response.getWriter();
		
///////////		
		String user=request.getParameter("user");
		HttpSession s=request.getSession();
				
		//comprobamos si tenemos ya el atributo
		//y si es así lo recogemos
		if(s.getAttribute("usuario_sesion")!=null) {
			
		}
		//incrementamos la variable y la guardamos
		s.setAttribute("usuario_sesion", user );
		//transferimos petición a la página de inicio
		out.println("<br/><br/><a href='login.html'>Volver</a>");
		out.println("<br/><br/><a href='login.html'>Volver</a>");
		out.println("<br/><br/><a href='login.html'>Volver</a>");
		out.println("</body></html>");
		out.close();
	}

}
