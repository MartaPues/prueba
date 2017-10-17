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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		if(pwd.equals("curso")){
			//obtener requestdispatcher
			rd=request.getRequestDispatcher("Bienvenida");	
			String user=request.getParameter("user");
			HttpSession s=request.getSession();
					
			//comprobamos si tenemos ya el atributo
			//y si es así lo recogemos
			if(s.getAttribute("usuario_sesion")!=null) {
				
			}
			//incrementamos la variable y la guardamos
			s.setAttribute("usuario_sesion", user );			
			
		}else{
			//obtener requestdispatcher
			 rd=request.getRequestDispatcher("Error");			
		}
		//trasnferir petición
		rd.forward(request, response);
	}

}
