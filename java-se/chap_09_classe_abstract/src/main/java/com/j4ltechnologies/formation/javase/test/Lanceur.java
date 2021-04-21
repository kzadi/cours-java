package com.j4ltechnologies.formation.javase.test;

import com.j4ltechnologies.formation.javase.abstracts.Animal;
import com.j4ltechnologies.formation.javase.concretes.Chat;
import com.j4ltechnologies.formation.javase.concretes.Lion;

/**
 * Classe Lanceur, créée le 21/04/2021 à 14:40
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Lanceur {
    public static void main(String[] args) {
        Animal animal; // Autoriser en vertu du type Animal qui existe
        // animal = new Animal("Jaune", 105.5);//Impossible d'utiliser le mot cle new
        // pour instancier Animal

        Lion simba = new Lion("Mauve", 200.);
        animal = simba;
        System.out.println(animal);

        Chat milou = new Chat("Blanc", 4.5);
        animal = milou;
        System.out.println(animal);
    }
}
