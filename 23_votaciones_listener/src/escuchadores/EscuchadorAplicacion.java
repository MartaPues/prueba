package escuchadores;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class EscuchadorAplicacion implements ServletContextListener {

    

	
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
    	ServletContext ctx=arg0.getServletContext();
		ctx.setAttribute("si", 0);
		ctx.setAttribute("no", 0);
    }
	
}
