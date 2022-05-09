package Tv;

public abstract class AnyagokatTartalmazo extends Musorok implements IAnyagokatTartalmazo {

    private final int anyagszam;

    public int getAnyagSzam() {
        return anyagszam;
    }

    public AnyagokatTartalmazo(int datum, String nev, int hossz, int anyagszam) {
        super(datum, nev, hossz);
        this.anyagszam = anyagszam;
    }

}
