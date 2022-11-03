package dev.jzadi.formations.gui.swing.components;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

/**
 * Classe JTbaleFromDb, créée le 01/03/2021 à 15:02
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JTableFromDatabase {

    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/db_solutec";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                    try {

                        Class.forName(DRIVER);
                        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

                        String query = "SELECT * FROM stagiaire";

                        Statement stm = con.createStatement();
                        ResultSet res = stm.executeQuery(query);

                        String[] columns = {"Id", "Prénom", "Age"};
                        String[][] data = new String[8][3];

                        int i = 0;
                        while (res.next()) {
                            int id = res.getInt("id");
                            String nom = res.getString("prenom");
                            String age = res.getString("age");
                            data[i][0] = id + "";
                            data[i][1] = nom;
                            data[i][2] = age;
                            i++;
                        }

                        DefaultTableModel model = new DefaultTableModel(data, columns);
                        JTable table = new JTable(model);
                        table.setShowGrid(true);
                        table.setShowVerticalLines(true);
                        JScrollPane pane = new JScrollPane(table);

                        JFrame fenetre = new JFrame("Remplir JTable a partir d'une BDD");

                        JPanel panel = new JPanel();
                        panel.add(pane);
                        fenetre.add(panel);

                        fenetre.setSize(500, 250);
                        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        fenetre.setVisible(true);
                        fenetre.setLocationRelativeTo(null);

                    } catch (SQLException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
