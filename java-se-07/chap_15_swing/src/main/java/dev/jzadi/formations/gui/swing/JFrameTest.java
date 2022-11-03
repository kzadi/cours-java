package dev.jzadi.formations.gui.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Classe SimpleFenetre, créée le 28/02/2021 à 11:12
 *
 * @author Joachim Zadi
 * @version 1.0 28/02/2021
 */
class JFrameTest extends JFrame {

    private int largeurParDefaut = 300;
    private int hauteurParDefaut = 200;

    public JFrameTest() {

        // On assigne un titre à notre fenetre
        setTitle("Ma Fenêtre Swing");

        // On definit les dimensions de la fenetre
        setSize(largeurParDefaut, hauteurParDefaut);

        //setDimensionEcran();

        // On rend la fenetre visible à l'utilisateur
        setVisible(true);

        // Positionnement au centre de l'ecran
        setLocationRelativeTo(null);

        // On arrete le programme à la fermeture de la fenetre
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void setDimensionEcran() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimEcran = kit.getScreenSize();
        int largeur = dimEcran.width;
        int hauteur = dimEcran.height;
        setSize((largeur - largeurParDefaut) / 2, (hauteur - hauteurParDefaut) / 2);
    }

    public static void main(String[] args) {
        // On crée une instance de la fenetre avec une methode de reference
        EventQueue.invokeLater(JFrameTest::new);
    }
}
