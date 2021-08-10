package com.j4ltechnologies.formations.gui.swing.components;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Classe MonMenu, créée le 01/03/2021 à 14:26
 * <p>
 * La classe JMenuBar est utilisée pour afficher la barre de menu sur la fenêtre. Il peut avoir plusieurs menus.
 * <p>
 * L’objet de la classe JMenu permet de créer un menu déroulant qui est affiché à partir de la barre de menus. Il hérite de la classe JMenuItem.
 * <p>
 * L’objet de la classe JMenuItem ajoute un simple élément au menu. Les éléments utilisés dans un menu doivent appartenir au JMenuItem ou à l’une de ses sous-classes.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class MonMenu {

    JMenu menu, smenu;
    JMenuItem e1, e2, e3, e4, e5, e6;

    public MonMenu() {

        // Créer le frame
        JFrame frame = new JFrame("Exemple Menu");

        // Créer la barre de menu
        JMenuBar menubar = new JMenuBar();

        // Créer le menu
        menu = new JMenu("Menu");

        // Créer le sous menu
        smenu = new JMenu("Sous Menu");

        // Créer les éléments du menu et sous menu
        e1 = new JMenuItem("Element 1");
        e2 = new JMenuItem("Element 2");
        e3 = new JMenuItem("Element 3");
        e4 = new JMenuItem("Element 4");
        e5 = new JMenuItem("Element 5");
        e6 = new JMenuItem("Element 6");

        // Ajouter les éléments au menu
        menu.add(e1);
        menu.add(e2);
        menu.add(e3);

        // Ajouter les éléments au sous menu
        smenu.add(e4);
        smenu.add(e5);
        smenu.add(e6);

        // Ajouter le sous menu au menu principale
        menu.add(smenu);

        // Ajouter le menu au barre de menu
        menubar.add(menu);

        // Ajouter la barre de menu au frame
        frame.setJMenuBar(menubar);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(MonMenu::new);
    }
}
