package com.j4ltechnologies.formations.gui.swing.components;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Classe JPanelTest, créée le 01/03/2021 à 12:30
 *
 * JPanel est une partie du package Java Swing, est un conteneur qui peut stocker un groupe de composants.
 * La tâche principale de JPanel est d’organiser les composants,
 * diverses dispositions peuvent être définies dans JPanel qui offrent une meilleure organisation des composants,
 * mais il n’a pas une barre de titre comme JFrame.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JPanelTest {
    JPanelTest() {
        //Créer le Jframe
        JFrame fenetre = new JFrame("Bienvenu à Solutec");

        //Créer le JPanel
        JPanel panel = new JPanel();

        //Spécifier la position et la taille du JPanel
        panel.setBounds(40, 50, 150, 150);

        //Spécifier la couleur d'arrière-plan du JPanel
        panel.setBackground(Color.lightGray);

        //Créer le bouton 1
        JButton btnUn = new JButton("Bouton 1");

        //Spécifier la position et la taille du bouton
        btnUn.setBounds(50, 100, 80, 30);

        //Spécifier la couleur d'arrière-plan du bouton
        btnUn.setBackground(Color.WHITE);

        //Créer le bouton 2
        JButton btnDeux = new JButton("Bouton 2");
        btnDeux.setBounds(100, 100, 80, 30);
        btnDeux.setBackground(Color.RED);

        //Ajouter les deux boutons au JPanel
        panel.add(btnUn);
        panel.add(btnDeux);

        //Ajouter le JPanel au JFrame
        fenetre.add(panel);
        fenetre.setSize(350, 350);
        fenetre.setLayout(null);
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(JPanelTest::new);
    }
}
