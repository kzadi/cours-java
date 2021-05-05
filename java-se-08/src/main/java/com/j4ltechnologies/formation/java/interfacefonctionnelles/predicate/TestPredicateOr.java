package com.j4ltechnologies.formation.java.interfacefonctionnelles.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Classe TestPredicateOr, créée le 05/05/2021 à 18:40
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestPredicateOr {
    public static void main(String[] args) {

        Predicate<String> longueurEstTrois = x -> x.length() == 3;
        Predicate<String> commenceParA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect = list
                .stream()
                .filter(longueurEstTrois.or(commenceParA))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
