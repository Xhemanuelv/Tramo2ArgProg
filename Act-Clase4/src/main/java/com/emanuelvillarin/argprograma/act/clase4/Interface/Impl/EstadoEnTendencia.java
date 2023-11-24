package com.emanuelvillarin.argprograma.act.clase4.Interface.Impl;

import com.emanuelvillarin.argprograma.act.clase4.Entity.Cancion;
import com.emanuelvillarin.argprograma.act.clase4.Interface.EstadoCancion;

/**
 *
 * @author Emanuel Villarin
 */
public class EstadoEnTendencia implements EstadoCancion {

    @Override
    public String mostrarIcono() {
//        return "fuego";
        return "🔥";
    }

    @Override
    public String mostrarLeyenda(Cancion cancion) {
        return cancion.getTitulo() + " - " + cancion.getArtista() + " (" + cancion.getAlbum() + " - " + cancion.getAnioAlbum() + ")";
    }

    @Override
    public EstadoCancion reproducir(Cancion cancion) {
        cancion.incrementarReproducciones();
        if (!cancion.isReproducidaEnUltimas24Horas()) {
            return new EstadoNormal();
        }
        return this;
    }

    @Override
    public EstadoCancion like(Cancion cancion) {
        cancion.incrementarLikes();
        return this;
    }

    @Override
    public EstadoCancion dislike(Cancion cancion) {
        cancion.incrementarDislikes();
        return this;
    }
}
