
import org.junit.jupiter.api.BeforeEach;
import com.emanuelvillarin.argprograma.act.clase4.Entity.Cancion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebasCancionTest {

    private Cancion theScientist;

    @BeforeEach
    public void setup() {
        theScientist = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
    }

    @Test
    public void pruebaCancionRecienLanzada() {
        assertEquals("🎵", theScientist.mostrarIcono());
        assertEquals("Coldplay - A Rush of Blood to the head - The Scientist", theScientist.mostrarLeyenda());
    }

    @Test
    public void pruebaCancionEnAuge() {
        reproducirCancion(theScientist, 2000);
        assertEquals("🚀", theScientist.mostrarIcono());
        // Asegurar que la leyenda es la correcta para el estado de "En auge"

    }

    @Test
    public void pruebaCancionBajaAugePorDislikes() {
        reproducirCancion(theScientist, 2000);
        darDislikes(theScientist, 5000);
        assertEquals("🎵", theScientist.mostrarIcono());
        // Asegurar que la leyenda es la correcta para el estado de "Normal" después del auge

    }

    @Test
    public void pruebaCancionEnTendencia() {
        reproducirCancion(theScientist, 60000);
        darLikes(theScientist, 25000);
        assertEquals("🔥", theScientist.mostrarIcono());
        // Asegurar que la leyenda es la correcta para el estado de "En tendencia"

    }

    @Test
    public void pruebaCancionVuelveNormal() {
        reproducirCancion(theScientist, 60000);
        darLikes(theScientist, 25000);
        theScientist.setReproducidaEnUltimas24Horas(false);
        assertEquals("🎵", theScientist.mostrarIcono());
        // Asegurar que la leyenda es la correcta para el estado de "Normal" nuevamente

    }

    private void reproducirCancion(Cancion cancion, int reproducciones) {
        for (int i = 0; i < reproducciones; i++) {
            cancion.reproducir();
        }
    }

    private void darLikes(Cancion cancion, int likes) {
        for (int i = 0; i < likes; i++) {
            cancion.incrementarLikes();
        }
    }

    private void darDislikes(Cancion cancion, int dislikes) {
        for (int i = 0; i < dislikes; i++) {
            cancion.incrementarDislikes();
        }
    }
}
