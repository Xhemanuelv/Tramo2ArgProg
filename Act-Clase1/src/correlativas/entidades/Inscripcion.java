package correlativas.entidades;

/**
 *
 * @author Emanuel Villarin
 */
public class Inscripcion {

    private Alumno alumno;
    private Materia materia;
    private boolean aprobada;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.aprobada = false;// Por defecto, la inscripción no está aprobada
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public boolean estaAprobada() {
        return aprobada;
    }

    public void aprobar() {
        this.aprobada = true;
    }

}
