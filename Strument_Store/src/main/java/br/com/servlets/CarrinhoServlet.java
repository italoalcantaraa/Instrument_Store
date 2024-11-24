package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.dao.CarrinhoDAO;

@WebServlet(name = "carrinho", urlPatterns = {"/carrinho","/carrinho/inserir", "/carrinho/novo"} )
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
			case "/carrinho/inserir":
				// método de inserir produto no carrinho
				break;
			case "/carrinho/novo":
				// método de criar um novo carrinho
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + action);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
