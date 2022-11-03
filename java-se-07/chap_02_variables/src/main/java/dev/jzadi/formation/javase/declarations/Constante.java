package dev.jzadi.formation.javase.declarations;

/**
 * Classe Constante, créée le 17/04/2021 à 16:12
 *
 * @author Joachim Zadi
 * @version 1.0 du 17/04/2021
 */
public class Constante {
    public static void main(String[] args) {

        //Declaration d'une constante en Java
        final int UNE_CONSTANTE = -12;
        System.out.println("UNE_CONSTANTE = " + UNE_CONSTANTE);

        // UNE_CONSTANTE = 12;//On ne peut faire de reassignation de valeur sur constante
    }
}
