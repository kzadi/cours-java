package dev.jzadi.formation.javase.decisions;

import java.util.Scanner;

/**
 * Classe Switch, créée le 18/04/2021 à 16:02
 *
 * @author Joachim Zadi
 * @version 1.0 du 18/04/2021
 */
public class Switch {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.print("Saisir un entier : ");
        int val = saisie.nextInt();

        String jourSemaine;

        switch (val) {
            case 1:
                jourSemaine = "Lundi";
                break;
            case 2:
                jourSemaine = "Mardi";
                break;
            case 3:
                jourSemaine = "Mercredi";
                break;
            case 4:
                jourSemaine = "Jeudi";
                break;
            case 5:
                jourSemaine = "Vendredi";
                break;
            case 6:
                jourSemaine = "Samedi";
                break;
            case 7:
                jourSemaine = "Dimanche";
                break;
            default:
                jourSemaine = "Numero de jour inconnu du système";
                break;
        }

        System.out.println("jourSemaine = " + jourSemaine);
        saisie.close();
    }
}
