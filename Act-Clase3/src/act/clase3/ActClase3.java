package act.clase3;

import act.clase3.Interface.Concatenador;
import act.clase3.Service.ConcatenarPalabras;
import act.clase3.Service.StringsMayusculas;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Emanuel Villarin
 */
public class ActClase3 {

    public static void main(String[] args) {

        StringsMayusculas mayusculasStrings = new StringsMayusculas();
        ConcatenarPalabras concatenarPalabras = new ConcatenarPalabras();

        List<String> listaOriginal = List.of("buen", "dia", "mundo");

        List<String> listaMayusculas = mayusculasStrings.convertirAMayusculas(listaOriginal, s -> s.toUpperCase());

        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista en mayusculas: " + listaMayusculas);
        System.out.println("");
        List<String> listaPalabras = List.of("hello", "world", "java", "programming", "language");

        int longitudMinima = 4;

        Concatenador concatenadorPalabras = (strings, filtro)
                -> strings.stream()
                        .filter(filtro)
                        .collect(Collectors.joining(", "));

        String palabrasConcatenadas = concatenarPalabras.concatenarPalabrasMasLargas(listaPalabras, longitudMinima, concatenadorPalabras);

        System.out.println("Palabras con mas de " + longitudMinima + " caracteres: " + palabrasConcatenadas);
    }

}
