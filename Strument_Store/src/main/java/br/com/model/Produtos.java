package br.com.model;

public class Produtos {
	private String img;
	private String descricao;
	private double preco;
	
	public Produtos(String img, String descricao, double preco) {
		this.img = img;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
