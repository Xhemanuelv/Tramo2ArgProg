package act.clase2.Service;

import act.clase2.Interface.Transformador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public class TransformadorStrings {

    public List<String> transformarLista(List<String> strings, Transformador transformador) {
        List<String> stringsTransformadas = new ArrayList<>();

        for (String s : strings) {
            String transformada = transformador.transformar(s);
            stringsTransformadas.add(transformada);
        }

        return stringsTransformadas;

    }
}
