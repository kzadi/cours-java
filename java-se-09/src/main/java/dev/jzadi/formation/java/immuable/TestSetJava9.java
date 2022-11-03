package dev.jzadi.formation.java.immuable;

import java.util.List;
import java.util.Set;

/**
 * Classe TestSetJava9, créée le 10/05/2021 à 16:05
 *
 * @author Joachim Zadi
 * @version 1.0 du 12/04/2021
 */
public class TestSetJava9 {
    public static void main(String[] args) {
        Set<String> prenoms = Set.of("Joachim", "Eric", "Jean");

        // L'orde des elements n'est pas fixé
        System.out.println(prenoms);

        prenoms.add("Power");// Leve une exception UnsupportedOperationException car la liste est immuable

        prenoms = Set.of("Joachim", "Eric", "Jean", null);// Ne compile car les elements doivent etre non nuls

        // Les elements ne peuvent pas se repeter
        prenoms = Set.of("Joachim", "Eric", "Jean", "Eric");// Leve une exception java.lang.IllegalArgumentException
    }
}
