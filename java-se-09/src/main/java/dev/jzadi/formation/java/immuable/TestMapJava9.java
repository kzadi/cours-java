package dev.jzadi.formation.java.immuable;

import java.util.Map;

/**
 * Classe TestMapJava9, créée le 10/05/2021 à 16:13
 *
 * @author Joachim Zadi
 * @version 1.0 du 12/04/2021
 */
public class TestMapJava9 {
    public static void main(String[] args) {
        Map<String, String> prenoms = Map.ofEntries(
                Map.entry("1", "Joachim"),
                Map.entry("2", "Eric"),
                Map.entry("3", "Jean")
        );

        System.out.println(prenoms);

        //UnsupportedOperationException
        prenoms.put("4", "Baptiste");
    }
}
