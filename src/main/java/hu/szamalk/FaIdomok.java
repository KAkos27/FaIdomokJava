package hu.szamalk;

import hu.szamalk.idomok.FaIdom;
import hu.szamalk.idomok.Gomb;
import hu.szamalk.idomok.Hasab;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {

    private List<FaIdom> idomok;

    public FaIdomok() {
        idomok = new ArrayList<>();
        idomok.add(new Gomb(10));
        idomok.add(new Gomb(1));
        idomok.add(new Hasab(5, 5, 5));
        idomok.add(new Hasab(1, 1, 1));
        idomok.add(new Hasab(2, 3, 10));
        idomok.add(new Gomb(11));
    }

    public double osszSuly() {
        double suly = 0;
        for (FaIdom faIdom : idomok) {
            suly += faIdom.suly();
        }

        return suly;
    }

    public double osszGombSuly() {
        double suly = 0;
        for (FaIdom faIdom : idomok) {
            if (faIdom instanceof Gomb) {
                suly += faIdom.suly();
            }
        }

        return suly;
    }

    public FaIdom minV() {
        int m = 0;

        for (int i = 1; i < idomok.size(); i++) {
            if (idomok.get(i).terfogat() < idomok.get(m).terfogat()) {
                m = i;
            }
        }

        return idomok.get(m);
    }

    public FaIdom maxV() {
        int m = 1;

        for (int i = 1; i < idomok.size(); i++) {
            if (idomok.get(i).terfogat() > idomok.get(m).terfogat()) {
                m = i;
            }
        }

        return idomok.get(m);
    }

    public void run() {
        System.out.println("A programban használt idomok");

        for (FaIdom faIdom : idomok) {
            System.out.println(faIdom);
        }

        System.out.println("idomok összsúlya: " + this.osszSuly());
        System.out.println("gömbök összsúlya: " + this.osszGombSuly());
        System.out.println("min V: " + this.minV().terfogat());
        System.out.println("max V: " + this.maxV().terfogat());
    }
}
