package com.j4ltechnologies.formation.javase.primitifs;

import java.math.BigInteger;

/**
 * Classe TypeEntier, créée le 17/04/2021 à 16:25
 *
 * @author Joachim Zadi
 * @version 1.0 du 17/04/2021
 */
public class TypeEntier {
    public static void main(String[] args) {
        System.out.println("==== Type byte ====");

        /*
         * Le type byte est un entier signé et codé sur 1 octet soit 8-bits Sa valeur
         * par defaut est 0
         */
        byte unByte = -56;
        System.out.printf("unByte = %s%n", unByte);
        System.out.printf("byteMin = %s%n", Byte.MIN_VALUE);
        System.out.printf("byteMax = %s%n", Byte.MAX_VALUE);

        System.out.println("\n==== Type short ====\n");

        /*
         * Le type short est un entier signé et codé sur 2 octets soit 16-bits Sa valeur
         * par defaut est 0
         */
        short unShort = -2698;
        System.out.printf("unShort = %s%n", unShort);
        System.out.printf("shortMin = %s%n", Short.MIN_VALUE);
        System.out.printf("shortMax = %s%n", Short.MAX_VALUE);

        System.out.println("\n==== Type int ====\n");

        /*
         * Le type int est un entier signé et codé sur 4 octets soit 32-bits Sa valeur
         * par defaut est 0
         */
        int unInt = -2698;
        System.out.printf("unInt = %s%n", unInt);
        System.out.printf("intMin = %s%n", Integer.MIN_VALUE);
        System.out.printf("intMax = %s%n", Integer.MAX_VALUE);

        System.out.println("\n==== Type long ====\n");

        /*
         * Le type long est un entier signé et codé sur 8 octets soit 64-bits Sa valeur
         * par defaut est 0
         */
        long unLong = -269878965;
        System.out.printf("unLong = %s%n", unLong);
        System.out.printf("longMin = %s%n", Long.MIN_VALUE);
        System.out.printf("longMax = %s%n", Long.MAX_VALUE);

        unLong = 12583698547L;

        /*
         * Cas partibulier des entiers hors limites du primitif
         */
        BigInteger bi1, bi2;
        bi1 = new BigInteger("7895");
        bi2 = new BigInteger("8412");
        System.out.printf("bi1 = %s%n", bi1);
        System.out.printf("bi2 = %s%n", bi2);
        System.out.printf("bi1 + bi2 = %s%n", bi1.add(bi2));

        //Attention, la division par zero n'est pas autoriqée avec les entiers
        System.out.printf("divideByZero = %s%n", unInt/0);
    }
}
