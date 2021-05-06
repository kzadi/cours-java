package com.j4ltechnologies.formation.java.streams;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe TestStreamFilter, créée le 06/05/2021 à 06:25
 *
 * @author Joachim Zadi
 * @version 1.0 du 06/05/2021
 */
public class TestStreamFilter {
    public static void main(String[] args) {
        List<String> chaines = Arrays.asList("spring", "node", "arsene");

        // AVANT JAVA 8
        // Appel de la methode getFiltreDeSortie
        List<String> resultat = getFiltreDeSortie(chaines, "arsene");
        System.out.println("resultat = " + resultat);

        // L'EXEMPLE EQUIVALENT EN JAVA 8,
        // stream.filter() pour filtrer une liste,
        // et collect() pour convertir un flux en une liste.
        resultat = chaines.stream()
                .filter(chaine -> !("arsene".equals(chaine)))
                .collect(Collectors.toList());
        System.out.println("resultat = " + resultat);

        // =======================================================
        List<Personne> personnes = Arrays.asList(
                new Personne("joachim", 30),
                new Personne("ludovic", 23),
                new Personne("ségolène", 24)
        );

        // AVANT JAVA 8
        // Appel de la methode getPersonneByNom
        Personne personne = getPersonneByNom(personnes, "joachim");
        System.out.println("personne = " + personne);

        // L'EXEMPLE EQUIVALENT EN JAVA 8,
        // utilisez stream.filter() pour filtrer une liste et
        // .findAny().OrElse(null) pour renvoyer un objet conditionnel.
        personne = personnes.stream()                           // Conversion en Stream
                .filter(p -> p.getNom().equals("joachim"))      // nous voulons seulement "joachim"
                .findAny()                                      // Si 'findAny' trouve un resultat alors, on le retourne
                .orElse(null);                             // Si non, on retourne null
        System.out.println("personne = " + personne);

        // On peut combiner les filtres
        personne = personnes.stream()
                .filter(p -> p.getNom().equals("ludovic") && p.getAge() == 23)
                .findAny()
                .orElse(null);
        System.out.println("personne = " + personne);

        // Ou bien ecrire comme suite
        personne = personnes.stream()
                .filter(p -> {
                    if (p.getNom().equals("ségolène") && p.getAge() == 24) {
                        return true;
                    }
                    return false;
                })
                .findAny()
                .orElse(null);
        System.out.println("personne = " + personne);

        // Utilisation de la methode .map() pour convertir en un type de donnée
        String nom = personnes.stream()
                .map(Personne::getNom)
                .filter(pNom -> (pNom).equals("joachim"))
                .findAny()
                .orElse(null);
        System.out.println("nom = " + nom);

        // Utilisation de la methode .collect()
        List<String> listNoms = personnes.stream()
                .map(Personne::getNom)
                .collect(Collectors.toList());
        System.out.println("listNom = " + listNoms);
    }

    static List<String> getFiltreDeSortie(List<String> liste, String chaine) {
        List<String> resultat = new ArrayList<>();
        for (String mot : liste) {
            if (!"arsene".equals(mot)) {
                resultat.add(mot);
            }
        }
        return resultat;
    }

    static Personne getPersonneByNom(List<Personne> persons, String name) {

        Personne personne = null;
        for (Personne p : persons) {
            if (name.equals(p.getNom())) {
                personne = p;
            }
        }
        return personne;
    }
}

@Setter
@Getter
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class Personne {
    String nom;
    int age;
}
