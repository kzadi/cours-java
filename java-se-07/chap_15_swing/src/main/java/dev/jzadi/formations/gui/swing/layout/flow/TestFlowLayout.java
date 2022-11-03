package dev.jzadi.formations.gui.swing.layout.flow;

import javax.swing.*;
import java.awt.*;

/**
 * Classe TestFlowLayout, créée le 28/02/2021 à 13:05
 * Disposition par defaut du JPanel
 *
 * @author Joachim Zadi
 * @version 1.0 28/02/2021
 */
public class TestFlowLayout extends JFrame {
    public TestFlowLayout() {
        setTitle("Exemple FlowLayout");
        setSize(350, 180);

        //Gestionnaire de disposition
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

        for (int i = 1; i < 8; i++) {
            add(new JButton("Bouton " + i));
        }

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        TestFlowLayout tfl = new TestFlowLayout();
        tfl.setVisible(true);
        tfl.setLocationRelativeTo(null);
        tfl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
