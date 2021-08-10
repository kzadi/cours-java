package com.j4ltechnologies.formations.gui.swing.event.adapter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Classe EcouterSouris, créée le 28/02/2021 à 18:22
 *
 * @author Joachim Zadi
 * @version 1.0 28/02/2021
 */
public class EcouterSouris implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.printf("(x = %d, y = %d)%n", x, y);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
