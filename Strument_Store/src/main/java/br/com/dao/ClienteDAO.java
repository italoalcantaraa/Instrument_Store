package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.model.Cliente;
import br.com.utils.ConnectionBd;

public class ClienteDAO {
	Connection conexao;	
	
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
		
	public boolean atualizar(Cliente ClienteAtualizar) throws ClassNotFoundException{
		boolean retorno = false;

		try(Connection connection = ConnectionBd.getConnection()) {
			

			String sql = "UPDATE cliente SET ds_nome=?, ds_email=?, ds_telefone=?,ds_senha=?,ds_cidade=? WHERE ds_cpf= ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, ClienteAtualizar.getDs_nome());
			ps.setString(2, ClienteAtualizar.getDs_email());
			ps.setString(3, ClienteAtualizar.getDs_telefone());
			ps.setString(4, ClienteAtualizar.getDs_senha());
			ps.setString(3, ClienteAtualizar.getDs_cidade());

			int linhasAfetadas = ps.executeUpdate();
			if(linhasAfetadas >0) {retorno = true;}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally{
			if (conexao != null) {
				try {
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} 
		return retorno;
	}
	
	public boolean excluir(String cpf) throws ClassNotFoundException{

		  boolean retorno = false;
		  try (Connection connection = ConnectionBd.getConnection()){
		   
			 
		       String sql = "DELETE FROM cliente WHERE ds_cpf = ?";
		  
		       PreparedStatement ps = conexao.prepareStatement(sql);
		       ps.setString(1, cpf);

		       int linhasAfetadas = ps.executeUpdate();
		   
		       if(linhasAfetadas >0) {retorno = true;}
		  
		  } catch (SQLException e) {
		       e.printStackTrace();
		  } finally{
		     if (conexao != null) {
		        try {
		             conexao.close();
		       } catch (SQLException e) {e.printStackTrace();}
		  }
		 }  
		 
		 return retorno;
		}	
	
	public Cliente buscarPorCpf(String cpf) throws ClassNotFoundException{

		Cliente objRetorno = null;
		String sql = "SELECT * FROM cliente WHERE ds_cpf = ?";

		try (
			Connection connection = ConnectionBd.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql)){
			
			preparedStatement.setString(1, cpf);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				String telefone = rs.getString("telefone");
				String senha = rs.getString("senha");
				String cidade =rs.getString("cidade");
		
				
				objRetorno = new Cliente();
				objRetorno.setDs_cpf(cpf);
				objRetorno.setDs_nome(nome);
				objRetorno.setDs_email(email);
				objRetorno.setDs_telefone(telefone);
				objRetorno.setDs_senha(senha);
				objRetorno.setDs_cidade(cidade);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return objRetorno;
	}
	
	//
}
