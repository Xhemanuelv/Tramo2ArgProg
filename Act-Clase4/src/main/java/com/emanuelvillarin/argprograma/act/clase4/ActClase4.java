package com.emanuelvillarin.argprograma.act.clase4;

import com.emanuelvillarin.argprograma.act.clase4.Entity.Cancion;

/**
 *
 * @author Emanuel Villarin
 */
public class ActClase4 {

    public static void main(String[] args) {
        // Creación de la canción "The Scientist"
        Cancion theScientist = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);

        // Caso de prueba 1: Canción recién lanzada (popularidad normal)
        System.out.println("Caso de prueba 1:");
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());
        System.out.println();

        // Caso de prueba 2: Canción en auge por superar el mínimo de reproducciones esperadas
        System.out.println("Caso de prueba 2:");
        reproducirCancion(theScientist, 2000); // Simulación de reproducciones
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());
        System.out.println();

        // Caso de prueba 3: Canción baja del auge por tener muchos dislikes
        System.out.println("Caso de prueba 3:");
        darDislikes(theScientist, 5000); // Simulación de dislikes superiores al límite
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());
        System.out.println();

        // Caso de prueba 4: Canción es tendencia por récord de reproducciones y likes
        System.out.println("Caso de prueba 4:");
        reproducirCancion(theScientist, 60000); // Simulación de muchas reproducciones
        darLikes(theScientist, 25000); // Simulación de muchos likes
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());
        System.out.println();

        // Caso de prueba 5: Canción era tendencia pero vuelve a ser normal por no ser escuchada en las últimas horas
        System.out.println("Caso de prueba 5:");
        theScientist.setReproducidaEnUltimas24Horas(false); // Simulación de no haber sido reproducida
        System.out.println("Icono: " + theScientist.mostrarIcono());
        System.out.println("Leyenda: " + theScientist.mostrarLeyenda());
        System.out.println();
    }

    // Métodos de simulación para incrementar reproducciones, likes y dislikes
    private static void reproducirCancion(Cancion cancion, int reproducciones) {
        for (int i = 0; i < reproducciones; i++) {
            cancion.reproducir();
        }
    }

    private static void darLikes(Cancion cancion, int likes) {
        for (int i = 0; i < likes; i++) {
            cancion.incrementarLikes();
        }
    }

    private static void darDislikes(Cancion cancion, int dislikes) {
        for (int i = 0; i < dislikes; i++) {
            cancion.incrementarDislikes();
        }
    }
}
