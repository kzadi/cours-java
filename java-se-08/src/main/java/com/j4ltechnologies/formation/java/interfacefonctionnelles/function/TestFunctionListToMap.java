package com.j4ltechnologies.formation.java.interfacefonctionnelles.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Classe TestFunctionListToMap, créée le 05/05/2021 à 12:43
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestFunctionListToMap {
    public static void main(String[] args) {
        TestFunctionListToMap obj = new TestFunctionListToMap();

        List<String> list = Arrays.asList("node", "c++", "java", "javascript", "html", "css");

        // Lambda expression pour la construction de la map
        Map<String, Integer> map = obj.convertListToMap(list, x -> x.length());
        System.out.println("map = " + map);

        // Utilistation d'une methode de reference
        map = obj.convertListToMap(list, obj::getLength);
        System.out.println("map = " + map);
    }

    public <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> function) {
        Map<T, R> resultat = new HashMap<>();
        for (T t : list) {
            resultat.put(t, function.apply(t));
        }
        return resultat;
    }

    public Integer getLength(String chaine) {
        return chaine.length();
    }
}