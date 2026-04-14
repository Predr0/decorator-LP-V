package org.example;

public abstract class MusicaDecorator implements Musica {
    protected Musica musicaDecorada;

    public MusicaDecorator(Musica musica) {
        this.musicaDecorada = musica;
    }

    @Override
    public String reproduzir() {
        return musicaDecorada.reproduzir();
    }
}