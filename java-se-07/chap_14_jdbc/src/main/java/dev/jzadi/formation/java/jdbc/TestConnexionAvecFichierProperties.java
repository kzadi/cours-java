package dev.jzadi.formation.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestConnexionAvecFichierProperties {

	static String driver;
	static String url;
	static String username;
	static String password;
	
	public static void main(String[] args) {
		
		ResourceBundle props = ResourceBundle.getBundle("mysqlParam");
		
		driver = props.getString("mysql.driver");
		url = props.getString("mysql.url");
		username = props.getString("mysql.username");
		password = props.getString("mysql.password");		
		
		try {
			Class.forName(driver);
			System.out.println("DRIVERS OK");			
			
			try(Connection connection = DriverManager.getConnection(url, username, password)){
				System.out.println("CONNEXION OK");
			} catch (SQLException e) {
				System.out.println("CONNEXION NOK");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVERS NOK");
		}
	}
}
