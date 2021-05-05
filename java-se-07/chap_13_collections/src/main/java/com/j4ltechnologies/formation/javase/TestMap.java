package com.j4ltechnologies.formation.javase;

import java.util.HashMap;
import java.util.Map;

/**
 * L'interface Map nous permet de stocker des données dans des paires clé-valeur
 * (les clés doivent être immuables). Une carte ne peut pas contenir de clés en double;
 * chaque clé peut correspondre à au plus une valeur.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> dictionnaire = new HashMap<>();
        dictionnaire.put(2, "Victor");
        dictionnaire.put(3, "Kim");
        dictionnaire.put(4, "Haciba");
        dictionnaire.put(2, "Michelle");

        System.out.println("dictionnaire = " + dictionnaire);
        System.out.println(dictionnaire.get(4));
    }
}
