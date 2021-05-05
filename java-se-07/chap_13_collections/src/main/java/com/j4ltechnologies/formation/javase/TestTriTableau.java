package com.j4ltechnologies.formation.javase;

import java.util.Arrays;
import java.util.Collections;

/**
 * Classe TestTriTableau, créée le 15/04/2021 à 19:52
 *
 * @author Joachim Zadi
 * @version 1.0 du 15/04/2021
 */
public class TestTriTableau {
    public static void main(String[] args) {
        //Tableau non trié
        Integer[] nombres = new Integer[]{15, 11, 9, 55, 47, 18, 520, 1123, 366, 420};
        System.out.println("nombres = " + Arrays.toString(nombres));

        //Tableau trié
        Arrays.sort(nombres);
        System.out.println("nombres = " + Arrays.toString(nombres));

        //Trie decroissant
        Arrays.sort(nombres, Collections.reverseOrder());
        System.out.println("nombres = " + Arrays.toString(nombres));

        nombres = new Integer[]{15, 11, 9, 55, 47, 18, 520, 1123, 366, 420};

        //Trie dans une plage du tableau
        Arrays.sort(nombres, 2, 6);
        System.out.println("nombres = " + Arrays.toString(nombres));
    }
}
