package correlativas.entidades;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Emanuel Villarin
 */
public class Alumno {

    private int id_dni;
    private String nombre;
    private Set<Inscripcion> inscripciones;

    public Alumno() {
    }

    public Alumno(int id_dni, String nombre) {
        this.id_dni = id_dni;
        this.nombre = nombre;
        this.inscripciones = new HashSet<>();
    }

    public int getId_dni() {
        return id_dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void inscribirMateria(Materia materia) {
        boolean puedeInscribirse = true;

        // Verificar correlativas
        for (Materia correlativa : materia.getCorrelativas()) {
            if (!tieneMateriaAprobada(correlativa)) {
                puedeInscribirse = false;
                break;
            }

        }

        // Si puede inscribirse, crear inscripción
        if (puedeInscribirse) {
            Inscripcion nuevaInscripcion = new Inscripcion(this, materia);
            inscripciones.add(nuevaInscripcion);
            System.out.println("Inscripcion exitosa para: " + materia.getNombre());
        } else {
            System.out.println("No cumple con las correlatividades para inscribirse a " + materia.getNombre());
        }
    }

    private boolean tieneMateriaAprobada(Materia materia) {
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getMateria().equals(materia) && inscripcion.estaAprobada()) {
                return true;
            }
        }
        return false;
    }

    public void aprobarMateria(Materia materia) {
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getMateria().equals(materia)) {
                inscripcion.aprobar();
                break;
            }
        }
    }

    //Metodo agregado para visualizacion, no incluido en diagrama clase
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno: ").append(nombre).append("\n");
        sb.append("Inscripciones:\n");

        for (Inscripcion inscripcion : inscripciones) {
            sb.append("- Materia: ").append(inscripcion.getMateria().getNombre());
            sb.append(", Aprobada: ").append(inscripcion.estaAprobada() ? "Sí" : "No").append("\n");
        }

        return sb.toString();
    }

}
