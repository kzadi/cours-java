package dev.jzadi.formations.gui.swing.components;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Classe JCheckBoxTest, créée le 01/03/2021 à 13:05
 * <p>
 * JCheckBox est un composant Swing qui représente un élément qui montre un état sélectionné ou non sélectionné.
 * L’utilisateur peut changer cet état en cliquant sur la case à cocher du composant.
 * <p>
 * Un composant JCheckBox standard contient une case à cocher et une étiquette qui décrit
 * l’objectif de la case à cocher. Une icône et une clé mnémonique peuvent également être définies pour ce composant.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JCheckBoxTest {

    JFrame fenetre;

    public JCheckBoxTest() {

        // créer un nouveau frame
        fenetre = new JFrame("Exemple Checkbox");

        // définir la disposition du frame
        fenetre.setLayout(new FlowLayout());

        // créer une case à cocher
        JCheckBox checkUn = new JCheckBox("Masculin");
        JCheckBox checkDeux = new JCheckBox("Feminin");

        // créer un nouveau panneau
        JPanel p = new JPanel();

        // ajouter une case à cocher au panneau
        p.add(checkUn);
        p.add(checkDeux);

        // ajouter le panneau au frame
        fenetre.add(p);

        // définir la taille du frame
        fenetre.setSize(400, 100);
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(JCheckBoxTest::new);
    }
}
