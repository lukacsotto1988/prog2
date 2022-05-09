package Tv;

public class Musorok {
    private final int datum;
    private final String nev;
    private int hossz;

    public int getDatum() {
        return datum;
    }

    public String getNev() {
        return nev;
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }

    public Musorok(int datum, String nev, int hossz) {
        this.datum = datum;
        this.nev = nev;
        this.hossz = hossz;
    }

    @Override
    public String toString() {
        return String.format("Nev: %s, datum: %d, hossz: %d", nev, datum, hossz);
    }

}
