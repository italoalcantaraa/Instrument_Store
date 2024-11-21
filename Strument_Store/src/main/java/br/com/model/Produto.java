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
	private int fk_marca;
	private int fk_categoria;
	private int fk_fornecedor;
	// Falta adicionar a imagem
		
	
	public Produto() {
	}
	
	public Produto(int cod_produto, String ds_nome, double vl_preco, int qtd_estoque, String ds_descricao, String ds_img,
			int fk_marca, int fk_categoria, int fk_fornecedor) {
		this.cod_produto = cod_produto;
		this.ds_nome = ds_nome;
		this.vl_preco = vl_preco;
		this.qtd_estoque = qtd_estoque;
		this.ds_descricao = ds_descricao;
		this.ds_img = ds_img;
		this.fk_marca = 3;
		this.fk_categoria = 3;
		this.fk_fornecedor = 6;
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
	public int getFk_marca() {
		return fk_marca;
	}
	public void setFk_marca(int fk_marca) {
		this.fk_marca = fk_marca;
	}
	public int getFk_categoria() {
		return fk_categoria;
	}
	public void setFk_categoria(int fk_categoria) {
		this.fk_categoria = fk_categoria;
	}
	public int getFk_fornecedor() {
		return fk_fornecedor;
	}
	public void setFk_fornecedor(int fk_fornecedor) {
		this.fk_fornecedor = fk_fornecedor;
	}
	
	
	
}
