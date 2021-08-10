package com.j4ltechnologies.formations.gui.swing.components;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Classe JTextAreaTest, créée le 01/03/2021 à 12:58
 * <p>
 * JTextArea fait partie du package java Swing.
 * Il représente une zone sur plusieurs lignes qui affiche du texte. Il est utilisé pour éditer un texte.
 * JTextArea hérite de la classe JComponent.
 * Le texte dans JTextArea peut être défini sur différentes polices disponibles.
 * La zone de texte peut être personnalisée selon les besoins de l’utilisateur.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JTextAreaTest {
    JLabel lblUn, lblDeux;
    JTextArea text;

    public JTextAreaTest() {
        JFrame fenetre = new JFrame();

        lblUn = new JLabel();
        lblUn.setBounds(45, 175, 100, 30);

        lblDeux = new JLabel();
        lblDeux.setBounds(150, 175, 100, 30);

        text = new JTextArea();
        text.setBounds(15, 20, 250, 150);

        JButton btn = new JButton("Compter les mots");
        btn.setBounds(50, 210, 180, 30);

        fenetre.add(text);
        fenetre.add(lblUn);
        fenetre.add(lblDeux);
        fenetre.add(btn);

        fenetre.setSize(300, 300);
        fenetre.setLayout(null);
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(JTextAreaTest::new);
    }
}
