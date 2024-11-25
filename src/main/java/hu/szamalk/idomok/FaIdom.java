package hu.szamalk.idomok;

public abstract class FaIdom extends Idom {

    private static double fajsuly = 0.8;

    public double suly() {
        return this.terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{}";
    }
}
