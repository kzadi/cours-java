package com.j4ltechnologies.formation.javase.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Classe TestCalendrier, créée le 12/04/2021 à 15:34
 *
 * @author Joachim Zadi
 * @version 1.0 du 12/04/2021
 */
public class TestCalendrier {
    public static void main(String[] args) {

        LocalDate aujourdhui = LocalDate.now(); //La date du jour
        System.out.println("aujourdhui = " + aujourdhui);
        System.out.println("nous sommes un " + aujourdhui.getDayOfWeek());
        System.out.println("nous sommes le " + aujourdhui.getDayOfYear() + "è jour de l'année");
        System.out.println("le début de ce mois est " + aujourdhui.minusDays(aujourdhui.getDayOfMonth() - 1));

        LocalDate unJour = LocalDate.of(1969, 3, 20);
        System.out.println("un jour = " + unJour);

        LocalDate leMemeJour = LocalDate.of(1969, Month.MARCH, 20);
        System.out.println("le meme mour = " + leMemeJour);

        LocalDate dansTroisMois = aujourdhui.plusMonths(3);
        System.out.println("dans trois mois = " + dansTroisMois);
        System.out.println("nous serons dans le mois de = " + dansTroisMois.getMonth());

        //Ecart entre aujourdhui et un jour donné & differents affichages
        Period ecart = unJour.until(aujourdhui);

        System.out.printf("ecart = %s années %s mois et %s jours\n", ecart.getYears(), ecart.getMonths(), ecart.getDays());
        System.out.printf("ecart en mois = %s mois\n", ecart.toTotalMonths());

        long nbJours = unJour.until(aujourdhui, ChronoUnit.DAYS);
        System.out.printf("ecart en jours = %s jours\n", nbJours);

        Period onAjoute = Period.of(1, 2, 3);//1 an 2 mois et 3 jours

        LocalDate plusTard = aujourdhui.plus(onAjoute);
        System.out.println("plus tard = " + plusTard);
    }
}
