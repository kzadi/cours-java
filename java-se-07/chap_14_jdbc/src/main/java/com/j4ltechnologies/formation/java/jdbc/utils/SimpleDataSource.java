package com.j4ltechnologies.formation.java.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SimpleDataSource {

	static String driver;
	static String url;
	static String username;
	static String password;

	public static void init(String fichier) throws ClassNotFoundException {
		ResourceBundle props = ResourceBundle.getBundle(fichier);

		driver = props.getString("mysql.driver");
		Class.forName(driver);

		url = props.getString("mysql.url");
		username = props.getString("mysql.username");
		password = props.getString("mysql.password");
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
}
