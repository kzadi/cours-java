package com.j4ltechnologies.formation.javase.exceptions.classes;

import com.j4ltechnologies.formation.javase.exceptions.PointException;

/**
 * Classe Point, créée le 21/04/2021 à 15:41
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) throws PointException.Constructeur /*PointConstructException*/ {
        if (x < 0 || y < 0) {
            //Lance une exception ou declenche une rupture de sequence
            //throw new PointConstructException("Attention x et y doivent etre positifs");
            throw new PointException.Constructeur("Attention x et y doivent etre positifs");
        }
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void translater(double dx, double dy) throws PointException.Translater /*TranslaterException*/ {
        if ((x + dx) < 0 || (y + dy) < 0) {
            //throw new TranslaterException("Debordement de zone !!!");
            throw new PointException.Translater("Debordement de zone !!!");
        }
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return String.format("Point[x: %s, y: %s]", x, y);
    }
}
