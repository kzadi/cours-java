package dev.jzadi.formation.javase.exceptions.test;

import dev.jzadi.formation.javase.exceptions.PointException;
import dev.jzadi.formation.javase.exceptions.classes.Point;

import java.util.Scanner;

/**
 * Classe Lanceur, créée le 21/04/2021 à 15:44
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Lanceur {
    public static void main(String[] args) {
        // Intro Exceptions
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        if(in.hasNextInt()){
            int entier = in.nextInt();
            System.out.println("Vous avez saisi " + entier);
        }else {
            System.out.println("Attention a votre saisie !!!");
        }

        try {
            Point a = new Point(-2, 3);
            System.out.println("A ==> OK");

            Point b = new Point(-6, 3);
            System.out.println("B ==> OK");

            a.translater(-5, 3);
            System.out.println("TRANSLATION ==> OK");
        }
//        catch (PointConstructException | TranslaterException e) {
//            System.out.println(e.getMessage());
//            System.out.println("je suis l'exception " + e.getClass().getSimpleName());
//            System.exit(-1);
//        }
        catch (PointException.Constructeur | PointException.Translater e) {
            System.out.println(e.getMessage());
            System.out.println("je suis l'exception " + e.getClass().getSimpleName());
            System.exit(-1);
        }

        /* catch (TranslaterException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Doit etre toujors enfin de catch
        }*/
    }
}
