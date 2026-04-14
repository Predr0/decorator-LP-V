package org.example;

public class Main {
    public static void main(String[] args) {
        Musica musicaSimples = new MusicaComum();
        System.out.println("Normal: " + musicaSimples.reproduzir());

        Musica musicaComGrave = new BassBoost(musicaSimples);
        System.out.println("Com Grave: " + musicaComGrave.reproduzir());

        Musica musicaCombo = new Reverb(new BassBoost(new MusicaComum()));
        System.out.println("Combo Luxo: " + musicaCombo.reproduzir());
    }
}