package dev.jzadi.formations.gui.swing.layout.card;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe TestCardLayout, créée le 28/02/2021 à 13:15
 *
 * @author Joachim Zadi
 * @version 1.0 28/02/2021
 */
public class TestCardLayout extends JFrame {

    private List<JButton> boutons;
    private JPanel panCard, panCom;
    private CardLayout pile;
    private JButton prec, suiv, prem, der;

    public TestCardLayout() throws HeadlessException {
        setTitle("Exemple CardLayout");
        setSize(400, 180);

        // panneau pour la pile
        panCard = new JPanel();
        add(panCard);

        //Panneau pour les boutons de la pile
        panCom = new JPanel();
        add(panCom, BorderLayout.SOUTH);

        //creation de la pile de boutons
        pile = new CardLayout(30, 10);
        panCard.setLayout(pile);

        boutons = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            JButton button = new JButton("Bouton " + (i + 1));
            boutons.add(button);
            // identification obligatoire ici
            panCard.add(button, "Bouton");
        }

        /* creation des boutons de parcours de la pile */
        prec = new JButton("precedent");
        panCom.add(prec);

        suiv = new JButton("suivant");
        panCom.add(suiv);

        prem = new JButton("premier");
        panCom.add(prem);

        der = new JButton("dernier");
        panCom.add(der);
    }

    public static void main(String[] args) {
        TestCardLayout tcl = new TestCardLayout();
        tcl.setVisible(true);
        tcl.setLocationRelativeTo(null);
        tcl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
