package net.codingme.spring.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.codingme.spring.aop.Order;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月19日上午10:29:00
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		Order order = (Order) context.getBean("order");
		order.say();
		resp.getWriter().print("Hello servlet" );
	}

}
