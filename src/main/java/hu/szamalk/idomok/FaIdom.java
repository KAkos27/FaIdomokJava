package hu.szamalk.idomok;

public abstract class FaIdom {

    private static double fajsuly = 0.8;

    public abstract double terfogat();

    public double suly() {
        return this.terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{}";
    }
}
