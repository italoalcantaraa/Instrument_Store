package br.com.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private int cod_carrinho;
	private double total;
	private int fk_cliente;
	private List<ItemCarrinho> itens;
	
	
	public Carrinho() {
		itens = new ArrayList<ItemCarrinho>();
	}
	
	public Carrinho(double total, int fk_cliente, List<ItemCarrinho> itens) {
		this.total = total;
		this.fk_cliente = fk_cliente;
		this.itens = itens;
	}
	
	
	public int getCod_carrinho() {
		return cod_carrinho;
	}
	public void setCod_carrinho(int cod_carrinho) {
		this.cod_carrinho = cod_carrinho;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}
	public void setFk_cliente(int fk_cliente) {
		this.fk_cliente = fk_cliente;
	}
}
