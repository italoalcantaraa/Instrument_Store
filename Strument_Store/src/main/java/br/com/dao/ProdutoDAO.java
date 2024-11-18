package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.model.Produto;
import br.com.utils.ConnectionBd;

public class ProdutoDAO {
	
	private static Connection con;	
	
	public static boolean inserir(Produto produto) throws ClassNotFoundException {
		
	String sql = "insert into produto(ds_nome, vl_preco, qtd_estoque, ds_descricao, ds_img, fk_marca, fk_categoria, fk_fornecedor) values (?, ?, ?, ?, ?, ?, ?, ?);";
		
	try (
			Connection con = ConnectionBd.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
		) {
		
		pstm.setString(1, produto.getDs_nome());
		pstm.setDouble(2, produto.getVl_preco());
		pstm.setInt(3, produto.getQtd_estoque());
		pstm.setString(4, produto.getDs_descricao());
		pstm.setString(5, produto.getDs_img());
		pstm.setInt(6, produto.getFk_marca());
		pstm.setInt(7, produto.getFk_categoria());
		pstm.setInt(8, produto.getFk_fornecedor());
		
		int linhasAfetadas = pstm.executeUpdate();

		return linhasAfetadas > 0 ? true : false;
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		return false;
	}
	
	
	public static List<Produto> listar() throws ClassNotFoundException, SQLException {
		List<Produto> produtoList = new ArrayList<Produto>();
		String sql = "SELECT * FROM produto;";
		
		try(
				Connection con = ConnectionBd.getConnection();
				PreparedStatement pstm = con.prepareStatement(sql);
			) {
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("cod_produto");
				String nome = rs.getString("ds_nome");
				double preco = rs.getDouble("vl_preco");
				int estoque = rs.getInt("qtd_estoque");
				String descricao = rs.getString("ds_descricao");
				String ds_img = rs.getString("ds_img");
				int fk_marca = rs.getInt("fk_marca");
				int fk_categoria = rs.getInt("fk_categoria");
				int fk_fornecedor = rs.getInt("fk_fornecedor");
								
				produtoList.add(new Produto(id, nome, preco, estoque, descricao, ds_img, fk_marca, fk_categoria, fk_fornecedor));
			};
		
		}catch (Exception e) {
			e.printStackTrace();
		}

		return produtoList;
	}
}
