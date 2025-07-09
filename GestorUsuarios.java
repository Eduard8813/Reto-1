import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestorUsuarios {

    public void mostrarUsuario(){
        System.out.println("Usuarios registrados.");
        try (BufferedReader reader = new BufferedReader(new FileReader("Usuarios.txt"))) {
            String linea;
            int contador = 1;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                System.out.println("Usuario " + contador + ":");
                System.out.println("→ " + linea);
                System.out.println();
                contador++;

            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}
