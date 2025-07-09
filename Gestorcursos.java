import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gestorcursos {
    public void guardarCurso(cursos curso) {
        try (FileWriter writer = new FileWriter("cursos.txt", true)) {
            writer.write(curso.getDatos() + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar el curso: " + e.getMessage());
        }
    }

    public void mostrarCurso(cursos curso) {
        System.out.println(curso.getDatos());
    }

    public List<cursos> cargarCursos() {
        List<cursos> listaCursos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("cursos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                
                System.out.println("Leyendo lineas " + linea);
                String[] partes = linea.split(" \\| ");
                System.out.println("Número de partes: " + partes.length);
                for (int i = 0; i < partes.length; i++) {
                    System.out.println("Parte " + i + ": " + partes[i]); 
                }
                if (partes.length >= 6) {
                    String nombre = partes[0].replace("Nombre: ", "").trim();
                    String descripcion = partes[1].replace("Descripción: ", "").trim();
                    String duracion = partes[2].replace("Duración: ", "").replace(" meses", "").trim();
                    String inicio = partes[3].replace("Inicio: ", "").trim();
                    String fin = partes[4].replace("Fin: ", "").trim();
                    String modalidad = partes[5].replace("Modalidad: ", "").replace(" |", "").trim();
                    
                    listaCursos.add(new cursos(nombre, descripcion, duracion, inicio, fin, modalidad));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los cursos: " + e.getMessage());
        }
        return listaCursos;
    }

    public void listarCursosDisponibles() {
        List<cursos> cursosDisponibles = cargarCursos();
        if (cursosDisponibles.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        System.out.println("\n--- Cursos Disponibles ---");
        for (int i = 0; i < cursosDisponibles.size(); i++) {
            cursos curso = cursosDisponibles.get(i);
            System.out.println((i + 1) + ". " + curso.getNombreCurso() + " (Modalidad: " + curso.getExtra() + ")");
        }
        System.out.println("--------------------------");
    }
}
