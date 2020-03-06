package br.com.impacta.projetojavaweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HellowebServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2462632247222854274L;

	public HellowebServlet() {
		super();
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<h2>Hello Servlet mapeado via annotation </h2>");
		
	}

	
}
