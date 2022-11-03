package dev.jzadi.formations.gui.swing.event.adapter;

import javax.swing.*;
import java.awt.*;

/**
 * Classe EcouteurBouton, créée le 28/02/2021 à 18:39
 *
 * @author Joachim Zadi
 * @version 1.0 28/02/2021
 */
public class EcouteurBouton extends JFrame /*implements ActionListener */{

    private JTextField text;

    public EcouteurBouton() throws HeadlessException {

        text = new JTextField();
        text.setBounds(45, 50, 150, 20);

        JButton btn = new JButton("Cliquez ici");
        btn.setBounds(70, 100, 100, 30);

        //2ème étape
        //btn.addActionListener(this);
        btn.addActionListener(e->{
            text.setText("Bienvenue chez Solutec !!!");
        });
        add(btn);
        add(text);

        setSize(250, 250);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        text.setText("Bienvenue chez Solutec !!!");
//    }
}
