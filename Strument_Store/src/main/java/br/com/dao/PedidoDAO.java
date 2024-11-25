package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

import br.com.model.Pedido;
import br.com.model.Produto;
import br.com.utils.ConnectionBd;

public class PedidoDAO {
	public static int efetuarPedido(Pedido pedido, List<Produto> proList ) throws SQLException, ClassNotFoundException {
		
		String sql = "insert into pedido(vl_preco_total, dt_data_pedido, dt_data_entrega, fk_cpf_cliente) values(?,?,?,?);";

		int idNota = 0;

		try (Connection conn = ConnectionBd.getConnection();
				PreparedStatement comandoPedido = conn.prepareStatement(sql,
						Statement.RETURN_GENERATED_KEYS)) 
		{	
			comandoPedido.setDouble(1, pedido.getTotal());
			comandoPedido.setTimestamp(2, Timestamp.valueOf(pedido.getData()));
			comandoPedido.setTimestamp(3, Timestamp.valueOf(pedido.getDataEntrega()));
			comandoPedido.setString(4, pedido.getFkCliente());

			comandoPedido.executeUpdate();

			ResultSet rs = comandoPedido.getGeneratedKeys();
			if(rs.next()) {
				idNota = rs.getInt(1);

				String sqlItemPedido = "INSERT INTO item_pedido (fk_pedido, fk_produto, qtd_pedido) values(?,?,?);";

				try(PreparedStatement comandoItem = conn.prepareStatement(sqlItemPedido)) {
					for(int i = 0; i < proList.size(); i++) {
						comandoItem.setInt(1, idNota);
						comandoItem.setInt(2, proList.get(i).getCod_produto());
						
						comandoItem.setInt(3, 3);
						comandoItem.executeUpdate();
					}	
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			
			return idNota;
		}

	}
	
	
	public static int verificaQtdProdutos(Produto produto) {
		for() {
			
		}
 	}
}
