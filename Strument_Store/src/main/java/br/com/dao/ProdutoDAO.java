package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.model.Produto;
import br.com.utils.ConnectionBd;

public class ProdutoDAO {
	
	private static Connection con;	
	
	public static boolean inserir(Produto produto) throws ClassNotFoundException {
		
	String sql = "insert into produto(ds_nome, vl_preco, qtd_estoque, ds_descricao, fk_marca, fk_categoria, fk_fornecedor) values (?, ?, ?, ?, ?, ?, ?);";
		
	try (
			Connection con = ConnectionBd.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
		) {
		
		pstm.setString(1, produto.getDs_nome());
		pstm.setDouble(2, produto.getVl_preco());
		pstm.setInt(3, produto.getQtd_estoque());
		pstm.setString(4, produto.getDs_descricao());
		pstm.setInt(5, produto.getFk_marca());
		pstm.setInt(6, produto.getFk_categoria());
		pstm.setInt(7, produto.getFk_fornecedor());
		
		int linhasAfetadas = pstm.executeUpdate();

		return linhasAfetadas > 0 ? true : false;
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		return false;
	}
}
