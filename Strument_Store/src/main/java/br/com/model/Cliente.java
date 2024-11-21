package br.com.model;

public class Cliente {
	
	private String ds_cpf;
	private String ds_nome;
	private String ds_email;
	private String ds_telefone;
	private String ds_senha;
	private String ds_cidade;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String ds_cpf, String ds_nome, String ds_email, String ds_telefone, String ds_senha, String ds_cidade) {
		
		this.ds_cpf = ds_cpf;
		this.ds_nome = ds_nome;
		this.ds_email = ds_email;
		this.ds_telefone = ds_telefone;
		this.ds_senha = ds_senha;
		this.ds_cidade = ds_cidade;	
	}

	public String getDs_cpf() {
		return ds_cpf;
	}

	public void setDs_cpf(String ds_cpf) {
		this.ds_cpf = ds_cpf;
	}

	public String getDs_nome() {
		return ds_nome;
	}

	public void setDs_nome(String ds_nome) {
		this.ds_nome = ds_nome;
	}

	public String getDs_email() {
		return ds_email;
	}

	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}

	public String getDs_telefone() {
		return ds_telefone;
	}

	public void setDs_telefone(String ds_telefone) {
		this.ds_telefone = ds_telefone;
	}

	public String getDs_senha() {
		return ds_senha;
	}

	public void setDs_senha(String ds_senha) {
		this.ds_senha = ds_senha;
	}

	public String getDs_cidade() {
		return ds_cidade;
	}

	public void setDs_cidade(String ds_cidade) {
		this.ds_cidade = ds_cidade;
	}
	
}
