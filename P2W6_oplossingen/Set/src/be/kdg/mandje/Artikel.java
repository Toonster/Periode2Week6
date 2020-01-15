package be.kdg.mandje;

import java.util.Objects;

/**
 * De klasse Artikel bevat twee attributen,
 * de naam van het artikel (type String) en de prijs in euro (type double).
 */
public class Artikel implements Comparable<Artikel> {
    private String naam;
    private double prijs;


    public Artikel(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }


    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    // voeg hier het nodige toe.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikel artikel = (Artikel) o;
        return Objects.equals(naam, artikel.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }

    @Override
    public int compareTo(Artikel anderArtikel) {
        return this.naam.compareTo(anderArtikel.naam);
    }

    @Override
    public String toString() {
        return String.format("%-16s €%4.2f", naam, prijs);
    }
}

