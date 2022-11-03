package dev.jzadi.formation.java.jdbc.statements;

import dev.jzadi.formation.java.jdbc.utils.SimpleDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateLigne {

	public static void main(String[] args) {
		try {
			SimpleDataSource.init("mysqlParam");
			try (
					Connection connection = SimpleDataSource.getConnection();
					Statement statement = connection.createStatement()
			) {
				statement.executeUpdate(updateAgeByNom("Anas", 25));
				System.out.println("Stagiaire mis maj avec succès");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.err.format("SQLState: %s\n%s", e.getCause(), e.getMessage());
		}
	}

	private static String updateAgeByNom(String nom, int age) {
		return "UPDATE STAGIAIRE SET AGE=" + age + " WHERE nom='" + nom + "'";
	}
}
