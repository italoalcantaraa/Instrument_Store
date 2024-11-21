package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import br.com.model.Cliente;
import br.com.model.Produto;
import br.com.utils.ConnectionBd;

public class ClienteDAO {
	private static Connection con;	
	
	public static boolean inserir(Cliente cliente) throws ClassNotFoundException {
		
		String sql = "insert into cliente(ds_cpf, ds_nome, ds_email, ds_telefone, ds_senha, ds_cidade) values (?, ?, ?, ?, ?, ?);";
			
		try (
				Connection connection = ConnectionBd.getConnection();
				PreparedStatement pstm = connection.prepareStatement(sql);
			)
		{
			
				pstm.setString(1, cliente.getDs_cpf());
				pstm.setString(2, cliente.getDs_nome());
				pstm.setString(3, cliente.getDs_email());
				pstm.setString(4, cliente.getDs_telefone());
				pstm.setString(5, cliente.getDs_senha());
				pstm.setString(6, cliente.getDs_cidade());
			
				int linhasAfetadas = pstm.executeUpdate();

				return linhasAfetadas > 0 ? true : false;
			} catch (Exception e) {
				e.printStackTrace();
			}
				return false;
		}
}
