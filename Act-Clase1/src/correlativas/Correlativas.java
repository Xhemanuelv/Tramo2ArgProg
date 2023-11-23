package correlativas;

import correlativas.entidades.Alumno;
import correlativas.entidades.Materia;

/**
 *
 * @author Emanuel Villarin
 */
public class Correlativas {

    public static void main(String[] args) {
        // Crear un alumno
        Alumno alumno = new Alumno(1, "Juan");

        // Crear algunas materias
        Materia mat1 = new Materia("Matemáticas");
        Materia mat2 = new Materia("Historia");
        Materia mat3 = new Materia("Física");
        Materia matCorrelativaAprobada = new Materia("Programación");
        Materia matCorrelativaDesaprobada = new Materia("Química");

        // Registrar correlativas para las materias
        matCorrelativaAprobada.agregarCorrelativa(mat1);
        matCorrelativaDesaprobada.agregarCorrelativa(mat3);

        // Incribir al alumno en 3 materias sin correlativas
        alumno.inscribirMateria(mat1);
        alumno.inscribirMateria(mat2);
        alumno.inscribirMateria(mat3);

        // Aprobar materias
        alumno.aprobarMateria(mat1);
        alumno.aprobarMateria(mat2);

        // Intentar inscribir al alumno en una materia con correlativa desaprobada y aprobada
        alumno.inscribirMateria(matCorrelativaAprobada);
        alumno.inscribirMateria(matCorrelativaDesaprobada);
        System.out.println(alumno.toString());
    }

}
