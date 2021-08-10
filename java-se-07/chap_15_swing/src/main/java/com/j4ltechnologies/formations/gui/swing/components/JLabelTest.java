package com.j4ltechnologies.formations.gui.swing.components;

import javax.swing.*;
import java.awt.*;

/**
 * Classe JLabelTest, créée le 01/03/2021 à 12:37
 *
 * JLabel est une classe de java Swing.
 * JLabel est une zone pour afficher une chaîne courte ou une image ou les deux.
 * JLabel n’est utilisé que pour afficher du texte ou d’image et il ne peut pas obtenir le focus.
 * JLabel est inactif pour saisir des événements tels qu’un focus souris ou un focus clavier.
 * Par défaut, les étiquettes(labels) sont centrées verticalement mais l’utilisateur peut modifier l’alignement du JLabel.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JLabelTest {
    public JLabelTest() {
        JFrame frame = new JFrame("Exemple JLabel");

        //Créer une étiquette pour afficher du texte centré
        JLabel label = new JLabel("Bienvenue à Solutec", JLabel.CENTER);

        //Ajouter l'étiquette au frame
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(JLabelTest::new);
    }
}
