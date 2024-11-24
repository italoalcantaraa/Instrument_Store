package br.com.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;

import br.com.model.Carrinho;
import br.com.utils.ConnectionBd;

public class CarrinhoDAO {
	public int salvar(String[] vetorIdProdutos, String[] vetorQtdProdutos, String[] vetorValoresUnitarios, String cpf) throws ClassNotFoundException, SQLException {
		int retornoIdCarrinho = 0;
		
		String sql = "INSERT INTO insert into carrinho(fk_cpf_cliente) values (?, ?);";
		
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
					for(int i = 0; i < vetorIdProdutos.length; i++) {
						comandoItem.setString(1, vetorIdProdutos[i]);
						comandoItem.setInt(2, idCarrinho);
						comandoItem.setInt(3, Integer.parseInt(vetorQtdProdutos[i]));
						comandoItem.executeUpdate();
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retornoIdCarrinho;
	}
}
