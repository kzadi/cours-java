package dev.jzadi.formation.java.immuable;

import java.util.List;

/**
 * Classe TestList, créée le 10/05/2021 à 15:56
 *
 * @author Joachim Zadi
 * @version 1.0 du 12/04/2021
 */
public class TestList {
    public static void main(String[] args) {
        // On definit une liste immuable
        List<String> prenoms = List.of("Joachim", "Eric", "Jean");

        // On conserve l'ordre des elements
        System.out.println(prenoms);

        prenoms.add("Power");// Leve une exception UnsupportedOperationException car la liste est immuable

        prenoms = List.of("Joachim", "Eric", "Jean", null);// Ne compile car les elements doivent etre non nuls
    }
}
