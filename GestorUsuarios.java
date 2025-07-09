import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios {

    public void mostrarUsuario(){
        System.out.println("Usuarios registrados.");
        try (BufferedReader reader = new BufferedReader(new FileReader("Usuarios.txt"))) {
            String linea;
            int contador = 1;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                System.out.println("Usuario " + contador + ":");
                System.out.println("→ Nombre: " + partes[0] + " | Correo: " + partes[1] + " | Código: " + partes[2]);
                System.out.println();
                contador++;
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo de usuarios: " + e.getMessage());
        }
    }

    public List<estudiantes> cargarUsuarios() {
        List<estudiantes> listaEstudiantes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Usuarios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    listaEstudiantes.add(new estudiantes(partes[0], partes[1], partes[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los usuarios: " + e.getMessage());
        }
        return listaEstudiantes;
    }

    public void listarUsuariosDisponibles() {
        List<estudiantes> usuariosDisponibles = cargarUsuarios();
        if (usuariosDisponibles.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        System.out.println("\n--- Usuarios Disponibles ---");
        for (int i = 0; i < usuariosDisponibles.size(); i++) {
            estudiantes estudiante = usuariosDisponibles.get(i);
            System.out.println((i + 1) + ". " + estudiante.getNombre() + " (" + estudiante.getCorreo() + ")");
        }
        System.out.println("----------------------------");
    }
}
