package br.com.model;

public class Pedidos {
	private int cdg;
	private String img;
	private String status;
	private String destinatario;
	private double total;
	
	public Pedidos(int cdg, String img, String status, String destinatario, double total) {
		this.cdg = cdg;
		this.img = img;
		this.status = status;
		this.destinatario = destinatario;
		this.total = total;
	}
	
	public Pedidos() {
		
	}

	public int getCdg() {
		return cdg;
	}
	
	public void setCdg(int cdg) {
		this.cdg = cdg;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Pedidos [img=" + img + ", status=" + status + ", destinatario=" + destinatario + ", total=" + total
				+ "]";
	}
}
