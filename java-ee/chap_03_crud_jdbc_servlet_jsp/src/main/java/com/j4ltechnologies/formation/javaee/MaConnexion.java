package com.j4ltechnologies.formation.javaee;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Classe Singleton permettant de fournir une instance unique d'elle-meme
 * 
 * @author Joachim
 *
 */
public class MaConnexion {

	private static MaConnexion instance;
	private Connection connection;

	private MaConnexion() throws ClassNotFoundException, SQLException {
		AppDataSource.init("dbParams");
		connection = AppDataSource.getConnection();
	}

	public Connection getConnection() {
		return connection;
	}

	public static MaConnexion getInstance() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new MaConnexion();
		}
		return instance;
	}
}