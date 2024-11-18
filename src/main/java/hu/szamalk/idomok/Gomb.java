package hu.szamalk.idomok;

public class Gomb extends FaIdom {

    private final double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return 0;
    }

    @Override
    public String toString() {
        return "Gomb{" +
                "Sugar=" + sugar +
                '}';
    }
}
