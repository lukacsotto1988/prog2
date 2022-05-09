package Tv;

public class Hirado extends AnyagokatTartalmazo {

    public Hirado(int datum, String nev, int hossz, int anyagSzam) {
        super(datum, nev, hossz, anyagSzam);
    }

    @Override
    public String toString() {
        return String.format("Hirado - %s - anyag szama: %d", super.toString(), getAnyagSzam());
    }

}
