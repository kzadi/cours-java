package dev.jzadi.formation.java.interfacefonctionnelles.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Classe TestPredicateFilter, créée le 05/05/2021 à 16:42
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestPredicateFilter {
    public static void main(String[] args) {


        //filter() accepte le prédicat comme argument
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // On applique le filtre
        List<Integer> collect = list
                .stream()
                .filter(x -> x > 5)
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);

        // Autrement
        Predicate<Integer> plusGrandQueCinq = x -> x > 5;
        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        collect = list
                .stream()
                .filter(plusGrandQueCinq)
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);
    }
}
