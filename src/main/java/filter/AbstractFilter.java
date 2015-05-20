package filter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AbstractFilter {
	
	public AbstractFilter() {
		
	}
	protected void doLogin(ServletRequest req, ServletResponse res, HttpServletRequest httpreq ) throws ServletException, IOException{
		RequestDispatcher rd= httpreq.getRequestDispatcher("/public/login.xhtml");
		rd.forward(req, res);
	}
	protected void accessDenied(ServletRequest req, ServletResponse res, HttpServletRequest httpreq)  throws ServletException, IOException{
		RequestDispatcher rd= httpreq.getRequestDispatcher("/public/acessoNegado.xhtml");
		rd.forward(req, res);
	}

}
