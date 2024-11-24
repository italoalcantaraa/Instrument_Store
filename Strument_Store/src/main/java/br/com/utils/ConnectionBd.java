package br.com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBd {
	
	public static Connection getConnection() throws ClassNotFoundException {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// luis String url = "jdbc:mysql://localhost/InstrumentStore";
			// luis con = DriverManager.getConnection(url, "root", "luis");

			String url = "jdbc:mysql://localhost/instrumentStore";
			con = DriverManager.getConnection(url,"root","ita75802309");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
