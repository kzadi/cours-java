package com.j4ltechnologies.formation.java.interfacefonctionnelles.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

/**
 * Classe TestSupplier, créée le 06/05/2021 à 05:45
 *
 * @author Joachim Zadi
 * @version 1.0 du 06/05/2021
 */
public class TestSupplier {

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {
        // Dans Java 8, Supplier est une interface fonctionnelle;
        // Elle ne prend aucun argument et renvoie un résultat.

        Supplier<LocalDate> dateSupplier = () -> LocalDate.now();
        LocalDate date = dateSupplier.get();
        System.out.println("date = " + date);

        Supplier<String> stringSupplier = () -> dtf.format(LocalDate.now());
        String dateString = stringSupplier.get();
        System.out.println("dateString = " + dateString);
    }
}
