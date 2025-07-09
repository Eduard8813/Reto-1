import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class regitrarUsuario {

        public estudiantes registrar(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Correo: ");
            String correo = sc.nextLine();

            String codigo = generarCodigo();
            System.out.println("Código generado: " + codigo);
            estudiantes u = new estudiantes(nombre, correo, codigo);
            guardarEnArchivo(u);
        return u;
        }

        public String generarCodigo(){
            String codigoResultado = "";

            for(int i = 0; i < 4 ; i++){
                int numero = (int)(Math.random() * 10);
                codigoResultado += numero;
            }

            for(int i = 0;i < 2; i++){
                char letra = (char)('A' + (int)(Math.random() * 26));
                codigoResultado += letra;
            }
            return codigoResultado;
        }

        private void guardarEnArchivo(estudiantes u){
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter("Usuarios.txt", true));
                writer.write(u.getNombre() + "," + u.getCorreo() + "," + u.getCodigo());
                writer.newLine();
                writer.close();
            }catch(IOException e ){
                System.out.println("Error al guardar" + e.getMessage());
            }
        }
}
