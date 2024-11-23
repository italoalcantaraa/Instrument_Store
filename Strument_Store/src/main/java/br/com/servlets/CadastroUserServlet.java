package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.dao.ClienteDAO;
import br.com.model.Cliente;

@WebServlet(name="cliente", urlPatterns = {"/cliente", "/cliente/inserir"})

public class CadastroUserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private static ClienteDAO clienteDAO= null;
	
    public CadastroUserServlet() {
    	super();
        ClienteDAO clienteDAO = new ClienteDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String method = request.getServletPath();

			switch(method) {
			case "/cliente/inserir": 
				inserir(request, response);
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void inserir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String cpf = request.getParameter("cpf");
			String telefone = request.getParameter("telefone");
			String senha = request.getParameter("senha");
			String confirmaSenha = request.getParameter("confirmaSenha");
			String cidade = request.getParameter("cidade");
						
			
			if(nome == null || nome == "") {
				System.out.print("Validação N");
				request.setAttribute("erroNome", "*Informe o nome*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			}else if(email == null || email == "") {
				System.out.print("Validação E");
				request.setAttribute("erroEmail", "*Informe o e-mail*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(cpf == null || cpf == "") {
				System.out.print("Validação CP");
				request.setAttribute("erroCpfNull", "*Informe o CPF*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(cpf.length() != 14) {
				System.out.print("Validação CPF");
				request.setAttribute("erroCpfNullInvalido", "*CPF inválido*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(telefone.length() != 11) {
				System.out.print("Validação TEL");
				request.setAttribute("erroTelefoneInvalido", "*Telefone inválido*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(telefone == null || telefone == "") {
				System.out.print("Validação TEL");
				request.setAttribute("erroTelefoneNull", "*Informe o telefone*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(senha == null || senha == "") {
				System.out.print("Validação S");
				request.setAttribute("erroSenhaNull", "*Informe a senha*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(confirmaSenha == "") {
				System.out.print("Validação S");
				request.setAttribute("erroSenhaConfereNull", "*Informe a senha*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(!confirmaSenha.equals(senha)) {
				System.out.print("Validação CI");
				request.setAttribute("erroSenhaConfereInvalida", "*Senhas não conferem*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			} else if(cidade == null || cidade  == "") {
				System.out.print("Validação CI");
				request.setAttribute("erroCidadeNull", "*Informe a cidade*");
				request.getRequestDispatcher("../views/user/cadastro/CadastroUser.jsp").forward(request, response);
			}else {
				Cliente cliente = new Cliente(cpf, nome, email, telefone, senha, cidade);
				System.out.print("OLA");
				System.out.print(cpf);
				clienteDAO.inserir(cliente);
				
				
				nome = null;
				email = null;
				cpf = null;
				telefone = null;
				senha = null;
				confirmaSenha = null;
				cidade = null;
				
				
				response.sendRedirect("../views/home/Home.jsp");
				
				System.out.println("CAIU NO ELS");
			}
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}