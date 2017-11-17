package br.inatel.dm110.client.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	
	@WebServlet("/hello")
	public class ClientServlet extends HttpServlet {

		private static final long serialVersionUID = -24118939727042992L;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException,IOException {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<h1>Hello, Client!!!</h1>");
		}

	}

