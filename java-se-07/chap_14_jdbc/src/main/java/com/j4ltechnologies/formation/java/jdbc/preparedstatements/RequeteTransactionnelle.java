package com.j4ltechnologies.formation.java.jdbc.preparedstatements;

import com.j4ltechnologies.formation.java.jdbc.utils.SimpleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * Classe RequeteTransactionnelle, créée le 22/04/2021 à 20:00
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
                    PreparedStatement psCreate = connection.prepareStatement(REQUETE_CREATE);
                    PreparedStatement psInsert = connection.prepareStatement(REQUETE_INSERT);
                    PreparedStatement psUpdate = connection.prepareStatement(REQUETE_UPDATE)
            ) {
                connection.setAutoCommit(false);

                psCreate.execute();

                //Exécuter la liste des commandes d'insertion
                psInsert.setString(1, "Shmuel");
                psInsert.setInt(2, 11);
                psInsert.addBatch();

                psInsert.setString(1, "Bruce");
                psInsert.setInt(2, 70);
                psInsert.addBatch();

                psInsert.setString(1, "Ip");
                psInsert.setInt(2,80);
                psInsert.addBatch();

                int[] lignesInserts = psInsert.executeBatch();

                System.out.println(Arrays.toString(lignesInserts));

                //Exécuter la liste des commandes de mise à jour
                psUpdate.setInt(1, 12);
                psUpdate.setString(2, "Shmuel");
                psUpdate.addBatch();

                psUpdate.setInt(1, 102);
                psUpdate.setString(2, "Ip");
                psUpdate.addBatch();

                int[] lignesUpdate = psUpdate.executeBatch();

                System.out.println(Arrays.toString(lignesUpdate));

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

    private static final String REQUETE_INSERT = "insert into stagiaire(nom,age) values(?, ?)";
    private static final String REQUETE_UPDATE = "UPDATE STAGIAIRE SET AGE=? WHERE NOM=?";
}
