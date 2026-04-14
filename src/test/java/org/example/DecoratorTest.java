package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void deveReproduzirMusicaSimplesSemEfeitos() {
        Musica musica = new MusicaComum();
        assertEquals("Tocando melodia base", musica.reproduzir());
    }

    @Test
    void deveAdicionarBassBoostCorretamente() {
        Musica musica = new MusicaComum();
        musica = new BassBoost(musica);

        String resultado = musica.reproduzir();
        assertTrue(resultado.contains("Tocando melodia base"));
        assertTrue(resultado.contains("[BASS BOOST ATIVO]"));
    }

    @Test
    void deveAcumularMultiplosEfeitos() {
        Musica musicaCompleta = new Reverb(new BassBoost(new MusicaComum()));

        String resultado = musicaCompleta.reproduzir();

        assertTrue(resultado.contains("Tocando melodia base"));
        assertTrue(resultado.contains("[BASS BOOST ATIVO]"));
        assertTrue(resultado.contains("[EFEITO REVERB]"));
    }
}