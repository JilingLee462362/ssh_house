package com.ssh.house.appcomm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @ClassName: IPFilter
 * @Description: TODO
 * @version zhu
 * 
 * 
 */
public class IPFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		@SuppressWarnings("unused")
		HttpServletResponse response = (HttpServletResponse) arg1;
		@SuppressWarnings("unused")
		String uri = request.getRequestURI();

		String ip = request.getRemoteAddr();
		System.out.println("--------------------------");
		System.out.println("IP:" + ip);
		System.out.println("--------------------------");
		filterChain.doFilter(arg0, arg1);

	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
