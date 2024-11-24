package br.com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.Console;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.dao.ProdutoDAO;
import br.com.model.Produto;
import br.com.utils.ConnectionBd;


@WebServlet (name="produto", urlPatterns = {"/produto", "/produto/inserir", "/produto/alterar" ,"/views/home/listar", "/views/adm/listaProdutos",
"/views/adm/remover", "/views/adm/alterar", "/views/adm/editar","/views/home"})
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
			System.out.println("metodo no doGet: " + method);

			switch(method) {
			case "/produto/inserir": 
				inserir(request, response);
				break;
			case "/views/home":
				listarInicial(request, response, method);
				break;
			case "/views/home/listar":
				listar(request, response, method);
				break;
			case "/views/adm/listaProdutos":
				listar(request, response, method);
				break;
			case "/views/adm/remover":
				excluir(request, response);
				break;
			case "/produto/alterar":
				alterar(request, response);
				break;
			case "/views/adm/editar":
				editarForm(request, response);
				break;
			default:
				listar(request, response, method);
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void alterar(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		System.out.print("IDDDDDDDDDDDDDDDDDD: " + id);
		String nome = request.getParameter("nome");
		double preco = Double.parseDouble(request.getParameter("preco"));
		int qtd_estoque = Integer.parseInt(request.getParameter("quantidade"));
		String descricao = request.getParameter("descricao");
		
		Produto produtoAlterar = new Produto();
		produtoAlterar.setCod_produto(id);
		produtoAlterar.setDs_nome(nome);
		produtoAlterar.setVl_preco(preco);
		produtoAlterar.setQtd_estoque(qtd_estoque);
		produtoAlterar.setDs_descricao(descricao);
		
	 	produtoDAO.alterar(produtoAlterar);
		response.sendRedirect("/Strument_Store/views/adm/listaProdutos");

	}
	
	
	public static void editarForm(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		Produto produtoAlterar = produtoDAO.buscarPorId(id);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/adm/cadastro_produto/cadastroProd.jsp");
		request.setAttribute("produto", produtoAlterar);
		dispatcher.forward(request, response);
	}
	
	
	public static void excluir(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
		int idProduto = Integer.parseInt(request.getParameter("id"));
		produtoDAO.excluir(idProduto);
		response.sendRedirect("/Strument_Store/views/adm/listaProdutos");
	}
	
	public static void listar(HttpServletRequest request, HttpServletResponse response, String method) throws ClassNotFoundException, SQLException, ServletException, IOException {
		List<Produto> produtoList = produtoDAO.listar();
		request.setAttribute("produtoList", produtoList);

		RequestDispatcher dispatcher;
		
		System.out.print(method);
		
		if(method.equalsIgnoreCase("/views/adm/listaProdutos")) {
			request.getRequestDispatcher("/views/adm/listaProdutos/listaProdutos.jsp").forward(request, response);
		}
		
		//dispatcher.forward(request, response);
	}
	
	public static void listarInicial(HttpServletRequest request, HttpServletResponse response, String method) throws ClassNotFoundException, SQLException, ServletException, IOException {
		List<Produto> produtoList = produtoDAO.listar();
		request.setAttribute("produtoList", produtoList);

	
		request.getRequestDispatcher("/views/home/Home.jsp").forward(request, response);

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
		String img = request.getParameter("img");

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
			produto.setDs_img(img);
			produto.setDs_marca(marca);
			produto.setDs_categoria(categoria);
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
