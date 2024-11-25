package hu.szamalk;

import hu.szamalk.idomok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Alakzatok {

    private List<Idom> idomok;
    private HashMap<Double, Integer> fajsulyok;

    public Alakzatok() {
        idomok = new ArrayList<>();
        fajsulyok = new HashMap<>();

        idomok.add(new Gomb(1));
        idomok.add(new Gomb(10));
        idomok.add(new Gomb(11));

        idomok.add(new Hasab(1, 1, 1));
        idomok.add(new Hasab(5, 5, 5));
        idomok.add(new Hasab(2, 3, 10));

        idomok.add(new TomorHenger(1, 1, 1));
        idomok.add(new TomorHenger(4, 5, 4));

        idomok.add(new LyukasHenger(1, 1, 1, 1));
        idomok.add(new LyukasHenger(4, 5, 3, 4));
    }

    public void run() {
        System.out.println("A programban használt idomok:");

        for (Idom idom : idomok) {
            System.out.println(idom);
        }

        System.out.println("Faidomok térfogatia, fajsúlyai:");

        for (Idom idom : idomok) {

            if (idom instanceof FaIdom) {
                double fs = ((FaIdom) idom).suly() / idom.terfogat();
                System.out.println("V: " + idom.terfogat() + " FS: " + fs);

                if (!fajsulyok.containsKey(fs)) {
                    fajsulyok.put(fs, 1);
                } else {
                    int aktSzam = fajsulyok.get(fs);
                    fajsulyok.remove(fs);
                    fajsulyok.put(fs, ++aktSzam);
                }
            }

            if (idom instanceof MertaniHenger) {
                String szoveg = "V: " + idom.terfogat();
                if (idom instanceof TomorHenger) {
                    double fs = ((TomorHenger) idom).getFajsuly();
                    szoveg += " FS: " + fs;

                    if (!fajsulyok.containsKey(fs)) {
                        fajsulyok.put(fs, 1);
                    } else {
                        int aktSzam = fajsulyok.get(fs);
                        fajsulyok.remove(fs);
                        fajsulyok.put(fs, ++aktSzam);
                    }
                }
                System.out.println(szoveg);
            }
        }

        System.out.println(fajsulyok);
    }
}
