package dev.jzadi.formation.javase.decisions;

/**
 * Classe IfTernaire, créée le 18/04/2021 à 15:42
 *
 * @author Joachim Zadi
 * @version 1.0 du 18/04/2021
 */
public class IfTernaire {
    public static void main(String[] args) {
        // Opérateur ternaire
        // Java a un opérateur conditionnel, on appelle un opérateur ternaire car il prend trois opérandes.
        // Les deux symboles de «?» et «:» font l'opérateur ternaire.
        // Si l'expression booléenne a la valeur true, elle évalue l'expression vraie; sinon, il évalue la fausse expression.

        // Syntaxe
        // boolean-expression ? true-expression : false-expression
        int a = 40;
        int b = 20;

        int plusGrand = (a > b) ? a : b;
        System.out.println("\nplusGrand = " + plusGrand);
    }
}
