package com.j4ltechnologies.formation.javase.primitifs;

/**
 * Classe TypeChar, créée le 17/04/2021 à 16:45
 *
 * @author Joachim Zadi
 * @version 1.0 du 17/04/2021
 */
public class TypeChar {
    public static void main(String[] args) {
        /*
         * Le type char est un entier non signé et codé sur 2 octets soit 16-bits
         * La notion de caractere depasse celle su caractere imprimable
         */
        System.out.println("====== Type Char =====");

        // Declaration d'un char
        char unChar = 'f';
        System.out.println("unChar = " + unChar);

        // Bien entendu, cette notation n'est utilisatble que le caractere est
        // disponible dans l'implementation considerée

        // Certains caracteres ne disposant pas d'un graphisme possede
        // une notation conventionnelle utilisant le \
        int charMin = '\u0000';
        int charMax = '\uffff';

        System.out.printf("%nminChar  = %s%n", charMin);
        System.out.printf("maxChar  = %s%n%n", charMax);

        final char charDebut = 200, charFin = 300;
        for (char c = charDebut; c < charFin; c++) {
            System.out.printf("c = %s => %s\t", (int) c, c);
        }

        // Promotion d'un char en int
        charMin = Character.MIN_VALUE;
        System.out.printf("%n%nminChar  = %s%n", charMin);

        charMax = Character.MAX_VALUE;
        System.out.printf("maxChar  = %s", charMax);
    }
}
