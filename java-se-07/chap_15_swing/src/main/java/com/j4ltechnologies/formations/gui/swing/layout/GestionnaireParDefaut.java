package com.j4ltechnologies.formations.gui.swing.layout;

import javax.swing.*;

/**
 * Classe ComposantButton, créée le 28/02/2021 à 12:26
 *
 * @author Joachim Zadi
 * @version 1.0 28/02/2021
 */
public class GestionnaireParDefaut extends JFrame {
    public GestionnaireParDefaut() {

        //Titre de la fenetre
        super("Premier Bouton");

        //Le composant Bouton à afficher
        JButton ok1 = new JButton("OK 1");

        //On ajoute le composant à la fenetre
        add(ok1);

        //Dans le gestionnaire par defaut, les composants s'empilient les un sur les autres

        var ok2 = new JButton("OK 2");
        add(ok2);

        setSize(300, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
