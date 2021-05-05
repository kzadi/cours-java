package com.j4ltechnologies.formation.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Classe TestLambdaExpression, créée le 05/05/2021 à 13:48
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestLambdaExpression {
    public static void main(String[] args) {

        // Java 8 a introduit des expressions lambda pour fournir l 'implémentation
        // de la méthode abstraite d' une interface fonctionnelle.

        // Passez en revue la classe JDK Iterable, elle a une méthode par défaut forEach()
        // qui prend en parametre une interface de fonction Consumer

        // Utilisation d'une Classe anonyme
        List<String> list = Arrays.asList("node", "c++", "java", "javascript", "html", "css");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String chaine) {
                System.out.printf("%s ",chaine);
            }
        });

        System.out.println("\n");

        // Alternativement, nous pouvons utiliser une expression lambda pour raccourcir
        // le code comme ceci:
        list.forEach(chaine -> System.out.println(chaine));

        System.out.println();
        // Pour obtenir une meilleure lisibilité, nous pouvons remplacer
        // l'expression lambda par une référence de méthode.
        list.forEach(System.out::println);
    }
}
