import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gestorcursos {
    public void guardarCurso(cursos curso) {
        try (FileWriter writer = new FileWriter("cursos.txt", true)) {
            writer.write(curso.getDatos() + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public void mostrarCurso(cursos curso) {
        System.out.println(curso.getDatos());
    }

}
