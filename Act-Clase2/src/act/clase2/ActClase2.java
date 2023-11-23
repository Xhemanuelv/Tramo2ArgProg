package act.clase2;

import act.clase2.Service.TransformadorStrings;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public class ActClase2 {

    public static void main(String[] args) {
        TransformadorStrings transformadorStrings = new TransformadorStrings();

        List<String> listaOriginal = List.of("hola", "que", "tal");

        // Utilizando una expresión lambda para transformar a mayúsculas
        List<String> listaTransformada = transformadorStrings.transformarLista(listaOriginal, s -> s.toUpperCase());

        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista transformada: " + listaTransformada);
    }

}
