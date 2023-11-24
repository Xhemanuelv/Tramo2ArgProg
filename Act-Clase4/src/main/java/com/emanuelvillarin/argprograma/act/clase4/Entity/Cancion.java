package com.emanuelvillarin.argprograma.act.clase4.Entity;

import com.emanuelvillarin.argprograma.act.clase4.Interface.EstadoCancion;
import com.emanuelvillarin.argprograma.act.clase4.Interface.Impl.EstadoEnAuge;
import com.emanuelvillarin.argprograma.act.clase4.Interface.Impl.EstadoEnTendencia;
import com.emanuelvillarin.argprograma.act.clase4.Interface.Impl.EstadoNormal;

/**
 *
 * @author Emanuel Villarin
 */
public class Cancion {

    private String titulo;
    private String artista;
    private String album;
    private int anioAlbum;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private boolean reproducidaEnUltimas24Horas;
    private EstadoCancion estado;

    public Cancion(String titulo, String artista, String album, int anioAlbum) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.anioAlbum = anioAlbum;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.reproducidaEnUltimas24Horas = false;
        this.estado = new EstadoNormal();
    }

    public void reproducir() {
        this.estado = this.estado.reproducir(this);
    }

    public String mostrarIcono() {
        return this.estado.mostrarIcono();
    }

    public String mostrarLeyenda() {
        return this.estado.mostrarLeyenda(this);
    }

    // Métodos para incrementar reproducciones, likes y dislikes
    public void incrementarReproducciones() {
        this.reproducciones++;
        if (!this.reproducidaEnUltimas24Horas) {
            this.reproducidaEnUltimas24Horas = true;
        }else{
            verificarCambiarEstado();
        }
    }

    public void incrementarLikes() {
        this.likes++;
        verificarCambiarEstado();
    }

    public void incrementarDislikes() {
        this.dislikes++;
        verificarCambiarEstado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnioAlbum() {
        return anioAlbum;
    }

    public void setAnioAlbum(int anioAlbum) {
        this.anioAlbum = anioAlbum;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public boolean isReproducidaEnUltimas24Horas() {
        return reproducidaEnUltimas24Horas;
    }

    public void setReproducidaEnUltimas24Horas(boolean reproducidaEnUltimas24Horas) {
        this.reproducidaEnUltimas24Horas = reproducidaEnUltimas24Horas;
    }

    public EstadoCancion getEstado() {
        return estado;
    }

    public void setEstado(EstadoCancion estado) {
        this.estado = estado;
    }

    private void verificarCambiarEstado() {
        if (likes > 20000 && reproducciones > 50000 && estado instanceof EstadoEnAuge) {
            estado = new EstadoEnTendencia();
        } else if (dislikes > 5000 && estado instanceof EstadoEnAuge) {
            estado = new EstadoNormal();
        } else if (!reproducidaEnUltimas24Horas && estado instanceof EstadoEnAuge) {
            estado = new EstadoNormal();
        }
    }

}
