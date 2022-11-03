package dev.jzadi.formation.java.interfacefonctionnelles.function;

import java.util.function.Function;

/**
 * Classe TestFunction, créée le 05/05/2021 à 12:20
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestFunction {
    public static void main(String[] args) {

        // Dans Java 8, Function est une interface fonctionnelle ;
        // Elle prend un argument (objet de type T)et renvoie un objet (objet de type R).
        // L'argument et la sortie peuvent être d' un type différent.

        Function<String, Integer> fonction = x -> x.length();

        Integer resultat = fonction.apply("Joachim");
        System.out.println("resultat = " + resultat);


        // L'exemple suivant prend une Function en argument, et convertit une List en une Map.

    }
}
