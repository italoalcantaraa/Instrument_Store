package br.com.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.model.Carrinho;
import br.com.utils.ConnectionBd;

public class CarrinhoDAO {
	public int salvar(int idProduto, int qtdProduto, String cpf) throws ClassNotFoundException, SQLException {
		int retornoIdCarrinho = 0;
		
		String sql = "INSERT INTO insert into carrinho(fk_cpf_cliente) values (?);";
		
		try(Connection con = ConnectionBd.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) 
		{
			pstm.setString(1, cpf);
			pstm.execute();
			
			
			ResultSet rs = pstm.getGeneratedKeys();
			
			if(rs.next()) {
				
				int idCarrinho = rs.getInt(1);
				retornoIdCarrinho = idCarrinho;
			
			
				String sqlItemCarrinho = "insert into item_carrinho(fk_produto, fk_carrinho, qtd_carrinho) values (?, ?, ?);";
				try(PreparedStatement comandoItem = con.prepareStatement(sqlItemCarrinho)) {
					
						comandoItem.setInt(1, idProduto);
						comandoItem.setInt(2, idCarrinho);
						comandoItem.setInt(3, 1);
						comandoItem.executeUpdate();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retornoIdCarrinho;
	}
}
