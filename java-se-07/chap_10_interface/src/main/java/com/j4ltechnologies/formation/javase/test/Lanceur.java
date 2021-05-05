package com.j4ltechnologies.formation.javase.test;

import com.j4ltechnologies.formation.javase.classes.Personne;
import com.j4ltechnologies.formation.javase.concretes.Batteur;
import com.j4ltechnologies.formation.javase.concretes.Maestro;
import com.j4ltechnologies.formation.javase.interfaces.ICompositeur;
import com.j4ltechnologies.formation.javase.interfaces.IMusicien;
import com.j4ltechnologies.formation.javase.interfaces.IMusicienCompositeur;

/**
 * Classe Lanceur, créée le 21/04/2021 à 14:59
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Lanceur {
    public static void main(String[] args) {
        //Une interface ne s'instancie pas
        Personne personne;
        IMusicien musicien;
        ICompositeur compositeur;
        IMusicienCompositeur musicienCompositeur;

        Batteur batteur = new Batteur("Phils Colins", 32);

        musicien = batteur;
        musicien.jouerInstrument();

        compositeur = (ICompositeur) batteur;
        compositeur.ecrirePartition();

        personne = batteur;
        Maestro maestro = new Maestro("Eric Clapton", 31);

        musicien = maestro;
        System.out.println("musicien = " + musicien);
        System.out.println("musicien = " + musicien.jouerInstrument());

        compositeur = maestro;
        System.out.println("compositeur = " + compositeur);
        System.out.println("compositeur = " + compositeur.ecrirePartition());
        batteur.seMarier(maestro);
    }
}
