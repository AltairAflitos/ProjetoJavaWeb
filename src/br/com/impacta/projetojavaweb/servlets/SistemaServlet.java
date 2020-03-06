package br.com.impacta.projetojavaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.projetojavaweb.models.Usuario;

@WebServlet("/sistema")
public class SistemaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6417783570818626759L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("ISO-8859-1");
		resp.setContentType("text/html");
		
		Usuario usuario = (Usuario) req.getSession().getAttribute("usuario");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Sistema - Home</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Bem Vindo - " + req.getParameter("login") +" </h1>");
		out.println("<h3>Está é a página principal do Sistema</h3>");
		out.println("<h3><a href='login.html'>Logout</a></h3>");
		out.println("</body>");
		out.println("</html>");
	}
	
	

}
