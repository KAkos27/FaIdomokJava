package hu.szamalk.idomok;

public class MertaniHenger extends Idom {

    private static int hengerDarab = 0;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        MertaniHenger.hengerDarab++;
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    @Override
    public double terfogat() {
        return Math.pow(this.sugar, 2) * Math.PI * this.magassag;
    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
