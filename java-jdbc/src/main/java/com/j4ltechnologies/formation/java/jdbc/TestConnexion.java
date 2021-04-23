package com.j4ltechnologies.formation.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexion {

	public static void main(String[] args) {

		Connection connection = null;

		try {
			// 1-> On charge les DRIVERS du moteur de BDD
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DRIVER OK");

			// 2 -> Informations de connexions
			final String URL = "jdbc:mysql://localhost:3306/db_aston";
			final String USERNAME = "root";
			final String PASSWORD = "";

			// 3 -> On essaie d'etablir la connexion à la BDD avec les parametres de
			// connexion
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("CONNEXION OK");

		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER NOK");
		} catch (SQLException e) {
			System.out.println("CONNEXION NOK");
		} finally {
			// 4 -> Je ferme la connexion
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
