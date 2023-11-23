package act.clase3.Service;

import act.clase3.Interface.Concatenador;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Emanuel Villarin
 */
public class ConcatenarPalabras {

    public String concatenarPalabrasMasLargas(List<String> strings, int n, Concatenador concatenador) {
        Predicate<String> filtro = s -> s.length() > n;
        return concatenador.concatenar(strings, filtro);

    }
}
