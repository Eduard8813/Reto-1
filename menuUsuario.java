// FileName: MultipleFiles/menuUsuario.java
import java.util.Scanner;

public class menuUsuario {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("--------------------------------------");
        System.out.println("Bienvenido al sistema de gestión de usuarios y cursos");
        System.out.println("--------------------------------------");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar Estudiante");
        System.out.println("2. Crear Curso");
        System.out.println("3. Usuarios Registrados");
        System.out.println("4. Cursos Registrados"); 
        System.out.println("5. Inscribir Estudiante en Curso"); 
        System.out.println("6. Ver Inscripciones por Modalidad"); 
        System.out.println("7. Salir");

        int opcion = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea después de leer el entero

        switch (opcion) {
            case 1:
                regitrarUsuario registro = new regitrarUsuario();
                registro.registrar();
                mostrarMenu();
                break;
            case 2:
                crearCursos registry = new crearCursos();
                cursos curso = registry.registrarCurso();
                Gestorcursos gestor = new Gestorcursos();
                gestor.guardarCurso(curso);
                mostrarMenu();
                break;
            case 3:
                GestorUsuarios visorUsuarios = new GestorUsuarios();
                visorUsuarios.mostrarUsuario();
                mostrarMenu();
                break;
            case 4:
                Gestorcursos gestorCursos = new Gestorcursos();
                gestorCursos.listarCursosDisponibles();
                mostrarMenu();
                break;
            case 5: 
                InscripcionManager inscripcionManager = new InscripcionManager();
                inscripcionManager.inscribirEstudianteEnCurso();
                mostrarMenu();
                break;
            case 6: 
                InscripcionManager verInscripciones = new InscripcionManager();
                verInscripciones.mostrarInscripcionesPorModalidad();
                mostrarMenu();
                break;
            case 7:
                System.out.println("Saliendo del sistema...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                mostrarMenu();
                break;
            }
    }
}
