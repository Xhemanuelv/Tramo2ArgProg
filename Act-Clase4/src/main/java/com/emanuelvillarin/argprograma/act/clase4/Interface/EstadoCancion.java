package com.emanuelvillarin.argprograma.act.clase4.Interface;

import com.emanuelvillarin.argprograma.act.clase4.Entity.Cancion;

/**
 *
 * @author Emanuel Villarin
 */
public interface EstadoCancion {

    String mostrarIcono();

    String mostrarLeyenda(Cancion cancion);

    EstadoCancion reproducir(Cancion cancion);

    EstadoCancion like(Cancion cancion);

    EstadoCancion dislike(Cancion cancion);
}
