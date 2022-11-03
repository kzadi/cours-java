package dev.jzadi.formation.javase.enums;

import java.util.Arrays;

/**
 * Classe TestEnum, créée le 21/04/2021 à 15:17
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class TestEnum {
    public static void main(String[] args) {
    // Declaration d'une variable de type enum
        Taille taille = Taille.M;
        System.out.println("taille = " + taille);
        System.out.println(Arrays.toString(Taille.values()));

        System.out.println();

        for (Jour jour : Jour.values()){
            System.out.println("jour = " + jour.getAbreviation());
        }
    }
}
