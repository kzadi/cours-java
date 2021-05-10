package com.j4ltechnologies.formation.java.streamofdate;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe TestJava9Stream, créée le 10/05/2021 à 15:38
 *
 * @author Joachim Zadi
 * @version 1.0 du 12/04/2021
 */
public class TestJava9Stream {
    public static void main(String[] args) {
        // La gestion de la date et de l'heure a toujours été un problème pour les développeurs Java.
        // La nouvelle API Date-Heure ajoutée dans Java 8 a changé la façon dont vous interagissez avec
        // les dates dans java.
        // C'était une amélioration très puissante et indispensable.
        // La seule chose qui manquait était d'obtenir un flux de dates ayant une différence
        // commune entre deux dates ultérieures (même si c'était possible mais il n'y avait pas de moyen facile).

        // Java 9 a introduit une nouvelle méthode LocalDate.datesUntil() qui peut donner un flux sur les dates.
        // L'utilisation de datesUntil() facilite la création de flux de dates avec un décalage fixe.

        // Affidche les dates par intervalle journalier
        System.out.println(getDateJournalier(LocalDate.now(), LocalDate.now().plusDays(10)));

        // Affiche les dates par intervalles de semaine
        System.out.println(getDateDateParSemaine(LocalDate.now(), LocalDate.now().plusWeeks(10)));
    }

    // Flux de dates avec 1 jour de différence
    public static List<LocalDate> getDateJournalier(LocalDate debut, LocalDate fin) {
        return debut.datesUntil(fin).collect(Collectors.toList());
    }

    // Flux de dates avec 1 semaine de différence
    public static List<LocalDate> getDateDateParSemaine(LocalDate debut, LocalDate fin) {
        return debut.datesUntil(fin, Period.ofWeeks(1)).collect(Collectors.toList());
    }
}
