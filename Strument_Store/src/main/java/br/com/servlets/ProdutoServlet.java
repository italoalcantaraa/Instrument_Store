package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

import br.com.dao.ProdutoDAO;
import br.com.model.Produto;


@WebServlet (name="produto", urlPatterns = {"/produto", "/produto/inserir", "/produto/alterar" ,"/produto/listar",
"/produto/remover"})
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ProdutoDAO produtoDAO = null;

	public ProdutoServlet() {
		super();
		ProdutoDAO produtoDAO = new ProdutoDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			String method = request.getServletPath();

			switch(method) {
			case "/produto/inserir": 
				inserir(request, response);
				break;
			case "/produto/alterar":
				// método para alterar
				break;
			case "/produto/listar":
				// método para listar
				break;
			case "produto/remover":
				// método para remover
				break;
			default:
				// método de listar como padrão
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void inserir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		int numErros = 0;
		
		Produto produto = new Produto();
		String nome = request.getParameter("nome");
		String strQuantidade = request.getParameter("quantidade");
		String marca = request.getParameter("marca");
		String strPreco = request.getParameter("preco");
		String descricao = request.getParameter("descricao");
		String categoria = request.getParameter("instrumento");
		int quantidade = 0;
		double preco = 0;
		
		try {

			if (nome == null || nome.trim().isEmpty()) {
				throw new Exception("O nome do produto é obrigatório.");
			}
			if (marca == null || marca.trim().isEmpty()) {
				throw new Exception("A marca do produto é obrigatória.");
			}
			if (strPreco == null || strPreco.trim().isEmpty()) {
				throw new Exception("O preço do produto é obrigatório.");
			}
			if (strQuantidade == null || strQuantidade.trim().isEmpty()) {
				throw new Exception("A quantidade é obrigatória.");
			}
			if (descricao == null || descricao.trim().isEmpty()) {
				throw new Exception("A descrição do produto é obrigatória.");
			}
			if (categoria == null || categoria.trim().isEmpty()) {
				throw new Exception("A categoria do produto é obrigatória.");
			}

			quantidade = Integer.parseInt(strQuantidade);
			preco = Double.parseDouble(strPreco);
		} catch(Exception e) {
			request.setAttribute("erro", e.getMessage());
			numErros++;
			request.getRequestDispatcher("/views/adm/cadastro_produto/cadastroProd.jsp").forward(request, response);
		}
		
		if (numErros == 0) {
			request.setAttribute("sucesso", "Produto cadastrado com sucesso!");
			produto.setDs_nome(nome);
			produto.setQtd_estoque(quantidade);
			produto.setVl_preco(preco);
			produto.setDs_descricao(descricao);
			produto.setFk_marca(1);
			produto.setFk_fornecedor(1);
			produto.setFk_categoria(1);
		}
			

		try {
			produtoDAO.inserir(produto);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();;
		}	
		
		request.getRequestDispatcher("/views/adm/cadastro_produto/cadastroProd.jsp").forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
