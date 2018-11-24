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

import org.apache.struts2.ServletActionContext;

/**
 * 
 * @ClassName: MWebFilter
 * @Description: 后台管理页面路径过滤
 * @version zhu
 *
 * 
 */
public class MWebFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		String uri = request.getRequestURI();

		if ((!uri.contains("/css/")) && (!uri.contains("/js/"))
				&& (!uri.contains("/images/"))) {
			if (ServletActionContext.getRequest().getSession()
					.getAttribute("name") == null) {
				// System.out.println(ServletActionContext.get.getRealPath("/"));
				// System.out.println(ServletActionContext.getRequest().getSession().getAttribute("name"));
				response.sendRedirect("/953OA/index.jsp");

				return;
			} else {
				filterChain.doFilter(request, response);
			}
		} else {

			filterChain.doFilter(request, response);
		}

	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
