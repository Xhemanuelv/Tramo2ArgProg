package com.emanuelvillarin.argprograma.act.clase4.Interface.Impl;

import com.emanuelvillarin.argprograma.act.clase4.Entity.Cancion;
import com.emanuelvillarin.argprograma.act.clase4.Interface.EstadoCancion;

/**
 *
 * @author Emanuel Villarin
 */
public class EstadoNormal implements EstadoCancion {

    @Override
    public String mostrarIcono() {
//        return "nota";
        return "🎵";
    }

    @Override
    public String mostrarLeyenda(Cancion cancion) {
        return cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getTitulo();
    }

    @Override
    public EstadoCancion reproducir(Cancion cancion) {
        cancion.incrementarReproducciones();
        if (cancion.getReproducciones() > 1000) {
            return new EstadoEnAuge();
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
        if (cancion.getDislikes() >= 5000) {
            return new EstadoNormal();
        }
        return this;
    }
}
