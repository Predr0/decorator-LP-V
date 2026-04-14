package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerMusicaTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        PlayerMusica player1 = PlayerMusica.getInstance();
        PlayerMusica player2 = PlayerMusica.getInstance();

        assertSame(player1, player2);
    }

    @Test
    void deveCompartilharEstadoEntreInstancias() {
        PlayerMusica p1 = PlayerMusica.getInstance();
        PlayerMusica p2 = PlayerMusica.getInstance();

        // Altero a música no p1
        p1.setMusicaAtual("Não Uso Sapato - CBJR");

        assertEquals("Não Uso Sapato - CBJR", p2.getMusicaAtual());
    }

    @Test
    void deveManterVolumeSincronizado() {
        PlayerMusica p1 = PlayerMusica.getInstance();
        p1.setVolume(75);

        assertEquals(75, PlayerMusica.getInstance().getVolume());
    }
}