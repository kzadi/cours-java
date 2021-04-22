package com.j4ltechnologies.formation.java.jdbc.statements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.j4ltechnologies.formation.java.jdbc.utils.SimpleDataSource;

public class InsertionLigne {

	public static void main(String[] args) {
		try {
			SimpleDataSource.init("mysqlParam");
			try (
					Connection connection = SimpleDataSource.getConnection();
					Statement statement = connection.createStatement();
				) {
				statement.executeUpdate(genereInsert("Anas", 20));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String genereInsert(String nom, int age) {
		return "insert into stagiaire(nom, age) " + "values('" + nom + "'," + age + ");";
	}
}
