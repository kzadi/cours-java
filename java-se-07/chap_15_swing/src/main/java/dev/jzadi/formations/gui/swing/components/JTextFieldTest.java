package dev.jzadi.formations.gui.swing.components;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Classe JTextFieldText, créée le 01/03/2021 à 12:46
 * <p>
 * JTextField fait partie du package javax.swing.
 * La classe JTextField est un composant qui permet de modifier une seule ligne de texte.
 * JTextField hérite de la classe JTextComponent et utilise l’interface SwingConstants.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JTextFieldTest {

    public JTextFieldTest() {

        JFrame fenetre = new JFrame("Exemple JTextField");

        JTextField textUn = new JTextField();
        textUn.setBounds(20, 40, 200, 28);

        JTextField textDeux = new JTextField("Bienvenue à Solutec");
        textDeux.setBounds(20, 80, 200, 28);

        fenetre.add(textUn);
        fenetre.add(textDeux);
        fenetre.setSize(250, 250);
        fenetre.setLayout(null);
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(JTextFieldTest::new);
    }
}
