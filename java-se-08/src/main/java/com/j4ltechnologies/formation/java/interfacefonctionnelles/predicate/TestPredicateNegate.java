package com.j4ltechnologies.formation.java.interfacefonctionnelles.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Classe TestPredicateNegate, créée le 05/05/2021 à 18:43
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestPredicateNegate {
    public static void main(String[] args) {


        Predicate<String> commenceParA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        // Trouvez tous les éléments qui ne commencent pas par «A».
        List<String> collect = list
                .stream()
                .filter(commenceParA.negate())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
