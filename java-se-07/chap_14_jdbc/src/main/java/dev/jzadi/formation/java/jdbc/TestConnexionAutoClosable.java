package dev.jzadi.formation.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexionAutoClosable {

	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String URL = "jdbc:mysql://localhost:3306/db_aston";
	final static String USERNAME = "root";
	final static String PASSWORD = "root";
	
	public static void main(String[] args) {
		
		try {
			Class.forName(DRIVER);
			System.out.println("DRIVER OK");
			
			//Try With Resources à utiliser sur les classes implementant l'interface AutoClosable
			try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
				System.out.println("CONNEXION OK");
			}catch (SQLException e) {
				System.out.println("CONNEXION NOK");
			}			
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER NOK");
		}		
	}
}
