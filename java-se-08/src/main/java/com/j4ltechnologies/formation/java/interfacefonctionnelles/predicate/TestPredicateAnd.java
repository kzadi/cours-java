package com.j4ltechnologies.formation.java.interfacefonctionnelles.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Classe TestPredicateAnd, créée le 05/05/2021 à 16:53
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestPredicateAnd {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtres multiples
        List<Integer> collect = list
                .stream()
                .filter(x -> x > 5 && x < 8)
                .collect(Collectors.toList());

        System.out.println(collect);

        // Autrement
        Predicate<Integer> plusGrandQueCinq = x -> x > 5;
        Predicate<Integer> plusPetitQueHuit = x -> x < 8;

        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        collect = list
                .stream()
                .filter(plusGrandQueCinq.and(plusPetitQueHuit))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
