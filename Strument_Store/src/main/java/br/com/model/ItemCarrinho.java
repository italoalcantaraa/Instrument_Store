package br.com.model;

public class ItemCarrinho {
	private int fk_produto;
	private int fk_carrinho;
	private int qtd_carrinho;
	
	public int getFk_produto() {
		return fk_produto;
	}
	public void setFk_produto(int fk_produto) {
		this.fk_produto = fk_produto;
	}
	public int getFk_carrinho() {
		return fk_carrinho;
	}
	public void setFk_carrinho(int fk_carrinho) {
		this.fk_carrinho = fk_carrinho;
	}
	public int getQtd_carrinho() {
		return qtd_carrinho;
	}
	public void setQtd_carrinho(int qtd_carrinho) {
		this.qtd_carrinho = qtd_carrinho;
	}
}
