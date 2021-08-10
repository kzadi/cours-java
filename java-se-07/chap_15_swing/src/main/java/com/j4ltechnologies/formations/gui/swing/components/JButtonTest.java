package com.j4ltechnologies.formations.gui.swing.components;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Classe JButtonTest, créée le 01/03/2021 à 12:42
 *
 * JButton est un composant de Java Swing.
 * La classe JButton est utilisée pour créer un bouton étiqueté ayant une implémentation indépendante de la plateforme.
 * L’application entraîne une action lorsque le bouton est cliqué.
 * Il peut être configuré pour avoir différentes actions, en utilisant « Event Listener ».
 * JButton hérite de la classe AbstractButton.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JButtonTest {
    public JButtonTest() {

        //Créer un nouveau frame pour stocker le bouton
        JFrame fenetre = new JFrame("Exemple JButton");

        //Créer le bouton
        JButton btn = new JButton("Cliquez moi");

        //Définir la position du bouton
        btn.setBounds(100,100,100,40);

        //Ajouter le bouton au frame
        fenetre.add(btn);
        fenetre.setSize(300,300);
        fenetre.setLayout(null);
        fenetre.setVisible(true);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(JButtonTest::new);
    }
}
