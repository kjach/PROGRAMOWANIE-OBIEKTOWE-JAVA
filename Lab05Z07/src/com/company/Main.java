package com.company;

public class Main {

    public static void main(String[] args) {
	    SystemAudioSpecyficzny systemAudioSpecyficzny = new SystemAudioSpecyficzny();
	    systemAudioSpecyficzny.odtwarzaj();
	    systemAudioSpecyficzny.nagrywaj();
	    systemAudioSpecyficzny.odtwarzajRadio();
	    systemAudioSpecyficzny.wylacz();
    }
}

interface OdtwarzaczAudio {
    void odtwarzaj();
}

interface NagrywarkaAudio {
    void nagrywaj();
}

interface OdtwarzaczRadio {
    void odtwarzajRadio();
}

interface SystemAudio extends OdtwarzaczAudio, NagrywarkaAudio {

}

abstract class SystemAudioPodstawowy implements SystemAudio, OdtwarzaczRadio {
    @Override
    public void odtwarzaj() {
        System.out.println("odtwarzaj audio");
    }

    @Override
    public void nagrywaj() {
        System.out.println("nagrywaj audio");
    }
}

class SystemAudioSpecyficzny extends SystemAudioPodstawowy {
    @Override
    public void odtwarzajRadio() {
        System.out.println("odtwarzaj radio");
    }

    public void wylacz() {
        System.out.println("Wyłącz");
    }
}