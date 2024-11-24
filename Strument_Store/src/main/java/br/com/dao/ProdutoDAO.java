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




	public static boolean alterar(Produto produto) {

		String sql = "UPDATE produto SET ds_nome = ?, vl_preco = ?, qtd_estoque = ?, ds_descricao = ? where cod_produto = ?;";
		boolean retorno = false;

		try (
				Connection con = ConnectionBd.getConnection();
				PreparedStatement pstm = con.prepareStatement(sql);
				)  {
			
			pstm.setString(1, produto.getDs_nome());
			pstm.setDouble(2, produto.getVl_preco());
			pstm.setInt(3, produto.getQtd_estoque());
			pstm.setString(4, produto.getDs_descricao());
			pstm.setInt(5, produto.getCod_produto());

			int linhasAfetadas = pstm.executeUpdate();

			retorno = linhasAfetadas > 0 ? true : false;

		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		return retorno;
	}


	public static Produto buscarPorId(int id) throws ClassNotFoundException, SQLException {

		Produto objRetorno = null;
		String sql = "SELECT * FROM produto WHERE cod_produto = ?;";

		try(
				Connection con = ConnectionBd.getConnection();
				PreparedStatement pstm = con.prepareStatement(sql);
				) {

			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();

			while(rs.next()) {
				int idProduto = rs.getInt("cod_produto");
				String nome = rs.getString("ds_nome");
				double preco =  rs.getDouble("vl_preco");
				int quantidade = rs.getInt("qtd_estoque");
				String descricao = rs.getString("ds_descricao");
				String img = rs.getString("ds_img");
				String marca = rs.getString("ds_marca");
				String categoria = rs.getString("ds_categoria");

				objRetorno = new Produto(idProduto, nome, preco, quantidade, descricao, img, marca, categoria);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return objRetorno;

	}


public static boolean excluir(int idProduto) throws ClassNotFoundException, SQLException {

	String sql = "DELETE produto FROM produto WHERE cod_produto = ?;";
	boolean retorno = false;

	try (
			Connection con = ConnectionBd.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			){

		pstm.setInt(1, idProduto);
		int linhasAfetadas = pstm.executeUpdate();

		retorno = linhasAfetadas > 0 ? true : false;
	}catch (Exception e) {
		e.printStackTrace();
	}

	return retorno;
}


public static boolean inserir(Produto produto) throws ClassNotFoundException {

	String sql = "insert into produto(ds_nome, vl_preco, qtd_estoque, ds_descricao, ds_img, ds_marca, ds_categoria) values (?, ?, ?, ?, ?, ?, ?);";

	try (
			Connection con = ConnectionBd.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			) {

		pstm.setString(1, produto.getDs_nome());
		pstm.setDouble(2, produto.getVl_preco());
		pstm.setInt(3, produto.getQtd_estoque());
		pstm.setString(4, produto.getDs_descricao());
		pstm.setString(5, produto.getDs_img());
		pstm.setString(6, produto.getDs_marca());
		pstm.setString(7, produto.getDs_categoria());

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
			String ds_marca = rs.getString("ds_marca");
			String ds_categoria = rs.getString("ds_categoria");

			produtoList.add(new Produto(id, nome, preco, estoque, descricao, ds_img, ds_marca, ds_categoria));
		};

	}catch (Exception e) {
		e.printStackTrace();
	}

	return produtoList;
}
}
