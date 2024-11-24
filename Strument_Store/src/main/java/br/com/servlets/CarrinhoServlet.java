package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import br.com.dao.CarrinhoDAO;

@WebServlet(name = "carrinho", urlPatterns = {"/carrinho","/Strument_Store/carrinho/inserir", "/carrinho/novo"} )
public class CarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static CarrinhoDAO carrinhoDAO = null;
       
    public CarrinhoServlet() {
        super();
        carrinhoDAO = new CarrinhoDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		try {
			switch (action) {
			case "/Strument_Store/carrinho/inserir":
				inserir(request, response);
				break;
			case "/carrinho/remover":
				// método de criar um novo carrinho
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + action);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void inserir(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
		int idProduto = Integer.parseInt(request.getParameter("idProduto"));
		String cpf = request.getParameter("cpf");
		
		int numeroCarrinho = carrinhoDAO.salvar(idProduto, 1, cpf);
		
		System.out.println("Deu certo!");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
