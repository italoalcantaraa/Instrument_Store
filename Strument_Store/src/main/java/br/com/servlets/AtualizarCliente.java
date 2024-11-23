package br.com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

import br.com.dao.ClienteDAO;
import br.com.model.Cliente;

@WebServlet(name = "cliente", urlPatterns = { "/cliente", "/cliente/excluir", "/cliente/editar" })
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
                case "/cliente/excluir":
                    excluir(request, response);
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IOException("Erro ao excluir cliente.", e);
        }
    }
}
