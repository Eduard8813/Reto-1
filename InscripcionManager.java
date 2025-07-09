import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class InscripcionManager {
    private Scanner scanner = new Scanner(System.in);
    private Gestorcursos gestorCursos = new Gestorcursos();
    private GestorUsuarios gestorUsuarios = new GestorUsuarios();
    private regitrarUsuario registrarUsuario = new regitrarUsuario();

    public void inscribirEstudianteEnCurso() {
        System.out.println("\n--- Inscripción de Estudiante en Curso ---");

        // 1. Seleccionar o registrar estudiante
        estudiantes estudianteSeleccionado = null;
        System.out.println("¿Desea registrar un nuevo estudiante (1) o seleccionar uno existente (2)?");
        int opcionEstudiante = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (opcionEstudiante == 1) {
            estudianteSeleccionado = registrarUsuario.registrar();
            if (estudianteSeleccionado == null) {
                System.out.println("No se pudo registrar el estudiante. Volviendo al menú principal.");
                return;
            }
        } else if (opcionEstudiante == 2) {
            List<estudiantes> listaEstudiantes = gestorUsuarios.cargarUsuarios();
            if (listaEstudiantes.isEmpty()) {
                System.out.println("No hay estudiantes registrados. Por favor, registre uno primero.");
                return;
            }
            gestorUsuarios.listarUsuariosDisponibles();
            System.out.print("Seleccione el número del estudiante: ");
            int seleccion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (seleccion > 0 && seleccion <= listaEstudiantes.size()) {
                estudianteSeleccionado = listaEstudiantes.get(seleccion - 1);
            } else {
                System.out.println("Selección de estudiante no válida.");
                return;
            }
        } else {
            System.out.println("Opción no válida. Volviendo al menú principal.");
            return;
        }

        // 2. Seleccionar curso
        List<cursos> listaCursos = gestorCursos.cargarCursos();
        if (listaCursos.isEmpty()) {
            System.out.println("No hay cursos disponibles para inscribir. Por favor, cree un curso primero.");
            return;
        }
        gestorCursos.listarCursosDisponibles();
        System.out.print("Seleccione el número del curso al que desea inscribir al estudiante: ");
        int seleccionCurso = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        cursos cursoSeleccionado = null;
        if (seleccionCurso > 0 && seleccionCurso <= listaCursos.size()) {
            cursoSeleccionado = listaCursos.get(seleccionCurso - 1);
        } else {
            System.out.println("Selección de curso no válida.");
            return;
        }

        // 3. Guardar la inscripción según la modalidad del curso
        String modalidad = cursoSeleccionado.getExtra();
        String archivoDestino;

        if (modalidad.equalsIgnoreCase("Presencial")) {
            archivoDestino = "inscripciones_presenciales.txt";
        } else if (modalidad.equalsIgnoreCase("Virtual")) {
            archivoDestino = "inscripciones_virtuales.txt";
        } else {
            System.out.println("Modalidad de curso no reconocida: " + modalidad + ". No se guardará la inscripción en un archivo específico.");
            return;
        }

        try (FileWriter writer = new FileWriter(archivoDestino, true)) {
            writer.write("Estudiante: " + estudianteSeleccionado.getNombre() +
                        " | Correo: " + estudianteSeleccionado.getCorreo() +
                        " | Código: " + estudianteSeleccionado.getCodigo() +
                        " | Curso: " + cursoSeleccionado.getNombreCurso() +
                        " | Modalidad: " + cursoSeleccionado.getExtra() + "\n");
            System.out.println("Inscripción guardada exitosamente en " + archivoDestino);
        } catch (IOException e) {
            System.out.println("Error al guardar la inscripción: " + e.getMessage());
        }
    }

    // Nuevo método para mostrar inscripciones por modalidad
    public void mostrarInscripcionesPorModalidad() {
        System.out.println("\n--- Mostrar Inscripciones ---");
        System.out.println("1. Inscripciones Presenciales");
        System.out.println("2. Inscripciones Virtuales");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        String archivoAMostrar = "";
        if (opcion == 1) {
            archivoAMostrar = "inscripciones_presenciales.txt";
        } else if (opcion == 2) {
            archivoAMostrar = "inscripciones_virtuales.txt";
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        System.out.println("\n--- Contenido de " + archivoAMostrar + " ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoAMostrar))) {
            String linea;
            if (!reader.ready()) { // Check if the file is empty
                System.out.println("El archivo " + archivoAMostrar + " está vacío o no existe.");
                return;
            }
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivoAMostrar + ": " + e.getMessage());
        }
        System.out.println("------------------------------------");
    }
}

