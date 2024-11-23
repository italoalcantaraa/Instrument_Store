package br.com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBd {
	
	public static Connection getConnection() throws ClassNotFoundException {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/InstrumentStore";
			
			con = DriverManager.getConnection(url, "root", "luis");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
