package act.clase3.Service;

import act.clase3.Interface.Transformador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public class StringsMayusculas {

    public List<String> convertirAMayusculas(List<String> strings, Transformador transformador) {
        List<String> stringsMayusculas = new ArrayList<>();

        for (String s : strings) {
            String transformada = transformador.transformar(s);
            stringsMayusculas.add(transformada);
        }

        return stringsMayusculas;

    }
}
