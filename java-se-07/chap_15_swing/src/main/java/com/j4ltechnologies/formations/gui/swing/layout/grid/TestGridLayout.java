package com.j4ltechnologies.formations.gui.swing.layout.grid;

import javax.swing.*;
import java.awt.*;

/**
 * Classe TestGridLayout, créée le 28/02/2021 à 12:57
 *
 * @author Joachim Zadi
 * @version 1.0 28/02/2021
 */
public class TestGridLayout extends JFrame {
    public TestGridLayout() throws HeadlessException {
        setTitle("Exemple GridLayout");
        setSize(350, 180);

        //On affecte le manader de disposition au conteneur
        setLayout(new GridLayout(4, 3, 15, 10));

        for (int i = 0; i < 10; i++) {
            add(new JButton("Bouton " + (i + 1)));
        }
    }

    public static void main(String[] args) {
        TestGridLayout tgl=new TestGridLayout();
        tgl.setVisible(true);
        tgl.setLocationRelativeTo(null);
        tgl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
