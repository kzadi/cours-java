package dev.jzadi.formation.java.interfacefonctionnelles.unaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Classe TestUnaryOperator, créée le 05/05/2021 à 16:00
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestUnaryOperator {
    public static void main(String[] args) {
        // Une UnaryOperator prend un argument et renvoie un résultat du même type que l'argument.
        // interface UnaryOperator<T> extends Function<T, T> : C'est une interface fonctionnelle

        // Dans cet exemple, la Function<Integer, Integer> qui accepte et renvoie le même type,
        // peut être remplacée par UnaryOperator<Integer>.

        Function<Integer, Integer> function = x -> x * 2;
        Integer resultat = function.apply(5);
        System.out.println("resultat = " + resultat);

        UnaryOperator<Integer> integerUnaryOperator = x -> x * 2;
        resultat = integerUnaryOperator.apply(5);
        System.out.println("resultat = " + resultat);


        // Utilisation de la methode math
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(math(list, x -> x * 5));
    }

    // On peut utiliser une UnaryOperator comme argument d'une méthode
    public static <T> List<T> math(List<T> list, UnaryOperator<T> uo) {
        List<T> resultat = new ArrayList<>();
        for (T t : list) {
            resultat.add(uo.apply(t));
        }
        return resultat;
    }
}
