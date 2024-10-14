package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CadastroUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastroUserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String cpf = request.getParameter("cpf");
			String telefone = request.getParameter("telefone");
			String senha = request.getParameter("senha");
			String confirmaSenha = request.getParameter("confirmaSenha");
			String cidade = request.getParameter("cidade");
						
			
			if(nome == null || nome == "") {
				request.setAttribute("erroNome", "*Informe o nome*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			}else if(email == null || email == "") {
				request.setAttribute("erroEmail", "*Informe o e-mail*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(cpf == null || cpf == "") {
				request.setAttribute("erroCpfNull", "*Informe o CPF*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(cpf.length() != 14) {
				request.setAttribute("erroCpfNullInvalido", "*CPF inválido*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(telefone.length() != 11) {
				request.setAttribute("erroTelefoneInvalido", "*Telefone inválido*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(telefone == null || telefone == "") {
				request.setAttribute("erroTelefoneNull", "*Informe o telefone*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(senha == null || senha == "") {
				request.setAttribute("erroSenhaNull", "*Informe a senha*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(confirmaSenha == "") {
				request.setAttribute("erroSenhaConfereNull", "*Informe a senha*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(!confirmaSenha.equals(senha)) {
				request.setAttribute("erroSenhaConfereInvalida", "*Senhas não conferem*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(cidade == null || cidade  == "") {
				request.setAttribute("erroCidadeNull", "*Informe a cidade*");
				request.getRequestDispatcher("./views/user/cadastro/CadastroUser.jsp").forward(request, response);
			}else {
				nome = null;
				email = null;
				cpf = null;
				telefone = null;
				senha = null;
				confirmaSenha = null;
				cidade = null;
				response.sendRedirect("./views/home/Home.jsp");
			}
			
			
			
			
		}catch (Exception e) {
		}
	}

}
