package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.dao.PedidoDAO;
import br.com.dao.ProdutoDAO;
import br.com.model.ItemPedido;
import br.com.model.Pedido;
import br.com.model.PedidosList;
import br.com.model.Produto;
import br.com.model.ProdutosList;

import java.time.LocalDate;
import java.time.LocalDateTime;


@WebServlet(name = "pedido", urlPatterns = {"/pedido", "/pedido/inserir", "/pedido/salvar"})
public class PedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ProdutoDAO produtoDAO;
	private static PedidoDAO pedidoDAO;
	private static List<Produto> produtosPedidoItem;
	
	public PedidoServlet() {
		super();
		produtoDAO = new ProdutoDAO();
		pedidoDAO = new PedidoDAO();
		produtosPedidoItem = new ArrayList<Produto>();
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
		
		// captura o id do produto a ser inserido;
		int idProduto = Integer.parseInt(request.getParameter("id"));
		
		boolean existe = false; // variável para identificar se o produto já existe na lista
		
		// incremente a qauntidade se o produto já existir
		for(int i = 0; i < PedidosList.produtoPedido.size(); i++) {
			if(idProduto == PedidosList.produtoPedido.get(i).getFk_produto()) {
				PedidosList.produtoPedido.get(i).setQtd_pedido(PedidosList.produtoPedido.get(i).getQtd_pedido() +1);
				existe = true;
			}
		}
		
		// caso o produto não exista, cria um novo item pedido;
		if(!existe) {
			ItemPedido itemPedido =  new ItemPedido();
			itemPedido.setFk_produto(idProduto);
			PedidosList.produtoPedido.add(itemPedido);
		}
		
		
		List<ItemPedido> produtosPedido = PedidosList.produtoPedido;
		
		Produto produtoInserir;
		
		for(int i = 0; i < produtosPedido.size(); i ++) {	
			produtoInserir = produtoDAO.buscarPorId(produtosPedido.get(i).getFk_produto());
			produtosPedidoItem.add(produtoInserir);
		}
		
		
		request.setAttribute("produtos", produtosPedidoItem);
		request.getRequestDispatcher("/views/compra/compra.jsp").forward(request, response);
		
	}
	
	public void salvar(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException {
		String cpf = request.getParameter("cpf");
		String produtos = request.getParameter("produtos");
		String[] produtosIds = produtos.split(",");
		List<Produto> produtoList = new ArrayList<Produto>();
		
		for(String idProduto : produtosIds) {
			Produto produto = produtoDAO.buscarPorId(Integer.parseInt(idProduto));
			produtoList.add(produto);
		}
		
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
		
		request.getRequestDispatcher("/views/pagamento/pagamento.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
