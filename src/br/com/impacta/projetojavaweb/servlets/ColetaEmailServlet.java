package br.com.impacta.projetojavaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.projetojavaweb.models.Usuario;

/**
 * Servlet implementation class ColetaEmailServlet
 */
@WebServlet("/coletaEmail")
public class ColetaEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ColetaEmailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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
		out.println("<h1>Bem Vindo - " + usuario.getLogin() + " </h1>");
		out.println("<h1>Seu e-mail é - " + usuario.getEmail() + " </h1>");
		out.println("<h3>Está é a página principal do Sistema</h3>");
		out.println("<form method =\"post\" action=\"adicionaEmailCookie\">");
		out.println("Email: <br/><input type=\"Submit\"value=\"Enviar\"></p>");
		
		out.println("</body>");
		out.println("</html>");
		doGet(req, resp);
	}

}
