package com.j4ltechnologies.formations.gui.swing.event.adapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Classe EcouteurSouris, créée le 28/02/2021 à 18:27
 *
 * @author Joachim Zadi
 * @version 1.0 28/02/2021
 */
public class EcouteurSouris extends JFrame {
    public EcouteurSouris() throws HeadlessException {
        setTitle("Gestion des clics");
        setSize(300, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //EcouterSouris ecouteSouris = new EcouterSouris();
        //addMouseListener(ecouteSouris);

        //Definition anonyme
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Un clic au point de coordonnees " + x + ", " + y + " !!!");
            }
        });
    }
}

