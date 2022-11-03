package dev.jzadi.formations.gui.swing.layout.border;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe TestBorderLayout, créée le 28/02/2021 à 12:44
 * Disposition par defaut du JFrame
 *
 * @author Joachim Zadi
 * @version 1.0 28/02/2021
 */
public class TestBorderLayout extends JFrame {

    public TestBorderLayout() throws HeadlessException {
        setTitle("Exemple BorderLayout");
        setSize(300, 180);

        List<JButton> buttons = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            buttons.add(new JButton("Bouton " + (i + 1)));
        }

        // Au Centre
        add(buttons.get(0));
        add(buttons.get(1), BorderLayout.NORTH);
        add(buttons.get(2), BorderLayout.SOUTH);
        add(buttons.get(3), BorderLayout.EAST);
        add(buttons.get(4), BorderLayout.WEST);
    }

    public static void main(String[] args) {
        TestBorderLayout tbl = new TestBorderLayout();
        tbl.setVisible(true);
        tbl.setLocationRelativeTo(null);
        tbl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
