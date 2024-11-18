package hu.szamalk.idomok;

public class Gomb extends FaIdom {

    private final double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return (4 * Math.pow(sugar, 3) * Math.PI) / 3;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " <-- Gomb{" +
                "Sugar=" + sugar +
                '}';
    }
}
