package dev.jzadi.formation.java.interfacefonctionnelles.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Classe TestConsumer, créée le 05/05/2021 à 19:00
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestConsumer {
    public static void main(String[] args) {
        // Dans Java 8, Consumer est une interface fonctionnelle;
        // Elle prend un argument et ne renvoie rien.

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // mise en œuvre de méthodes d'acceptant un Consumeur.
        Consumer<Integer> consumer = (Integer x) -> System.out.printf("%s ", x);
        forEach(list, consumer);

        System.out.println();

        // ou appel direct
        forEach(list, (Integer x) -> System.out.printf("%s ", x));

        System.out.println();

        // La même méthode forEach acceptant Consumer comme argument;
        // cette fois, nous affichons la longueur de la chaîne.
        List<String> autreList = Arrays.asList("a", "ab", "abc");
        forEach(autreList, (String x) -> System.out.printf("%s ", x.length()));
    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
