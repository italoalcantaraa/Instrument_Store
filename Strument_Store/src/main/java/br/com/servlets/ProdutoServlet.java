package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdutoServlet() {
        super();
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numErros = 0;
	    try {
	        String nome = request.getParameter("nome");
	        String strQuantidade = request.getParameter("quantidade");
	        String marca = request.getParameter("marca");
	        String strPreco = request.getParameter("preco");
	        String descricao = request.getParameter("descricao");
	        String instrumento = request.getParameter("instrumento");

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
	        if (instrumento == null || instrumento.trim().isEmpty()) {
	            throw new Exception("A categoria do produto é obrigatória.");
	        }

	        int quantidade = Integer.parseInt(strQuantidade);
	        double preco = Double.parseDouble(strPreco);
	        
	    } catch (Exception e) {
	        request.setAttribute("erro", e.getMessage());
	        numErros++;
	    }
	    
	    if (numErros == 0) {
	        request.setAttribute("sucesso", "Produto cadastrado com sucesso!");
	    }

	    request.getRequestDispatcher("./views/adm/cadastro_produto/cadastroProd.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
