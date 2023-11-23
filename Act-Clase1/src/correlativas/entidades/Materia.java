package correlativas.entidades;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Emanuel Villarin
 */
public class Materia {

    private String nombre;
    private Set<Materia> correlativas;

    public Materia() {
    }

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCorrelativa(Materia materia) {
        correlativas.add(materia);
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public void removerCorrelativa(Materia materia) {
        this.correlativas.remove(materia);
    }

}
