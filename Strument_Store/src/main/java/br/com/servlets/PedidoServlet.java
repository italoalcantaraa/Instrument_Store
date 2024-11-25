package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.com.dao.PedidoDAO;
import br.com.dao.ProdutoDAO;
import br.com.model.ItemPedido;
import br.com.model.Pedido;
import br.com.model.PedidosList;
import br.com.model.Produto;
import java.time.LocalDate;
import java.time.LocalDateTime;


@WebServlet(name = "pedido", urlPatterns = {"/pedido", "/pedido/inserir", "/pedido/salvar"})
public class PedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ProdutoDAO produtoDAO;
	private static PedidoDAO pedidoDAO;
	
	public PedidoServlet() {
		super();
		produtoDAO = new ProdutoDAO();
		pedidoDAO = new PedidoDAO();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/pedido/inserir":
				inserir(request, response);
				break;
			case "/pedido/salvar":
				salvar(request, response);
				break;
			default:
				break;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	// inserir produto no pedido
	public void inserir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		int idProduto = Integer.parseInt(request.getParameter("id"));
		System.out.print("idprodutp: " + idProduto);
		
		Produto produtoPedido = produtoDAO.buscarPorId(idProduto);
		
		
		PedidosList.produtoPedido.add(produtoPedido);
		
		List<Produto> produtosPedido = PedidosList.produtoPedido;
		
		request.setAttribute("produtosPedido", produtosPedido);
		request.getRequestDispatcher("/views/compra/compra.jsp").forward(request, response);
		
	}
	
	public void salvar(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
		
		
		List<Produto> produtoList = PedidosList.produtoPedido;
		
		String cpf = request.getParameter("cpf");
		
		System.out.println("cpf: " + cpf);
		double soma = 0;
		
		
		// Realiza o valor total do pedido
		for(int i = 0; i < produtoList.size(); i ++)
			soma += produtoList.get(i).getVl_preco();
		
		System.out.println("Soma: " + soma);
		
		// gerar a data
		LocalDateTime data = LocalDateTime.now();
		
		System.out.println("Data: " + data);
		
		// data entrega
		LocalDateTime dataEntrega = data.plusDays(5);
		
		
		System.out.println("data2: " + dataEntrega);
		
		
		Pedido pedido = new Pedido(soma, data, dataEntrega, cpf);
		
		System.out.println("cpf: " + pedido.getFkCliente());
		
		pedidoDAO.efetuarPedido(pedido, produtoList);
		
			
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
