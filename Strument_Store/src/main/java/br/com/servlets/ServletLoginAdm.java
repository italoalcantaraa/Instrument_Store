package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletLoginAdm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLoginAdm() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String nome = request.getParameter("nome");
			String senha = request.getParameter("senha");
			
			if(nome.equals("italo") &&  senha.equals("1234")) {
				response.sendRedirect("../Strument_Store/views/adm/home/Home.jsp");
				}	
			else {
					request.setAttribute("erro", "*Login ou senha inválidos*");
					request.getRequestDispatcher("./views/adm/login/LoginAdm.jsp").forward(request, response);
				}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
