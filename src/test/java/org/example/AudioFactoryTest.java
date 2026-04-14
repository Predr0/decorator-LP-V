package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AudioFactoryTest {

    @Test
    void deveCriarFamiliaLocalCorretamente() {
        AudioFactory fabrica = new LocalAudioFactory();

        Player player = fabrica.criarPlayer();
        Equalizador eq = fabrica.criarEqualizador();

        assertTrue(player instanceof PlayerMP3);
        assertTrue(eq instanceof EqualizadorSimples);
    }

    @Test
    void deveCriarFamiliaStreamingCorretamente() {
        AudioFactory fabrica = new StreamingAudioFactory();

        Player player = fabrica.criarPlayer();
        Equalizador eq = fabrica.criarEqualizador();

        assertTrue(player instanceof PlayerStreaming);
        assertTrue(eq instanceof EqualizadorAvancado);
    }
}