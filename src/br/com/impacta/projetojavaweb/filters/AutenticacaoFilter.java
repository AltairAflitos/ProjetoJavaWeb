package br.com.impacta.projetojavaweb.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.projetojavaweb.models.Usuario;

/**
 * Servlet Filter implementation class AltenticacaoFilter
 */
@WebFilter("/AltenticacaoFilter")
public class AutenticacaoFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AutenticacaoFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest=(HttpServletRequest) request;
		Usuario usuario = (Usuario) httpRequest.getAttribute("usuario");
		if(usuario !=null){
			chain.doFilter(request, response);
			
			
		}else{
			
			
			
			((HttpServletResponse)response).sendRedirect("/ProjetoJavaWeb/Login.html");
		}
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
