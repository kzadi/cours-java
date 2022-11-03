package dev.jzadi.formations.gui.swing.exos;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author : Crée par Joachim le 12/02/2018 à 19:26
 * @version : 1.0
 */
public class ListePrenom extends JFrame {

    private int minValue;
    private int maxValue;
    private int currentValue;
    private int step;

    public ListePrenom() {

        setTitle("Liste de prénoms");
        setLayout(new BorderLayout(1, 1));
        setSize(480, 200);

        JToolBar barBoutons = new JToolBar();
        add(barBoutons, BorderLayout.NORTH);

        Icon addIcon = new ImageIcon(getClass().getResource("/images/add.png"));
        JButton btnAjouter = new JButton("Ajouter", addIcon);
        barBoutons.add(btnAjouter);

        final URL URL_IMG_MODIFIER = getClass().getResource("/images/update.png");
        Icon modifierIcon = new ImageIcon(URL_IMG_MODIFIER);
        JButton btnModifier = new JButton("Modifier", modifierIcon);
        barBoutons.add(btnModifier);

        final URL URL_IMG_SUPPRIMER = getClass().getResource("/images/remove.png");
        Icon removeIcon = new ImageIcon(URL_IMG_SUPPRIMER);
        JButton btnRemove = new JButton("Supprimer", removeIcon);
        barBoutons.add(btnRemove);

        final URL URL_IMG_TOUT_SUPPRIMER = getClass().getResource("/images/remove-all.png");
        Icon removeAllIcon = new ImageIcon(URL_IMG_TOUT_SUPPRIMER);
        JButton btnRemoveAll = new JButton("Vider", removeAllIcon);
        barBoutons.add(btnRemoveAll);

        JLabel lblPosition = new JLabel("Position : ");
        barBoutons.add(lblPosition);

        SpinnerNumberModel numberModel = new SpinnerNumberModel(currentValue, minValue, maxValue, step);
        JSpinner position = new JSpinner(numberModel);
        position.setEnabled(false);
        barBoutons.add(position);

        JPanel panelSaisie = new JPanel();
        panelSaisie.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(panelSaisie);

        JPanel panelResultat = new JPanel();
        panelResultat.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(panelSaisie);

        JTextField prenom = new JTextField(20);
        panelSaisie.add(prenom);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(ListePrenom::new);
    }
}
