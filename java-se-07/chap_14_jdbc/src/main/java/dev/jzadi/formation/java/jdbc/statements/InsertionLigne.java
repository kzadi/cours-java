package dev.jzadi.formation.java.jdbc.statements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dev.jzadi.formation.java.jdbc.utils.SimpleDataSource;

public class InsertionLigne {

    public static void main(String[] args) {
        try {
            SimpleDataSource.init("mysqlParam");
            try (
                    Connection connection = SimpleDataSource.getConnection();
                    Statement statement = connection.createStatement()
            ) {
                statement.executeUpdate(genereInsert("Anne", 18));
                System.out.println("Stagiaire inseré avec succès");
            } catch (SQLException e) {
                System.err.format("SQLState: %s\n%s", e.getSQLState(), e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String genereInsert(String nom, int age) {
        return "insert into stagiaire(nom, age) " + "values('" + nom + "'," + age + ")";
    }
}
