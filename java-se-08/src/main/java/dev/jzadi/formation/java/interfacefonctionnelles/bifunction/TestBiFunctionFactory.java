package dev.jzadi.formation.java.interfacefonctionnelles.bifunction;

import java.util.function.BiFunction;

/**
 * Classe TestBiFunctionFactory, créée le 05/05/2021 à 15:30
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestBiFunctionFactory {
    public static void main(String[] args) {

        // Cet exemple utilise une BiFunction pour créer un objet
        // Elle agit comme un modèle Factory.
        Geo geo = factory("40.741895", "-73.989308", Geo::new);
        System.out.println(geo);
    }

    public static <R extends Geo> R factory(String lattitude, String longitude, BiFunction<String, String, R> biFunction) {
        return biFunction.apply(lattitude, longitude);
    }
}

class Geo {
    String lattitude;
    String longitude;

    public Geo(String lattitude, String longitude) {
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Geo[lat: '" + lattitude + "', long: '" + longitude + "' ]";
    }
}


