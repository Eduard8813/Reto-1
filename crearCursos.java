//Controlar de excepciones y manejo de entradas del usuario para registrar un curso
import java.util.Scanner;

public class crearCursos {
    public cursos registrarCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del curso: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripción del curso: ");
        String descripcion = scanner.nextLine();

        System.out.print("Duración (meses): ");
        String duracion = scanner.nextLine();

        System.out.print("Fecha de inicio (dd/mm/yyyy): ");
        String inicio = scanner.nextLine();

        System.out.print("Fecha de fin (dd/mm/yyyy): ");
        String fin = scanner.nextLine();
        
        System.out.print("Modabilidad: ");
        String extra = scanner.nextLine();
        
        return new cursos(nombre, descripcion, duracion, inicio, fin, extra);
    }
}
