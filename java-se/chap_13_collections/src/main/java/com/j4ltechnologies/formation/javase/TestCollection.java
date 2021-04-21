package com.j4ltechnologies.formation.javase;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {

        //Collection Non Generique à eviter quan
        ArrayList maListe = new ArrayList();

        int taille = maListe.size();
        System.out.println("taille = " + taille);

        maListe.add("Victor");
        maListe.add(10);
        taille = maListe.size();
        System.out.println("taille = " + taille);

        String victor = (String) maListe.get(0);
        int dix = (int) maListe.get(1);
    }
}
