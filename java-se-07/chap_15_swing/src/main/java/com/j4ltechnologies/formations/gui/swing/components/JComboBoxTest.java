package com.j4ltechnologies.formations.gui.swing.components;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Classe JComboBoxTest, créée le 01/03/2021 à 14:14
 * <p>
 * JComboBox fait partie du package Java Swing.
 * JComboBox hérite de la classe JComponent.
 * JComboBox affiche un menu contextuel sous forme d’une liste qui permet à l’utilisateur de
 * sélectionner une option dans cette liste spécifiée.
 * JComboBox peut être modifiable ou en lecture seule selon le choix du programmeur.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JComboBoxTest {

    public JComboBoxTest() {

        // créer un nouvea frame
        // frame
        JFrame frame = new JFrame("frame");

        // définir la disposition du frame
        frame.setLayout(new FlowLayout());

        // tableau de chaînes contenant des langages
        String[] langages = { "Java", "PHP", "Python", "C++", "Ruby" };

        // créer une case à cocher
        // combobox
        JComboBox<String> combobox = new JComboBox<>(langages);

        // créer des étiquettes
        // label
        JLabel lblUn = new JLabel("Quel est votre langage preféré ? ");

        // créer un nouveau panneau
        JPanel p = new JPanel();

        // ajouter combobox et labels au panneau
        p.add(lblUn);
        p.add(combobox);

        // ajouter le panneau au frame
        frame.add(p);

        // définir la taille du frame
        frame.setSize(400, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(JComboBoxTest::new);
    }
}
