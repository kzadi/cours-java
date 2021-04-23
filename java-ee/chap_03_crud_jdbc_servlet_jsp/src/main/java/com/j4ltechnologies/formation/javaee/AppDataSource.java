package com.j4ltechnologies.formation.javaee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Classe utilitaire permettant de charger les parametres de la BDD
 * 
 * @author POEC-ASTON
 *
 */
public class AppDataSource {

	private static String driver;
	private static String url;
	private static String username;
	private static String password;

	/**
	 * Permettant d'initiliser les varibles de classes
	 * 
	 * @param nomFichier
	 * @throws ClassNotFoundException
	 */
	public static void init(String nomFichier) throws ClassNotFoundException {

		// Chargement du fichier de proprietes
		ResourceBundle props = ResourceBundle.getBundle(nomFichier);

		// Recuperation de la valeur de la clé "db.mysql.driver"
		driver = props.getString("db.mysql.driver");

		// On charge les drivers de la BDD
		Class.forName(driver);

		// On recupere les parametres de connexions
		url = props.getString("db.mysql.url");
		username = props.getString("db.mysql.username");
		password = props.getString("db.mysql.password");
	}

	/**
	 * Permlet d'obtenir une connexion a une BDD
	 * 
	 * @return La connection à la BDD
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
}
