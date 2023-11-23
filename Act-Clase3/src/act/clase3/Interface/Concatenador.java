package act.clase3.Interface;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Emanuel Villarin
 */
@FunctionalInterface
public interface Concatenador {

    String concatenar(List<String> strings, Predicate<String> filtro);
}
