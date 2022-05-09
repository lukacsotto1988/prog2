package Tv;

public class Magazin extends AnyagokatTartalmazo {
    private final String vendegNeve;

    public String getVendegNeve() {
        return vendegNeve;
    }

    public Magazin(int datum, String nev, int hossz, int anyagszam, String vendegNeve) {
        super(datum, nev, hossz, anyagszam);
        this.vendegNeve = vendegNeve;
    }

    @Override
    public String toString() {
        return String.format("Magazin - %s - anyag szama: %d, vendeg neve: %s", super.toString(), getAnyagSzam(), getVendegNeve());
    }

}
