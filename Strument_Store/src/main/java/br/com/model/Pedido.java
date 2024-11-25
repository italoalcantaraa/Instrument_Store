package br.com.model;

import java.time.LocalDateTime;

public class Pedido {	
	private double total;
	private LocalDateTime  data;
	private LocalDateTime  dataEntrega;
	private String fkCliente;
	
	
	public Pedido(double total, LocalDateTime   data, LocalDateTime  dataEntrega, String fkCliente) {
		super();
		this.total = total;
		this.data = data;
		this.dataEntrega = dataEntrega;
		this.fkCliente = fkCliente;
	}
	
	public Pedido() {}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public LocalDateTime  getData() {
		return data;
	}
	public void setData(LocalDateTime  data) {
		this.data = data;
	}
	public LocalDateTime  getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDateTime   dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getFkCliente() {
		return fkCliente;
	}
	public void setFkCliente(String fkCliente) {
		this.fkCliente = fkCliente;
	}
	
	
	
}	
