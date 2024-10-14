package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletLoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLoginUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			
			if(email.equals("user@gmail.com") && senha.equals("123"))
				response.sendRedirect("../Strument_Store/views/home/Home.jsp");
			else {
				request.setAttribute("erro", "*Login ou senha inválidos*");
				request.getRequestDispatcher("./views/user/login/LoginUser.jsp").forward(request, response);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
