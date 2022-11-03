package dev.jzadi.formations.gui.swing.components.dialog;

import javax.swing.*;
import java.awt.*;

/**
 * Classe JDialogText, créée le 01/03/2021 à 14:32
 * <p>
 * JDialog fait partie du package swing Java. Le but principal d’une boîte de dialogue est d’y ajouter des composants.
 * JDialog peut être personnalisé selon les besoins de l’utilisateur.
 *
 * @author Joachim Zadi
 * @version 1.0 01/03/2021
 */
public class JDialogTest extends JFrame {

    static JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            // créer un frame
            frame = new JFrame("Exemple JDialog");

            // créer un objet
            JDialogTest obj = new JDialogTest();

            // créer un panneau
            JPanel panel = new JPanel();
            JButton btn = new JButton("Cliquez ici");

            // ajouter le listener au bouton
            btn.addActionListener(e -> {

                String s = e.getActionCommand();

                if (s.equals("Cliquez ici")) {

                    // Créer une boîte de dialogue
                    JDialog dialog = new JDialog(frame, "Boite de dialogue");

                    // Créer une étiquette
                    JLabel l = new JLabel("Ceci est une boite de dialogue.");

                    // Ajouter l'étiquette à la boîte de dialogue
                    dialog.add(l);

                    // Définir la taille de la boîte de dialogue
                    dialog.setSize(200, 100);

                    // Définir la visibilité de la boîte de dialogue
                    dialog.setVisible(true);
                    dialog.setLocationRelativeTo(null);
                }
            });

            // ajouter un bouton au panneau
            panel.add(btn);
            frame.add(panel);
            frame.setSize(300, 300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
