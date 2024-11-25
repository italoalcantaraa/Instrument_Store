package br.com.model;

public class ItemPedido {
	private int fk_pedido;
	private int fk_produto;
	private int qtd_pedido;
	
	public ItemPedido(int fk_pedido, int fk_produto, int qtd_pedido) {
		super();
		this.fk_pedido = fk_pedido;
		this.fk_produto = fk_produto;
		this.qtd_pedido = qtd_pedido;
	}
	
	public ItemPedido() {}
	
	public int getFk_pedido() {
		return fk_pedido;
	}
	public void setFk_pedido(int fk_pedido) {
		this.fk_pedido = fk_pedido;
	}
	public int getFk_produto() {
		return fk_produto;
	}
	public void setFk_produto(int fk_produto) {
		this.fk_produto = fk_produto;
	}
	public int getQtd_pedido() {
		return qtd_pedido;
	}
	public void setQtd_pedido(int qtd_pedido) {
		this.qtd_pedido = qtd_pedido;
	}
	
	
}