package hu.szamalk;

import hu.szamalk.idomok.FaIdom;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {

    private List<FaIdom> idomok;

    public FaIdomok() {
        idomok = new ArrayList<>();
    }

    public double osszSuly() {
        return 0;
    }

    public double osszGombSuly() {
        return 0;
    }

    public FaIdom minV() {
        return new FaIdom() {
            @Override
            public double terfogat() {
                return 0;
            }
        };
    }

    public FaIdom maxV() {
        return new FaIdom() {
            @Override
            public double terfogat() {
                return 0;
            }
        };
    }

    public void run() {
    }
}
