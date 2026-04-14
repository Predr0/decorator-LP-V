package org.example;

public class BassBoost extends MusicaDecorator {
    public BassBoost(Musica musica) { super(musica); }

    @Override
    public String reproduzir() {
        return super.reproduzir() + " + [BASS BOOST ATIVO]";
    }
}