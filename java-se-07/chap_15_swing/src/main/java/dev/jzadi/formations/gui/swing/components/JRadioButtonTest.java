package dev.jzadi.formations.gui.swing.components;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Classe JRadioButtonTest, créée le 01/03/2021 à 13:12
 * <p>
 * Nous utilisons la classe JRadioButton pour créer un bouton radio.
 * Le bouton radio est utilisé pour sélectionner une option parmi plusieurs options.
 * Il est utilisé pour remplir des formulaires, des documents en ligne comme des QCMs par exemple.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JRadioButtonTest {

    public JRadioButtonTest() {

        // On peut utiliser l'inference de type depuis Java 10
        var frame = new JFrame();

        // Créer l'étiquette
        JLabel label = new JLabel("1 - Donnez l'abreviation de AWT ?", JLabel.CENTER);
        label.setBounds(20, 0, 200, 80);

        // Créer les boutons radio
        JRadioButton rBtnUn = new JRadioButton("A) Applet Windowing Toolkit");
        JRadioButton rBtnDeux = new JRadioButton("B) Abstract Windows Toolkit");
        JRadioButton rBtnTrois = new JRadioButton("C) Absolute Windowing Toolkit");

        // Définir la position des boutons radio
        rBtnUn.setBounds(40, 60, 200, 50);
        rBtnDeux.setBounds(40, 100, 200, 50);
        rBtnTrois.setBounds(40, 140, 200, 50);

        // Ajouter les boutons radio au groupe
        ButtonGroup bg = new ButtonGroup();
        bg.add(rBtnUn);
        bg.add(rBtnDeux);
        bg.add(rBtnTrois);

        // Ajouter les boutons au frame
        frame.add(label);
        frame.add(rBtnUn);
        frame.add(rBtnDeux);
        frame.add(rBtnTrois);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(JRadioButtonTest::new);
    }
}
