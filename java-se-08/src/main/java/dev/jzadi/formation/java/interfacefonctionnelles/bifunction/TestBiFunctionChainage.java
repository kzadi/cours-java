package dev.jzadi.formation.java.interfacefonctionnelles.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Classe TestBiFunctionChainage, créée le 05/05/2021 à 14:46
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestBiFunctionChainage {
    public static void main(String[] args) {

        // On peut chainer les fonctions avec la methode "andThen()".

        // Cette BiFunction prend deux Integer et renvoie un Double,
        // et utilise andThen () pour l'enchaîner avec une Function
        // pour convertir le Double en String.

        BiFunction<Integer, Integer, Double> biFunctionDouble = (x, y) -> Math.pow(x, y);
        Function<Double, String> functionString = d -> String.valueOf(d);

        String resultat = biFunctionDouble.andThen(functionString).apply(2, 5);
        System.out.println("resultat = " + resultat);

        // Appel de la methode puissanceToString
        resultat = puissanceToString(2, 5, (x, y) -> Math.pow(x, y), d -> String.valueOf(d));
        System.out.println("resultat = " + resultat);

        // La methode generique nous offre beaucoup de possibilité, voyons:
        resultat = convertir(2, 5, (x, y) -> Math.pow(x, y), d -> String.format("Puissance: %s", d));
        System.out.println("resultat = " + resultat);

        resultat = convertir(2, 5, (x, y) -> x * y, d -> String.format("Multilication: %s", d));
        System.out.println("resultat = " + resultat);

        resultat = convertir("a", "b", (a1, a2) -> a1 + a2, d -> String.format("%scde", d));
        System.out.println("resultat = " + resultat);

        Integer resultatInteger = convertir("100", "150", (a1, a2) -> a1 + a2, d -> Integer.valueOf(d));
        System.out.println("resultat = " + resultatInteger);
    }

    // Cette méthode prend en arguments une BiFunction et une Function
    // et la chaine.
    public static <R> R puissanceToString(Integer x, Integer y, BiFunction<Integer, Integer, Double> biFunction, Function<Double, R> function) {
        return biFunction.andThen(function).apply(x, y);
    }

    // Cette methode generalise la precedente.
    public static <A1, A2, R1, R2> R2 convertir(A1 a1, A2 a2, BiFunction<A1, A2, R1> biFunction, Function<R1, R2> function) {
        return biFunction.andThen(function).apply(a1, a2);
    }
}
