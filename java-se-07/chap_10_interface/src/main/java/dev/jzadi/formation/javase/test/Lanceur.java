package dev.jzadi.formation.javase.test;

import dev.jzadi.formation.javase.classes.Personne;
import dev.jzadi.formation.javase.concretes.Batteur;
import dev.jzadi.formation.javase.concretes.Maestro;
import dev.jzadi.formation.javase.interfaces.ICompositeur;
import dev.jzadi.formation.javase.interfaces.IMusicien;
import dev.jzadi.formation.javase.interfaces.IMusicienCompositeur;

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
