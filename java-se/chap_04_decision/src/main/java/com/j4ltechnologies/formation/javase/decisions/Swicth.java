package com.j4ltechnologies.formation.javase.decisions;

import java.util.Scanner;

public class Swicth {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.print("Saisir un entier : ");
        int val = saisie.nextInt();

//        String jourSemaine;

//        switch (val) {
//            case 1:
//                jourSemaine = "Lundi";
//                break;
//            case 2:
//                jourSemaine = "Mardi";
//                break;
//            case 3:
//                jourSemaine = "Mercredi";
//                break;
//            case 4:
//                jourSemaine = "Jeudi";
//                break;
//            case 5:
//                jourSemaine = "Vendredi";
//                break;
//            case 6:
//                jourSemaine = "Samedi";
//                break;
//            case 7:
//                jourSemaine = "Dimanche";
//                break;
//            default:
//                jourSemaine = "Numero de jour inconnu du système";
//                break;
//        }

        String jourSemaine = switch (val) {
            case 1 -> "Lundi";
            case 2 -> "Mardi";
            case 3 -> "Mercredi";
            case 4 -> "Jeudi";
            case 5 -> "Vendredi";
            case 6 -> "Samedi";
            case 7 -> "Dimanche";
            default -> "Numero de jour inconnu du système";
        };

        System.out.println("jourSemaine = " + jourSemaine);
        saisie.close();
    }
}
