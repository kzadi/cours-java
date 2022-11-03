package dev.jzadi.formation.javase.conversions;

/**
 * Classe Conversion, créée le 17/04/2021 à 21:01
 *
 * @author Joachim Zadi
 * @version 1.0 du 17/04/2021
 */
public class Conversion {
    public static void main(String[] args) {
        byte unByte = 45;
        int unInt, grandInt;

        System.out.printf("unByte = %s%n", unByte);

        unInt = 45;
        System.out.printf("unInt = %s%n", unInt);

        unInt = unByte;//Conversion implicite
        System.out.printf("unInt = %s%n", unInt);

        unByte = (byte) unInt;
        System.out.printf("unByte = %s%n", unByte);

        grandInt = 456;//Conversion explicite
        unByte = (byte) grandInt;
        System.out.printf("unByte = %s%n", unByte);

        byte b = 25;
        //b = b + 1; //==> Ne compile pas: b+1 est de type int, ne peut etre affecté à un type byte
        b += 1; //==> Compile
    }
}
