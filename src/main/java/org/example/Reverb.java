package org.example;

public class Reverb extends MusicaDecorator {
    public Reverb(Musica musica) { super(musica); }

    @Override
    public String reproduzir() {
        return super.reproduzir() + " + [EFEITO REVERB]";
    }
}