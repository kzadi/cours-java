package com.j4ltechnologies.formation.java.jdbc.statements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.j4ltechnologies.formation.java.jdbc.utils.SimpleDataSource;

public class CreateTable {

	public static void main(String[] args) {

		final String REQUETE = "create table if not exists stagiaire(" + "id 	int auto_increment,"
				+ "nom 	varchar(20)	not null," + "age	int	not null,"
				+ "created_at	datetime default CURRENT_TIMESTAMP," + "constraint stagiaire_pk primary key(id)" + ")";

		try {
			SimpleDataSource.init("mysqlParam");
			try (
					Connection connection = SimpleDataSource.getConnection();
					Statement statement = connection.createStatement();
				) {
				statement.execute(REQUETE);
			} catch (SQLException e) {
				System.err.format("Code SQL: %s\n%s", e.getSQLState(), e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}