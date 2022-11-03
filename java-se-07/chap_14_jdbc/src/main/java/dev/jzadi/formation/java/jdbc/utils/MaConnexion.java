package dev.jzadi.formation.java.jdbc.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Classe MaConnexion, créée le 22/04/2021 à 20:16
 *
 * @author Joachim Zadi
 * @version 1.0 du 22/04/2021
 */
public class MaConnexion {
    
	private static MaConnexion instance;
    private final Connection connection;

    private MaConnexion() throws ClassNotFoundException, SQLException {
        SimpleDataSource.init("mysqlParam");
        connection = SimpleDataSource.getConnection();
    }

    public static MaConnexion getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            instance = new MaConnexion();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}