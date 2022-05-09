package Tv;

public class Studio extends Musorok {
    private final String vendegNeve;

    public String getVendegNeve() {
        return vendegNeve;
    }

    public Studio(int datum, String nev, int hossz, String vendegNeve) {
        super(datum, nev, hossz);
        this.vendegNeve = vendegNeve;
    }

    @Override
    public String toString() {
        return String.format("Studio - %s - vendeg neve: %s", super.toString(), vendegNeve);
    }
}
