import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestorUsuarios {

    public void mostrarUsuario(){
        System.out.println("Usuarios registrados.");
        try (BufferedReader reader = new BufferedReader(new FileReader("Usuarios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if(partes.length == 3){
                    usuario u = new usuario(partes[0], partes[1], partes[2]);
                    System.out.println(u.getinfo());
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}
