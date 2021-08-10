package com.j4ltechnologies.formation.java.interfacefonctionnelles.biconsumer;

import java.util.function.BiConsumer;

/**
 * Classe TestBiConsumer, créée le 05/05/2021 à 19:11
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestBiConsumer {
    public static void main(String[] args) {
        // En Java 8, une BiConsumer est une interface fonctionnelle;
        // Elle prend deux arguments et ne renvoie rien.

        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);    // 3

        // Cet exemple accepte BiConsumer comme argument, crée un addTwo générique
        // pour joindre deux objets.
        addTwo(1, 2, (x, y) -> System.out.println(x + y));          // 3
        addTwo("Java", "FX", (x, y) -> System.out.println(x + y)); // JavaFX
    }

    static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
        c.accept(a1, a2);
    }
}
