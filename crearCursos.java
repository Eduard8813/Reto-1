import java.util.Scanner;

public class crearCursos {

    Scanner scanner = new Scanner(System.in);
    String nombreCurso = scanner.nextLine();
    String descripcionCurso = scanner.nextLine();
    String fechaInicio = scanner.nextLine();
    String fechaFin = scanner.nextLine();

    public crearCursos(String nombreCurso, String descripcion, String fechaInicio, String fechaFin) {
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }
    public String getFechaFin() {
        return fechaFin;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }

    public static void inicio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de cursos");
        System.out.println("Por favor, ingrese los datos del curso a crear");
        System.out.println("Nombre del curso:");
        String nombreCurso = scanner.nextLine();
        System.out.println("Descripción del curso:");
        String descripcionCurso = scanner.nextLine();
        System.out.println("Fecha de inicio del curso (dd/mm/yyyy):");
        String fechaInicio = scanner.nextLine();
        System.out.println("Fecha de finalización del curso (dd/mm/yyyy):");
        String fechaFin = scanner.nextLine();
        crearCursos curso = new crearCursos(nombreCurso, descripcionCurso, fechaInicio, fechaFin);
        System.out.println("Curso creado exitosamente:");

    }

    public static void fin(){
        System.out.println("Curso creado exitosamente");
    }
}
