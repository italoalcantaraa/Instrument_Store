package br.com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.dao.ClienteDAO;
import br.com.model.Cliente;
import br.com.utils.ConnectionBd;

@WebServlet(name = "cliente", urlPatterns = { "/cliente", "/cliente/excluir", "/cliente/editar", "/cliente/inserir", 
		"/cliente/exibir", "/cliente/login"})
public class AtualizarCliente extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static ClienteDAO clienteDAO = null;

    public AtualizarCliente() {
        super();
        clienteDAO = new ClienteDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String method = request.getServletPath();
        try {
            switch (method) {
            case "/cliente/login":
            	login(request, response);
            	break;
            case "/cliente/excluir":
                    excluir(request, response);
                    break;
                case "/cliente/inserir":
                	inserir(request, response);
                	break;
                case "/cliente/editar":
                    editar(request, response);
                    break;
                case "/cliente/update":
                    update(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    
    public void login(HttpServletRequest request, HttpServletResponse response) {
    	String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		System.out.print("email:" + email);
	    System.out.print("senha" + senha);
		try {
			Connection connection = ConnectionBd.getConnection();
			
			if (clienteDAO.loginUser(email, senha)) {
                request.getSession().setAttribute("usuarioLogado", email);
                response.sendRedirect("../views/home/Home.jsp"); 
            } else {
                request.setAttribute("erro", "Usuário ou senha inválidos.");
                request.getRequestDispatcher("../views/user/login/LoginUser.jsp").forward(request, response);
            }
			
		}catch (Exception e) {
			e.printStackTrace();
		}
    }
    
	protected void inserir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.print("oiiiiiiiiiiiiiiiiiiiiiiiiiii");
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
    

    private void editar(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException {
        String cpf = request.getParameter("cpf");

        try {
            // chama a DAO e trata a exceção ClassNotFoundException
            Cliente clienteAlterar = clienteDAO.buscarPorCpf(cpf);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/cliente/cliente-perfil.jsp");
            
            request.setAttribute("cliente", clienteAlterar);
            dispatcher.forward(request, response);
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();  // logue ou trate de forma apropriada ???
            throw new ServletException("Erro ao carregar o driver JDBC.", e); // Trata a exceção
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException  {
        String cpf = request.getParameter("cpf");
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String senha = request.getParameter("senha");
        String confirmaSenha = request.getParameter("confirmaSenha");
        String cidade = request.getParameter("cidade");
        
        if (senha == null || confirmaSenha == null || !senha.equals(confirmaSenha)) {
            // Senhas não coincidem, redireciona de volta para o formulário de edição com um erro
            request.setAttribute("erro", "As senhas não coincidem. Tente novamente.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/cliente/cliente-perfil.jsp");
            dispatcher.forward(request, response); // lançar um ServletException
            return; 
        }
        
        Cliente clienteAtualizar = new Cliente();
        clienteAtualizar.setDs_cpf(cpf);
        clienteAtualizar.setDs_nome(nome);
        clienteAtualizar.setDs_email(email);
        clienteAtualizar.setDs_telefone(telefone);
        clienteAtualizar.setDs_senha(confirmaSenha);
        clienteAtualizar.setDs_cidade(cidade);

        try {
            clienteDAO.atualizar(clienteAtualizar);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IOException("Erro ao atualizar cliente.", e);
        }
        response.sendRedirect("../views/home/Home.jsp");
    }

    private void excluir(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String cpf = request.getParameter("cpf");

        try {
            clienteDAO.excluir(cpf);
            response.sendRedirect("../views/home/Home.jsp"); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IOException("Erro ao excluir cliente.", e);
        }
    }
    
    private void MostarUsuario(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{
    	String cpf = request.getParameter("cpf");
    	
    	try{
    		Cliente vaidarcerto = clienteDAO.buscarPorCpf(cpf);
    		request.setAttribute("usuario", vaidarcerto);
    		response.sendRedirect("../views/user/profile/profile.jsp");
    	}
    	catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IOException("Erro ao excluir cliente.", e);
        }
    }
}
