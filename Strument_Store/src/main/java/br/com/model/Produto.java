package br.com.model;


/* cod_produto int primary key auto_increment,
    ds_nome varchar(100) not null,
    vl_preco decimal(10,5) not null,
    qtd_estoque int not null,
    ds_descricao varchar(250) not null,
    ds_img varchar(200) not null,
    
    fk_marca int,
    fk_categoria int,
    fk_fornecedor int */

public class Produto {
	private int cod_produto;
	private String ds_nome;
	private double vl_preco;
	private int qtd_estoque;
	private String ds_descricao;
	private String ds_img;
	private String ds_marca;
	private String ds_categoria;
	// Falta adicionar a imagem
		
	
	public Produto() {
	}
	
	public Produto(int cod_produto, String ds_nome, double vl_preco, int qtd_estoque, String ds_descricao, String ds_img,
			String ds_marca, String ds_categoria) {
		this.cod_produto = cod_produto;
		this.ds_nome = ds_nome;
		this.vl_preco = vl_preco;
		this.qtd_estoque = qtd_estoque;
		this.ds_descricao = ds_descricao;
		this.ds_img = ds_img;
		this.ds_marca = ds_marca;
		this.ds_categoria = ds_categoria;
	}
	
	
	public String getDs_img() {
		return ds_img;
	}
	
	public void setDs_img(String ds_img) {
		this.ds_img = ds_img;
	}
	
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public String getDs_nome() {
		return ds_nome;
	}
	public void setDs_nome(String ds_nome) {
		this.ds_nome = ds_nome;
	}
	public double getVl_preco() {
		return vl_preco;
	}
	public void setVl_preco(double vl_preco) {
		this.vl_preco = vl_preco;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public String getDs_descricao() {
		return ds_descricao;
	}
	public void setDs_descricao(String ds_descricao) {
		this.ds_descricao = ds_descricao;
	}

	public String getDs_marca() {
		return ds_marca;
	}

	public void setDs_marca(String ds_marca) {
		this.ds_marca = ds_marca;
	}

	public String getDs_categoria() {
		return ds_categoria;
	}

	public void setDs_categoria(String ds_categoria) {
		this.ds_categoria = ds_categoria;
	}
	
}
