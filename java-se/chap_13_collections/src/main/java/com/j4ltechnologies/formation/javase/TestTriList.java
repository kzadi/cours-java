package com.j4ltechnologies.formation.javase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Classe TestTriList, créée le 15/04/2021 à 20:01
 * <p>
 * Les listes peuvent être triées en Java à l'aide de l'API Collections.sort ().
 * Il utilise un tri de fusion modifié et offre des performances garanties n log (n).
 *
 * @author Joachim Zadi
 * @version 1.0 du 15/04/2021
 */
public class TestTriList {
    public static void main(String[] args) {
        //Tableau non trié
        Integer[] tabNombres = new Integer[]{15, 11, 9, 55, 47, 18, 1123, 520, 366, 420};

        //On transforme le tableau en List
        List<Integer> nombres = Arrays.asList(tabNombres);
        System.out.println("nombres = " + nombres);

        //Trie de la liste
        Collections.sort(nombres);
        System.out.println("nombres = " + nombres);

        tabNombres = new Integer[]{15, 11, 9, 55, 47, 18, 1123, 520, 366, 420};
        nombres = Arrays.asList(tabNombres);

        //Trie decroissant
        //Collections.sort(nombres,Collections.reverseOrder());
        nombres.sort(Collections.reverseOrder());
        System.out.println("nombres = " + nombres);
    }
}
