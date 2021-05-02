package com.company;

public class Main {

    public static void main(String[] args) {
        OdtwarzaczWideo odtwarzacz;
        FabrykaOdtwarzaczy fabrykaOdtwarzaczy = new FabrykaOdtwarzaczy();
        odtwarzacz = fabrykaOdtwarzaczy.zwrocOdtwarzaczWideo("Sample.avi");

        if (odtwarzacz != null) {
            odtwarzacz.odtwarzaj("Sample.avi");
        }
    }
}

interface OdtwarzaczWideo {
    void odtwarzaj(String nazwaPliku);
}

class OdtwarzaczMP4 implements OdtwarzaczWideo {
    @Override
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("odtwarzaj format mp4 z pliku " + nazwaPliku );
    }
}

class OdtwarzaczAVI implements OdtwarzaczWideo {
    @Override
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("odtwarzaj format avi z pliku " + nazwaPliku);
    }
}

class FabrykaOdtwarzaczy {

    OdtwarzaczWideo zwrocOdtwarzaczWideo(String nazwaPliku) {

        if (nazwaPliku.endsWith(".mp4")) {
            return new OdtwarzaczMP4();
        }
        else if (nazwaPliku.endsWith(".avi")) {
            return new OdtwarzaczAVI();
        }
        return null;
    }
}