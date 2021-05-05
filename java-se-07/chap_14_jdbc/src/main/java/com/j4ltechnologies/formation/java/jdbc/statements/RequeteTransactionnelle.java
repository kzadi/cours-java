package com.j4ltechnologies.formation.java.jdbc.statements;

import com.j4ltechnologies.formation.java.jdbc.utils.SimpleDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * Classe RequeteTransactionnelle, créée le 22/04/2021 à 19:44
 *
 * @author Joachim Zadi
 * @version 1.0 du 22/04/2021
 */
public class RequeteTransactionnelle {
    public static void main(String[] args) {

        try {
            SimpleDataSource.init("mysqlParam");
            try (
                    Connection connection = SimpleDataSource.getConnection();
                    Statement statement = connection.createStatement()
            ) {
                connection.setAutoCommit(false);

                // suppression de la table
                statement.addBatch(REQUETE_DROP);

                // creation de la table
                statement.addBatch(REQUETE_CREATE);

                // insertion
                statement.addBatch(genereInsert("Archange", 7));

                // insertion
                statement.addBatch(genereInsert("Laurent", 76));

                // update
                statement.addBatch(updateAgeByNom("Archange", 8));

                int[] rows = statement.executeBatch();

                System.out.println(Arrays.toString(rows)); // [0, 0, 1, 1, 1]

                // on valide la transaction
                connection.commit();
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.format("SQLState: %s\n%s", e.getCause(), e.getMessage());
        }
    }

    private static final String REQUETE_CREATE = "create table if not exists stagiaire(" + "id 	int auto_increment,"
            + "nom 	varchar(20)	not null," + "age	int	not null,"
            + "created_at	datetime default CURRENT_TIMESTAMP," + "constraint stagiaire_pk primary key(id)" + ")";

    private static final String REQUETE_DROP = "DROP TABLE IF EXISTS STAGIAIRE";

    private static String genereInsert(String nom, int age) {
        return "insert into stagiaire(nom, age) " + "values('" + nom + "'," + age + ")";
    }

    private static String updateAgeByNom(String nom, int age) {
        return "UPDATE STAGIAIRE SET AGE=" + age + " WHERE nom='" + nom + "'";
    }
}
